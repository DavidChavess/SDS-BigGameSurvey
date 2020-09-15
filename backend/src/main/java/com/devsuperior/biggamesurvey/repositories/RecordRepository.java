package com.devsuperior.biggamesurvey.repositories;

import com.devsuperior.biggamesurvey.entities.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Long> {
}
