CREATE EXTENSION pgcrypto;

CREATE TABLE MythicHeroes_Factions
(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name varchar(50) NOT NULL ,
    imageUrl varchar(200) ,
    CONSTRAINT MythicHeroes_Factions_Unique UNIQUE (id, name, imageUrl)
);

CREATE TABLE MythicHeroes_Rarities
(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name varchar(3) NOT NULL ,
    imageUrl varchar(200) ,
    CONSTRAINT MythicHeroes_Rarity_Unique UNIQUE (id, name, imageUrl)
);

CREATE TABLE MythicHeroes_Types
(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name varchar(15) NOT NULL ,
    imageUrl varchar(200) ,
    CONSTRAINT MythicHeroes_Types_Unique UNIQUE (id, name, imageUrl)
);

CREATE TABLE MythicHeroes_Heroes
(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name varchar(50) NOT NULL ,
    imageUrl varchar(200) ,
    factionId UUID NOT NULL ,
    rarityId UUID NOT NULL ,
    typeId UUID NOT NULL ,
    CONSTRAINT MythicHeroes_Heroes_UniqueHeroes UNIQUE (id, name, imageUrl, factionId, rarityId, typeId),
    CONSTRAINT MythicHeroes_Heroes_Faction_ForeignKey FOREIGN KEY (factionId) REFERENCES MythicHeroes_Factions (id),
    CONSTRAINT MythicHeroes_Heroes_Rarity_ForeignKey FOREIGN KEY (rarityId) REFERENCES MythicHeroes_Rarities (id),
    CONSTRAINT MythicHeroes_Heroes_Type_ForeignKey FOREIGN KEY (typeId) REFERENCES MythicHeroes_Types (id)
);
