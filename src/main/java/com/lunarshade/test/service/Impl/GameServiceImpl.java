package com.lunarshade.test.service.Impl;

import com.lunarshade.test.entity.Game;
import com.lunarshade.test.repository.GameRepository;
import com.lunarshade.test.service.GameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository gameRepository;

    @Override
    public Game addGame(Game game) {

        Game savedGame = gameRepository.saveAndFlush(game);
        return savedGame;
    }

    @Override
    public void delete(Integer id) {
        gameRepository.deleteById(id);
    }

    @Override
    public Game editGame(Game game) {
        return gameRepository.saveAndFlush(game);
    }

    @Override
    public List<Game> getAll() {
        return gameRepository.findAll();
    }

    @Override
    public Game findByName(String name) {
        return gameRepository.findByName(name);
    }
}
