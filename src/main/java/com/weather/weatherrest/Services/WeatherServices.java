package com.weather.weatherrest.Services;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

@Service
public class WeatherServices {
    public String getTime(){
        LocalDateTime time = LocalDateTime.now();
        LocalDateTime lastQuarter = time.truncatedTo(ChronoUnit.HOURS).plusHours((time.getHour() / 3)*3);
        return "";
    }
}
