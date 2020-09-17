package com.devsuperior.biggamesurvey.repositories;

import com.devsuperior.biggamesurvey.entities.Record;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.time.Instant;


@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {

    @Query(value = "SELECT obj FROM Record obj WHERE " +
            "( obj.moment BETWEEN ?1 AND ?2) OR " +
            "(coalesce(?1, null) IS NULL AND coalesce(?2, null) IS NULL)")
    Page<Record> findByMoments(Instant min, Instant max, Pageable p);
}
