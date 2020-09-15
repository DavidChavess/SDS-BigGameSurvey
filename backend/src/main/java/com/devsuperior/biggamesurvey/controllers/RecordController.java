package com.devsuperior.biggamesurvey.controllers;

import com.devsuperior.biggamesurvey.dto.RecordDTO;
import com.devsuperior.biggamesurvey.dto.RecordInsertDTO;
import com.devsuperior.biggamesurvey.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
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
}
