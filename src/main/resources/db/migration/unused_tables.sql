CREATE TABLE MythicHeroes_Classes
(
    ClassId UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    ClassName varchar(15) NOT NULL ,
    ClassImageUrl varchar(200) ,
    CONSTRAINT MythicHeroes_Classes_Unique UNIQUE (ClassId, ClassName, ClassImageUrl)
);

CREATE TABLE MythicHeroes_Roles
(
    RoleId UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    RoleName varchar(25) NOT NULL ,
    RoleImageUrl varchar(200) ,
    CONSTRAINT MythicHeroes_Roles_Unique UNIQUE (RoleId, RoleName, RoleImageUrl)
);