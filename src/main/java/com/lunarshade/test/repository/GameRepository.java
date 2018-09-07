package com.lunarshade.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lunarshade.test.entity.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {
    Game findByName(String name);
}
