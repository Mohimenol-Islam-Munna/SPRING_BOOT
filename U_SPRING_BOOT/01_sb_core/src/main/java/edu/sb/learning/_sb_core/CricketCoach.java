package edu.sb.learning._sb_core;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Daily cricket workout";
    }

}
