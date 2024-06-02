package com.example.jpaTutorial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpaTutorial.models.Player;
import com.example.jpaTutorial.services.PlayerService;

import java.util.List;

@RestController // è una specializzazione di Component
public class PlayersController {

    PlayerService playerService;

    public PlayersController(@Autowired PlayerService playerService) {
        this.playerService = playerService;
        System.out.println("Creazione playerController");
    }

    @GetMapping("/players")
    public List<Player> getAllPlayers() {
        /*
         * List<Player> players = new ArrayList<>();
         * players.add(new Player(1L, "dario", "civale", "inter"));
         * players.add(new Player(2L, "pippo", "franco", "inter"));
         * return players;
         */
        return playerService.getAllPlayers();

    }

    @GetMapping("/players/{id}")
    public Player getPlayerById(@PathVariable Long id) {
        return playerService.getPlayerById(id);

    }

    // curl -X POST http://localhost:8080/players -H "Content-Type:
    // application/json" -d
    // "{"""firstName""":"""ciro""","""lastName""":"""ferrata""","""team""":"""juventus""","""id""":4}"
    @PostMapping("/players")
    public void addPlayer(@RequestBody(required = false) Player player) {
        System.out.println(player.toString());
        playerService.addPlayer(player);
    }

    @RequestMapping(value = "/players/{id}", method = RequestMethod.PUT)
    public void updatePlayer(@PathVariable Long id, @RequestBody Player player) {
        playerService.updatePlayer(player);
    }

    @RequestMapping(value = "/players/{id}", method = RequestMethod.DELETE)
    public void deletePlayer(@PathVariable Long id) {
        playerService.deletePlayer(id);
    }

}
