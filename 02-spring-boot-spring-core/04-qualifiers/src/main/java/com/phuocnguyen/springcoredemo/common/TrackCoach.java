package com.phuocnguyen.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "This is track coach >>> daily workout";
    }
}
