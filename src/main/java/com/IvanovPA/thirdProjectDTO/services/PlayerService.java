package com.IvanovPA.thirdProjectDTO.services;

import com.IvanovPA.thirdProjectDTO.entities.PLayerDto;
import com.IvanovPA.thirdProjectDTO.entities.Player;

import java.util.List;

public interface PlayerService {
    PLayerDto addPlayer (PLayerDto pLayerDto);
    List <PlayerDto> getAllPlayers();
    PLayerDto updatePlayer (PLayerDto updPlayerDto);
    void deletePlayer (Long id);

}
