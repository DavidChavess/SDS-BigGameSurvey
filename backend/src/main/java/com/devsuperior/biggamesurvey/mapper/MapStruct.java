package com.devsuperior.biggamesurvey.mapper;

import com.devsuperior.biggamesurvey.dto.GameDTO;
import com.devsuperior.biggamesurvey.entities.Game;
import org.mapstruct.Mapper;

@Mapper
public interface MapStruct {
    GameDTO gameToGameDTO(Game game);
}
