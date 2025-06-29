package com.weatherSong.Controller;

import com.weatherSong.service.SmsService;
import com.weatherSong.service.SongPickerService;
import com.weatherSong.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class WeatherCheckScheduler {

    @Value("${weather.city.lattitude}")
    private String latitude;

    @Value("${weather.city.longitude}")
    private String longitude;

//    @Autowired
    private final WeatherService weatherService;

//    @Autowired
    private final SongPickerService songPickerService;

//    @Autowired
    private final SmsService smsService;

    public WeatherCheckScheduler(WeatherService weatherService, SongPickerService songPickerService, SmsService smsService) {
        this.weatherService = weatherService;
        this.songPickerService = songPickerService;
        this.smsService = smsService;
    }


    @Scheduled(fixedRate = 1500000)
    public void ScheduleNotification(){

        boolean isRaining = weatherService.isRaining(latitude,longitude);
        if(isRaining){
            String songMsg = songPickerService.todaySong();
            if(!songMsg.startsWith("Error")){
                smsService.sendMessage(songMsg);
            }

        }

    }

}
