package com.devsuperior.biggamesurvey.controller;

import com.devsuperior.biggamesurvey.dto.GameDTO;
import com.devsuperior.biggamesurvey.mapper.MapStruct;
import com.devsuperior.biggamesurvey.repositories.GameRepository;
import com.devsuperior.biggamesurvey.service.GameService;
import org.mapstruct.factory.Mappers;
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
    public List<GameDTO> getById(){
        return service.findAll();
    }
}
