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
    ('Tank', 'https://www.game.guide/wp-content/uploads/2021/09/Tank_Icon.png),
    ('Fighter', 'https://www.game.guide/wp-content/uploads/2021/09/Fighter_Icon.png'),
    ('Mage', 'https://www.game.guide/wp-content/uploads/2021/09/Mage_Icon_MH.png'),
    ('Support', 'https://www.game.guide/wp-content/uploads/2021/09/Support_Icon.png.webp');



INSERT INTO MythicHeroes_Heroes
    (FactionId, HeroRarity, HeroImageUrl, HeroName, TypeId, ClassId, RoleId)
VALUES
    (1, 'Ascended', 'https://static.wikia.nocookie.net/afk-arena/images/3/31/Uhlan.jpg', 'Estrilda - Knight Of Valor', 1, 1, 1),
    (1, 'Ascended', 'https://static.wikia.nocookie.net/afk-arena/images/b/b6/Priest.jpg', 'Belinda - Beam Of Hope', 2, 2, 2),
    (1, 'Ascended', 'https://static.wikia.nocookie.net/afk-arena/images/2/29/NBH2.jpg', 'Raine - Death''s Denier', 3, 3, 3),
    (1, 'Ascended', 'https://static.wikia.nocookie.net/afk-arena/images/0/0a/Rosaline.jpg', 'Rosaline - The Kind', 2, 3, 3),
    (1, 'Ascended', 'https://static.wikia.nocookie.net/afk-arena/images/c/c6/OK.jpg', 'Lucius - Lightbringer', 1, 4, 4),
    (1, 'Ascended', 'https://static.wikia.nocookie.net/afk-arena/images/1/19/SwordMaster.jpg', 'Thane - The Exalted', 3, 5, 5),
    (1, 'Ascended', 'https://static.wikia.nocookie.net/afk-arena/images/c/c5/DevilHunter.jpg', 'Fawkes - Death''s Defeat', 3, 5, 6),
    (1, 'Ascended', 'https://static.wikia.nocookie.net/afk-arena/images/b/b7/GK.jpg', 'Hendrik - The Defender', 1, 4, 7),
    (1, 'Ascended', 'https://static.wikia.nocookie.net/afk-arena/images/f/fd/Rowan_Icon.png', 'Rowan - The Roamer', 2, 3, 3),
    (1, 'Ascended', 'https://static.wikia.nocookie.net/afk-arena/images/f/f4/Longbow.jpg', 'Gwyneth - The Fair Maiden', 1, 5, 8),
    (1, 'Ascended', 'https://static.wikia.nocookie.net/afk-arena/images/3/39/Wino.jpg', 'Rigby - The Brewmaster', 1, 1, 7),
    (1, 'Ascended', 'https://static.wikia.nocookie.net/afk-arena/images/2/28/NunAssassin.jpg', 'Cecilia - Purger of Sins', 3, 5, 5),
    (1, 'Ascended', 'https://static.wikia.nocookie.net/afk-arena/images/9/97/HouseKeeper.jpg', 'Oscar - The True Gentleman', 3, 5, 5),
    (1, 'Ascended', 'https://static.wikia.nocookie.net/afk-arena/images/5/59/Eluard-Icon.jpg', 'Eluard - Protector of Souls', 2, 2, 2),
    (1, 'Ascended', '', 'Peggy - The Precious Pearl', 2, 3, 4);