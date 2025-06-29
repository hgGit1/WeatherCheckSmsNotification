package com.weatherSong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WeatherSongApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherSongApplication.class, args);
	}

}
