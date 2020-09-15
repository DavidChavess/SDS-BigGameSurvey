package com.devsuperior.biggamesurvey.repositories;

import com.devsuperior.biggamesurvey.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
}
