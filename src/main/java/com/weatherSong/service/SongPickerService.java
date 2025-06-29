package com.weatherSong.service;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class SongPickerService {

    public String todaySong(){
        int dayofMonth=0;
        SimpleDateFormat ft
                = new SimpleDateFormat("dd-MM-yyyy");

        String str = ft.format(new Date());
        if(str.startsWith("0")){
            dayofMonth=Integer.parseInt(str.substring(1,2));
        } else{
            dayofMonth=Integer.parseInt(str.substring(0,2));
        }
        String song = fetchSongFromFile(dayofMonth);
        String songMsg = null;
        if(song.startsWith("Error")){
            songMsg = song;
        } else{
            String[] songAndName = song.split(";");
            songMsg = "It's raining! Here's a romantic song for you 💕: "+songAndName[0];
        }

        return songMsg;
    }

    private String fetchSongFromFile(int dayofMonth) {
        String fileName="SongList.txt";

        try (InputStream is = getClass().getClassLoader().getResourceAsStream(fileName);
             BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {

            String line;
            int currentLine = 0;

            while ((line = reader.readLine()) != null) {
                currentLine++;
                if (currentLine == dayofMonth) {
                    return line;
                }
            }
            return "Error Song not found for date";

        } catch (Exception e) {
            e.printStackTrace();
            return "Error while reading file: " + e.getMessage();
        }
    }
}
