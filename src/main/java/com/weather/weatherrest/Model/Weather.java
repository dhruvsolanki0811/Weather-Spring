package com.weather.weatherrest.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Weather implements Serializable {
    public String Description;
    public String icon;

}
