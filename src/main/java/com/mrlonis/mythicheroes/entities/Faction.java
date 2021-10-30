package com.mrlonis.mythicheroes.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Builder
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "MythicHeroes_Factions")
public class Faction implements ProjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FactionId")
    private UUID factionId;

    @Column(name = "FactionName")
    private String factionName;

    @Column(name = "FactionImageUrl")
    private String factionImageUrl;
}
