package com.devsuperior.biggamesurvey.services;

import com.devsuperior.biggamesurvey.dto.RecordDTO;
import com.devsuperior.biggamesurvey.dto.RecordInsertDTO;
import com.devsuperior.biggamesurvey.entities.Game;
import com.devsuperior.biggamesurvey.entities.Record;
import com.devsuperior.biggamesurvey.mapper.MapStruct;
import com.devsuperior.biggamesurvey.repositories.GameRepository;
import com.devsuperior.biggamesurvey.repositories.RecordRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

import static java.lang.Integer.MAX_VALUE;

@Service
public class RecordService {

    private MapStruct mapper = Mappers.getMapper(MapStruct.class);

    @Autowired
    private RecordRepository repository;

    @Autowired
    private GameRepository gameRepository;


    public RecordDTO insert(RecordInsertDTO dto) {
        Record recordEntity = new Record();

        recordEntity.setId(null);
        recordEntity.setMoment(Instant.now());
        recordEntity.setName(dto.getName());
        recordEntity.setAge(dto.getAge());

        Game game = gameRepository.getOne(dto.getGameId());
        recordEntity.setGame(game);

        return mapper.recordToRecordDTO(repository.save(recordEntity));
    }

    public Page<RecordDTO> findByMoments(Instant minDate, Instant maxDate, Pageable page) {
            return repository.findByMoments(minDate, maxDate, page)
                    .map(mapper::recordToRecordDTO);
    }
}
