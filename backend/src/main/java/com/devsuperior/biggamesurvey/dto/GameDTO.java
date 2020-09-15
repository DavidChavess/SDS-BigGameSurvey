package com.devsuperior.biggamesurvey.dto;

import com.devsuperior.biggamesurvey.entities.enums.Platform;

import java.io.Serializable;

public class GameDTO implements Serializable {

    private Long id;
    private String title;
    private Platform platform;

    public GameDTO(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }
}
