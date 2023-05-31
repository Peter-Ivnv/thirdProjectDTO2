package com.IvanovPA.thirdProjectDTO.mapper;

import com.IvanovPA.thirdProjectDTO.entities.PLayerDto;
import com.IvanovPA.thirdProjectDTO.entities.Player;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PlayerMapper {
    PLayerDto mapToDto (Player player);
    List <PlayerDto>
}
