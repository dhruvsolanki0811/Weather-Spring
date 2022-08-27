package com.weather.weatherrest.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class OpenWeatherResponse implements Serializable {
    List<Weather> weather;
    public Main main;
    public String name;
}
