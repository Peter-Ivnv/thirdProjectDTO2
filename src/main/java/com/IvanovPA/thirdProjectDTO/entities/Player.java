package com.IvanovPA.thirdProjectDTO.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table (name = "players")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Player extends BaseEntity{
    private String name;
    private String surname;
    private String club;
    private int idNumber;
}
