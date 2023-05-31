package com.IvanovPA.thirdProjectDTO.repositories;

import com.IvanovPA.thirdProjectDTO.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
