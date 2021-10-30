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
public class MythicHeroes implements ProjectEntity, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HeroId")
    private UUID heroId;

    @Column(name = "FactionId")
    private UUID factionId;

    @Column(name = "HeroRarity")
    private String heroRarity;

    @Column(name = "HeroImageUrl")
    private String heroImageUrl;

    @Column(name = "HeroName")
    private String heroName;

    @Column(name = "TypeId")
    private UUID typeId;

    @ManyToOne
    @JoinColumn(name = "FactionId", referencedColumnName = "FactionId", insertable = false, updatable = false, nullable = false)
    private Faction heroFaction;

    @ManyToOne
    @JoinColumn(name = "TypeId", referencedColumnName = "TypeId", insertable = false, updatable = false, nullable = false)
    private Type heroType;

}
