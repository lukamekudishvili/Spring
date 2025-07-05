package com.luka.code.OracleCRUDApp.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {

    @Bean
    @ConfigurationProperties("spring.datasource.xldr")
    public DataSourceProperties xldrDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    public DataSource xldrDataSource() {
        return xldrDataSourceProperties()
                .initializeDataSourceBuilder()
                .build();
    }

    @Bean
    public JdbcTemplate xldrJdbcTemplate() {
        return new JdbcTemplate(xldrDataSource());
    }

    @Bean
    public NamedParameterJdbcTemplate namedXldrJdbcTemplate() {
        return new NamedParameterJdbcTemplate(xldrDataSource());
    }
}
