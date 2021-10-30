CREATE EXTENSION pgcrypto;

CREATE TABLE MythicHeroes_Factions
(
    FactionId UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    FactionName varchar(50) NOT NULL ,
    FactionImageUrl varchar(200) ,
    CONSTRAINT MythicHeroes_Factions_Unique UNIQUE (FactionId, FactionName, FactionImageUrl)
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
    FactionId UUID NOT NULL ,
    HeroRarity varchar(25) NOT NULL ,
    HeroImageUrl varchar(200) ,
    HeroName varchar(50) NOT NULL ,
    TypeId UUID NOT NULL ,
    ClassId UUID NOT NULL ,
    RoleId UUID NOT NULL ,
    CONSTRAINT MythicHeroes_Heroes_UniqueHeroes UNIQUE (HeroId, HeroRarity, HeroName),
    CONSTRAINT MythicHeroes_Heroes_Faction_ForeignKey FOREIGN KEY (FactionId) REFERENCES MythicHeroes_Factions (FactionId),
    CONSTRAINT MythicHeroes_Heroes_Type_ForeignKey FOREIGN KEY (TypeId) REFERENCES MythicHeroes_Types (TypeId),
    CONSTRAINT MythicHeroes_Heroes_Class_ForeignKey FOREIGN KEY (ClassId) REFERENCES MythicHeroes_Classes (ClassId),
    CONSTRAINT MythicHeroes_Heroes_Role_ForeignKey FOREIGN KEY (RoleId) REFERENCES MythicHeroes_Roles (RoleId)
);
