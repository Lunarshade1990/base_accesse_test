package com.lunarshade.test.service;

import java.util.List;

import com.lunarshade.test.entity.Game;

public interface GameService {

    Game addGame(Game game);
    void delete(Integer id);
    Game editGame(Game game);
    List<Game> getAll();
    Game findByName(String name);

}
