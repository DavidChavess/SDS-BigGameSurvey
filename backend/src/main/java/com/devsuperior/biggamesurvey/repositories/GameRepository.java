package com.devsuperior.biggamesurvey.repositories;

import com.devsuperior.biggamesurvey.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
