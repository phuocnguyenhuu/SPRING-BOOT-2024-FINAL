package com.phuocnguyen.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice fase bowling for 15 minutes :-)";
    }
}
