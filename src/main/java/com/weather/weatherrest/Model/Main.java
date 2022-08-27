package com.weather.weatherrest.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Main implements Serializable {
    public int temp;
    public String Pressure;
    public String Humidity;
}
