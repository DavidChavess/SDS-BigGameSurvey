package com.devsuperior.biggamesurvey.controllers;

import com.devsuperior.biggamesurvey.dto.FindRecordDTO;
import com.devsuperior.biggamesurvey.dto.RecordDTO;
import com.devsuperior.biggamesurvey.dto.RecordInsertDTO;
import com.devsuperior.biggamesurvey.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( value = "/records")
public class RecordController {

    @Autowired
    private RecordService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RecordDTO insert(@RequestBody RecordInsertDTO recordInsertDTO){
        return service.insert(recordInsertDTO);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Page<RecordDTO> findAll(FindRecordDTO find) {
        Pageable page = PageRequest.of(find.getPage(), find.getLinesPerPage(), find.getDirection(), find.getOrderBy());
        return service.findByMoments(find.getMinDate(), find.getMaxDate(), page);
    }
}
