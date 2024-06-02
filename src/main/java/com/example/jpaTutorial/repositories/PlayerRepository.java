package com.example.jpaTutorial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpaTutorial.models.Player;

@Repository // è una specializzazione di Component
public interface PlayerRepository extends JpaRepository<Player, Long> {

}
