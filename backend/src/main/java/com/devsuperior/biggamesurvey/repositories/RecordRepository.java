package com.devsuperior.biggamesurvey.repositories;

import com.devsuperior.biggamesurvey.entities.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {
}
