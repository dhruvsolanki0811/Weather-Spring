package com.weather.weatherrest.Controller;

import com.weather.weatherrest.Model.OpenWeatherResponse;
import com.weather.weatherrest.Model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class WeatherController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = {"","/weather"})
    public String Home(Model model){
        String uri="https://api.openweathermap.org/data/2.5/weather?q=Mumbai&appid=d0f0af2cc00cf5396f3c216247eb9fdb";
        ResponseEntity<OpenWeatherResponse> currentWeatherResponseEntity = restTemplate.getForEntity(uri, OpenWeatherResponse.class);
        System.out.println(currentWeatherResponseEntity.getBody().getMain());
        List<Weather> weathers = currentWeatherResponseEntity.getBody().getWeather();
        currentWeatherResponseEntity.getBody().getMain().setTemp(currentWeatherResponseEntity.getBody().getMain().getTemp()-273);
        model.addAttribute("name",currentWeatherResponseEntity.getBody().getName());
        model.addAttribute("main",currentWeatherResponseEntity.getBody().getMain());
        model.addAttribute("weather",weathers.get(0));
        return "home.html";
    }






}
