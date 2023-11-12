package com.halogen.spring_core.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;

public class Player {
    public String name;
    public String country;
    public int ballon_d_or;
    public Club clubInfo;

    @Autowired
    public Player(Club clubInfo) {
        this.clubInfo = clubInfo;
    }

    // public Player(String name, String country) {
    //     this.name = name;
    //     this.country = country;
    // }

    public void setBallon_d_or(int count) {
        ballon_d_or = count;
    }

    public void setClubInfo(Club club) {
        clubInfo = club;
    }
}
