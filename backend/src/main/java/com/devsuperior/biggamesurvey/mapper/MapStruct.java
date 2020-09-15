package com.devsuperior.biggamesurvey.mapper;

import com.devsuperior.biggamesurvey.dto.GameDTO;
import com.devsuperior.biggamesurvey.dto.RecordDTO;
import com.devsuperior.biggamesurvey.entities.Game;
import com.devsuperior.biggamesurvey.entities.Record;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper
public interface MapStruct {
    GameDTO gameToGameDTO(Game game);
    Game gameDTOToGame(GameDTO dto);

    @Mappings({
        @Mapping(source = "record.game.title", target = "gameTitle"),
        @Mapping(source = "record.game.platform", target = "gamePlatform"),
        @Mapping(source = "record.game.genre.name", target = "genreName")
    })
    RecordDTO recordToRecordDTO(Record record);
}
