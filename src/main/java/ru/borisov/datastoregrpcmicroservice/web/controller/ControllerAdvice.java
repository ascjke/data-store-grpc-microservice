package ru.borisov.datastoregrpcmicroservice.web.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.borisov.datastoregrpcmicroservice.model.exceptiion.SensorNotFoundException;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(SensorNotFoundException.class)
    public String sensorNotFound(SensorNotFoundException e) {

        return "Sensor not found";
    }

    @ExceptionHandler
    public String server(Exception e) {

        e.printStackTrace();
        return "Internal server error";
    }
}
