CREATE EXTENSION pgcrypto;

CREATE TABLE MythicHeroes_Factions
(
    id       UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name     varchar(50) NOT NULL,
    imageUrl varchar(200),
    CONSTRAINT MythicHeroes_Factions_Unique UNIQUE (id, name, imageUrl)
);

CREATE TABLE MythicHeroes_Rarities
(
    id       UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name     varchar(3) NOT NULL,
    imageUrl varchar(200),
    CONSTRAINT MythicHeroes_Rarity_Unique UNIQUE (id, name, imageUrl)
);

CREATE TABLE MythicHeroes_Types
(
    id       UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name     varchar(15) NOT NULL,
    imageUrl varchar(200),
    CONSTRAINT MythicHeroes_Types_Unique UNIQUE (id, name, imageUrl)
);

CREATE TABLE MythicHeroes_Artifacts
(
    id   UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name varchar(50) NOT NULL,
    CONSTRAINT MythicHeroes_Artifacts_Unique UNIQUE (id, name)
);

CREATE TABLE MythicHeroes_Runes
(
    id   UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name varchar(15) NOT NULL,
    CONSTRAINT MythicHeroes_Runes_Unique UNIQUE (id, name)
);

CREATE TABLE MythicHeroes_RuneCombinations
(
    id          UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name        varchar(50) NOT NULL,
    runeOneId   UUID        NOT NULL,
    runeTwoId   UUID        NOT NULL,
    runeThreeId UUID,
    runeFourId  UUID,
    CONSTRAINT MythicHeroes_RuneCombinations_Unique UNIQUE (id, name),
    CONSTRAINT MythicHeroes_RuneCombinations_Unique_RuneOne_ForeignKey FOREIGN KEY (runeOneId) REFERENCES MythicHeroes_Runes (id),
    CONSTRAINT MythicHeroes_RuneCombinations_Unique_RuneTwo_ForeignKey FOREIGN KEY (runeTwoId) REFERENCES MythicHeroes_Runes (id),
    CONSTRAINT MythicHeroes_RuneCombinations_Unique_RuneThree_ForeignKey FOREIGN KEY (runeThreeId) REFERENCES MythicHeroes_Runes (id),
    CONSTRAINT MythicHeroes_RuneCombinations_Unique_RuneFour_ForeignKey FOREIGN KEY (runeFourId) REFERENCES MythicHeroes_Runes (id)
);

CREATE TABLE MythicHeroes_Heroes
(
    id        UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name      varchar(50) NOT NULL,
    imageUrl  varchar(200),
    factionId UUID        NOT NULL,
    rarityId  UUID        NOT NULL,
    typeId    UUID        NOT NULL,
    CONSTRAINT MythicHeroes_Heroes_UniqueHeroes UNIQUE (name),
    CONSTRAINT MythicHeroes_Heroes_Faction_ForeignKey FOREIGN KEY (factionId) REFERENCES MythicHeroes_Factions (id),
    CONSTRAINT MythicHeroes_Heroes_Rarity_ForeignKey FOREIGN KEY (rarityId) REFERENCES MythicHeroes_Rarities (id),
    CONSTRAINT MythicHeroes_Heroes_Type_ForeignKey FOREIGN KEY (typeId) REFERENCES MythicHeroes_Types (id)
);
