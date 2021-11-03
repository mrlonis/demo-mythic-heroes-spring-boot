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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.UUID;

@Builder
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "MythicHeroes_Heroes")
public class MythicHero implements ProjectEntity, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "imageUrl")
    private String imageUrl;

    @Column(name = "factionId")
    private UUID factionId;

    @Column(name = "rarityId")
    private UUID rarityId;

    @Column(name = "typeId")
    private UUID typeId;

    @ManyToOne
    @JoinColumn(name = "factionId", referencedColumnName = "id", insertable = false, updatable = false, nullable = false)
    private Faction faction;

    @ManyToOne
    @JoinColumn(name = "rarityId", referencedColumnName = "id", insertable = false, updatable = false, nullable = false)
    private Rarity rarity;

    @ManyToOne
    @JoinColumn(name = "typeId", referencedColumnName = "id", insertable = false, updatable = false, nullable = false)
    private Type type;

}