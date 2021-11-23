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
@Table(name = "MythicHeroes_RuneCombinations")
public class RuneCombinations implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "runeOneId")
    private UUID runeOneId;

    @Column(name = "runeTwoId")
    private UUID runeTwoId;

    @Column(name = "runeThreeId")
    private UUID runeThreeId;

    @Column(name = "runeFourId")
    private UUID runeFourId;

    @ManyToOne
    @JoinColumn(name = "runeOneId", referencedColumnName = "id", insertable = false, updatable = false, nullable = false)
    private Rune runeOne;

    @ManyToOne
    @JoinColumn(name = "runeTwoId", referencedColumnName = "id", insertable = false, updatable = false, nullable = false)
    private Rune runeTwo;

    @ManyToOne
    @JoinColumn(name = "runeThreeId", referencedColumnName = "id", insertable = false, updatable = false)
    private Rune runeThree;

    @ManyToOne
    @JoinColumn(name = "runeFourId", referencedColumnName = "id", insertable = false, updatable = false)
    private Rune runeFour;
}
