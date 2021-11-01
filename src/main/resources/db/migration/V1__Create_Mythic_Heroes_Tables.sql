CREATE EXTENSION pgcrypto;

CREATE TABLE MythicHeroes_Factions
(
    FactionId UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    FactionName varchar(50) NOT NULL ,
    FactionImageUrl varchar(200) ,
    CONSTRAINT MythicHeroes_Factions_Unique UNIQUE (FactionId, FactionName, FactionImageUrl)
);

CREATE TABLE MythicHeroes_Rarities
(
    RarityId UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    RarityName varchar(3) NOT NULL ,
    RarityImageUrl varchar(200) ,
    CONSTRAINT MythicHeroes_Rarity_Unique UNIQUE (RarityId, RarityName, RarityImageUrl)
);

CREATE TABLE MythicHeroes_Types
(
    TypeId UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    TypeName varchar(15) NOT NULL ,
    TypeImageUrl varchar(200) ,
    CONSTRAINT MythicHeroes_Types_Unique UNIQUE (TypeId, TypeName, TypeImageUrl)
);

CREATE TABLE MythicHeroes_Heroes
(
    HeroId UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    HeroName varchar(50) NOT NULL ,
    HeroImageUrl varchar(200) ,
    FactionId UUID NOT NULL ,
    RarityId UUID NOT NULL ,
    TypeId UUID NOT NULL ,
    CONSTRAINT MythicHeroes_Heroes_UniqueHeroes UNIQUE (HeroId, HeroName, HeroImageUrl, FactionId, RarityId, TypeId),
    CONSTRAINT MythicHeroes_Heroes_Faction_ForeignKey FOREIGN KEY (FactionId) REFERENCES MythicHeroes_Factions (FactionId),
    CONSTRAINT MythicHeroes_Heroes_Rarity_ForeignKey FOREIGN KEY (RarityId) REFERENCES MythicHeroes_Rarities (RarityId),
    CONSTRAINT MythicHeroes_Heroes_Type_ForeignKey FOREIGN KEY (TypeId) REFERENCES MythicHeroes_Types (TypeId)
);
