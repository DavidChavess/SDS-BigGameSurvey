package com.devsuperior.biggamesurvey.controllers;

import com.devsuperior.biggamesurvey.dto.GameDTO;
import com.devsuperior.biggamesurvey.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( value = "/games")
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GameDTO> findAll(){
        return service.findAll();
    }
}
