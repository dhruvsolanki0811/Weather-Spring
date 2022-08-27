package com.weather.weatherrest.Controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.weather.weatherrest.Model.FiveDays;
import com.weather.weatherrest.Model.OpenWeatherResponse;
import com.weather.weatherrest.Model.Weather;
import com.weather.weatherrest.Model.Main;

import com.weather.weatherrest.Services.WeatherServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

@Controller
public class WeatherController {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    WeatherServices weatherServices;

    @RequestMapping(value = {"","/weather","/home"})
    public String Home(Model model){
        String uri="https://api.openweathermap.org/data/2.5/weather?q=russia&appid=d0f0af2cc00cf5396f3c216247eb9fdb";
        ResponseEntity<OpenWeatherResponse> currentWeatherResponseEntity = restTemplate.getForEntity(uri, OpenWeatherResponse.class);
        System.out.println(currentWeatherResponseEntity.getBody().getMain());
        List<Weather> weathers = currentWeatherResponseEntity.getBody().getWeather();
        currentWeatherResponseEntity.getBody().getMain().setTemp(currentWeatherResponseEntity.getBody().getMain().getTemp()-273);
        model.addAttribute("name",currentWeatherResponseEntity.getBody().getName());
        model.addAttribute("main",currentWeatherResponseEntity.getBody().getMain());
        model.addAttribute("weather",weathers.get(0));
        return "home.html";
    }

    @RequestMapping(value = {"/five"})
    public String fivedays(Model model){
        String uri="https://api.openweathermap.org/data/2.5/forecast?q=russia&appid=d0f0af2cc00cf5396f3c216247eb9fdb";
        ResponseEntity<FiveDays> currentWeatherResponseEntity = restTemplate.getForEntity(uri,FiveDays.class);
        FiveDays fiveDays = currentWeatherResponseEntity.getBody();


        List<OpenWeatherResponse> list= fiveDays.getList();
        System.out.println(weatherServices.getTime());
        return "fivedays";
    }




}
