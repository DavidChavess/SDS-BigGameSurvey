package com.devsuperior.biggamesurvey.repositories;

import com.devsuperior.biggamesurvey.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}
