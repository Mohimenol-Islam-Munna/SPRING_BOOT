package edu.sb.learning._sb_core;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice 50 kick per day";
    }
}
