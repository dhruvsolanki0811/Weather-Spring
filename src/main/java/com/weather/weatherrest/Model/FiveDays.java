package com.weather.weatherrest.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FiveDays {

    public City city;
    public List<OpenWeatherResponse> List;

}
