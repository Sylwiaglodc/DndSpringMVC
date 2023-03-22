package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dmacc.beans.Player;

public interface PlayerRepository extends JpaRepository<Player, Long>{

}
