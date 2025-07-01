package com.weatherSong.service;

import com.weatherSong.model.WeatherEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherService {
    //Hit the API to ftech the weather at particular time

    @Value("${weather.api.url}")
    private String weatherApi;

    @Value(("${weather.api.key}"))
    private String apiKey;
    private  final RestTemplate restTemplate = new RestTemplate();

    public boolean isRaining(String city) {

        String weatherApiNewWithKey = weatherApi.replace("APIKEY",apiKey);
        String finalApiWithKeyCity = weatherApiNewWithKey.replace("City",city);
        ResponseEntity<WeatherEntity> currentWeather = restTemplate.exchange(finalApiWithKeyCity, HttpMethod.GET, null, WeatherEntity.class);
        String conditionText = currentWeather.getBody().getCurrent().getCondition().getText();
        if (conditionText != null && conditionText.toLowerCase().contains("rain")) {
            return true;
        }
        return false;
    }
}
