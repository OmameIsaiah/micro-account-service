package com.micro.account.service.config;

import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionConfig;
import com.hazelcast.config.MapConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazelCastConfig {
    @Bean
    public Config hazelCastConfiguration() throws InstantiationException, IllegalAccessException {
        MapConfig mapConfig = new MapConfig();
        mapConfig.setName("account");
        mapConfig.setEvictionConfig(EvictionConfig.class.newInstance());
        mapConfig.setTimeToLiveSeconds(200);

        Config config = new Config();
        config.setInstanceName("hazelcast-instance");
        config.addMapConfig(mapConfig);
        return config;
    }
}
