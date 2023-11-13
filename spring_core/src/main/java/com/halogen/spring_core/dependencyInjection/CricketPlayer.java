package com.halogen.spring_core.dependencyInjection;

public class CricketPlayer implements Player {
    public String name;

    public CricketPlayer(String name) {
        this.name = name;
    }

    @Override
    public void playerName() {
        this.name = "munna";
    }

}
