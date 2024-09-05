package com.vladproductions.playersdocapiswagger.repository;

import com.vladproductions.playersdocapiswagger.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlayerRepository extends JpaRepository<Player, Long> {

    Optional<Player> findByEmail(String email);


}
