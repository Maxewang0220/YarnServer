package com.example.yarnserver.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class HiveConfig {
    @Value("${Hive.url}")
    private String HIVE_URL;
    @Value("${Hive.driver}")
    private String HIVE_DRIVER;

    @Bean
    public Connection createHiveConnection() {
        Connection hiveConnection = null;
        try {
            hiveConnection = DriverManager.getConnection(HIVE_URL, "", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return hiveConnection;
    }
}
