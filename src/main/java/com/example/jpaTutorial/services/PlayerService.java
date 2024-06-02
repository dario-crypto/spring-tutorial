package com.example.jpaTutorial.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.jpaTutorial.models.Player;

@Service // è una specializzazione di Component
public interface PlayerService {

    public List<Player> getAllPlayers();

    public Player getPlayerById(Long id);

    public void addPlayer(Player player);

    public void updatePlayer(Player player);

    public void deletePlayer(Long id);

}
