package com.example.jpaTutorial.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpaTutorial.models.Player;
import com.example.jpaTutorial.repositories.PlayerRepository;

@Service
public class PlayerServiceDb implements PlayerService {
    private PlayerRepository playerRepository;

    public PlayerServiceDb(@Autowired PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();

    }

    @Override
    public Player getPlayerById(Long id) {
        return playerRepository.findById(id).get();
    }

    @Override
    public void addPlayer(Player player) {
        playerRepository.save(player);
    }

    @Override
    public void updatePlayer(Player player) {
        playerRepository.save(player);
    }

    @Override
    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);

    }

}
