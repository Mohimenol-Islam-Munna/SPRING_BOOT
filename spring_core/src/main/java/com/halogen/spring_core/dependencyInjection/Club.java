package com.halogen.spring_core.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class Club {
    public String name = "Barcelona";
    public String city;
    public String country;
    public int trophy;

    // public Club() {
    //     System.out.println("club object initiated");
    // }

    public Club(String name, String city, String country) {
        this.name = name;
        this.city = city;
        this.country = country;
    }

    public void setTrophy(int count) {
        trophy = count;
    }

}
