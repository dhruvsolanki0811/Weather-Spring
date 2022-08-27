package com.weather.weatherrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class WeatherrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherrestApplication.class, args);
	}
//First commit check
}
