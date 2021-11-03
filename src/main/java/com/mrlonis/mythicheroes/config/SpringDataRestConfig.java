package com.mrlonis.mythicheroes.config;

import com.mrlonis.mythicheroes.entities.Faction;
import com.mrlonis.mythicheroes.entities.MythicHero;
import com.mrlonis.mythicheroes.entities.Rarity;
import com.mrlonis.mythicheroes.entities.Type;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Component
public class SpringDataRestConfig implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(MythicHero.class);
        config.exposeIdsFor(Faction.class);
        config.exposeIdsFor(Rarity.class);
        config.exposeIdsFor(Type.class);

    }
}
