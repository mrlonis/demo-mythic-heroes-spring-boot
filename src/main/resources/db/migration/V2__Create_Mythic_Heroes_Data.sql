INSERT INTO MythicHeroes_Factions
    (FactionName, FactionImageUrl)
VALUES
    ('Luminarch', 'https://www.game.guide/wp-content/uploads/2021/09/Luminarch_Icon.png'),
    ('Shadowarch', 'https://www.game.guide/wp-content/uploads/2021/09/Shadowarch_Icon.png'),
    ('Guardian', 'https://www.game.guide/wp-content/uploads/2021/09/Guardian_Icon.png'),
    ('Verdian', 'https://www.game.guide/wp-content/uploads/2021/09/Verdian_Icon.png'),
    ('Luminarch & Shadowarch', 'https://www.game.guide/wp-content/uploads/2021/09/Luminarch_Shadowarch_Icon.png'),
    ('Shadowarch & Guardian', 'https://www.game.guide/wp-content/uploads/2021/10/Shadowarch_Guardian_Icon-150x150.png'),
    ('Guardian & Verdian', 'https://www.game.guide/wp-content/uploads/2021/09/Verdian_Guardian_Icon.png'),
    ('Luminarch & Verdian', '');

INSERT INTO MythicHeroes_Types
    (TypeName, TypeImageUrl)
VALUES
    ('Tank', 'https://www.game.guide/wp-content/uploads/2021/09/Tank_Icon.png'),
    ('Fighter', 'https://www.game.guide/wp-content/uploads/2021/09/Fighter_Icon.png'),
    ('Mage', 'https://www.game.guide/wp-content/uploads/2021/09/Mage_Icon_MH.png'),
    ('Support', 'https://www.game.guide/wp-content/uploads/2021/09/Support_Icon.png.webp');



INSERT INTO MythicHeroes_Heroes
    (FactionId, HeroName, HeroRarity, TypeId, HeroImageUrl)
VALUES
    ((SELECT FactionId from MythicHeroes_Factions WHERE FactionName='Luminarch & Shadowarch'),
    'Lucifer', 'UR', (SELECT TypeId from MythicHeroes_Types WHERE TypeName='Fighter'),
    'https://www.game.guide/wp-content/uploads/2021/09/Lucifer_Icon.png');