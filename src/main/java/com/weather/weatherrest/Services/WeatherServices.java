package com.weather.weatherrest.Services;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

@Service
public class WeatherServices {
    public  String getTime() {
        String hours;
        String format;
        Integer S = Math.round(LocalDateTime.now().getHour() / 3) * 3;

        if (S+3 >= 24) {
            hours = "00";

            format = "yyyy-MM-dd " +hours  + ":00:00";
        } else if ((S+3)<10) {
            hours = "0"+String.valueOf(S+3);
            format = "yyyy-MM-dd " +hours  + ":00:00";
        }else{
            hours= String.valueOf(S+3);
            format = "yyyy-MM-dd " +hours  + ":00:00";

        }
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(format));
    }
}
