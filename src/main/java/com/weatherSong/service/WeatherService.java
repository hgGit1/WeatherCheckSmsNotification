package com.weatherSong.service;

import com.weatherSong.model.WeatherEntity;
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

    private final String weatherApi="https://api.weatherapi.com/v1/current.json?q=latitude%2Clongitude&lang=en&key=APIKEY";
    private final String apiKey ="abcd";
    private  final RestTemplate restTemplate = new RestTemplate();

    public boolean isRaining(String lattitude, String longitude) {

//        String finalApiWithKey = weatherApi.replace("APIKEY",apiKey);
//        String finalApiWithKeyLatitude = finalApiWithKey.replace("latitude",lattitude);
//        String finalApiWithKeyLatitudeLongitude = finalApiWithKeyLatitude.replace("longitude",longitude);
        String weatherApiNew = "https://api.weatherapi.com/v1/current.json?q=City&lang=en&key=APIKEY";
        String weatherApiNewWithKey = weatherApiNew.replace("APIKEY",apiKey);
        String finalApiWithKeyLatitudeLongitude = weatherApiNewWithKey.replace("City","Mirzapur");
        ResponseEntity<WeatherEntity> currentWeather = restTemplate.exchange(finalApiWithKeyLatitudeLongitude, HttpMethod.GET, null, WeatherEntity.class);
        String conditionText = currentWeather.getBody().getCurrent().getCondition().getText();
        if (conditionText != null && conditionText.toLowerCase().contains("rain")) {
            return true;
        }
        return false;
    }
}
