package com.devsuperior.biggamesurvey.service;

import com.devsuperior.biggamesurvey.dto.GameDTO;
import com.devsuperior.biggamesurvey.mapper.MapStruct;
import com.devsuperior.biggamesurvey.repositories.GameRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    private MapStruct mapper = Mappers.getMapper(MapStruct.class);

    @Autowired
    private GameRepository repository;

    @Transactional(readOnly = true)
    public List<GameDTO> findAll()  {
        return repository.findAll().stream()
                .map(mapper::gameToGameDTO)
                .collect(Collectors.toList());
    }
}
