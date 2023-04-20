package com.threepillar.dataExample.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Objects;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.threepillar.dataExample.store.repository", entityManagerFactoryRef = "storeEntityManagerFactory", transactionManagerRef = "storeTransactionManager")
public class StoreDatasourceConfig {
    @Bean
    @ConfigurationProperties("spring.datasource.store")
    public DataSourceProperties storeDatasourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.store.configuration")
    public DataSource storeDatasource() {
        return storeDatasourceProperties().initializeDataSourceBuilder().build();
    }

    @Bean(name = "storeEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean storeEntityManagerFactory(EntityManagerFactoryBuilder builder) {
        return builder.dataSource(storeDatasource()).packages("com.threepillar.dataExample.store.models").build();

    }

    @Bean(name = "storeTransactionManager")
    public PlatformTransactionManager todosTransactionManager(@Qualifier("storeEntityManagerFactory") LocalContainerEntityManagerFactoryBean storeEntityManagerFactory) {
        return new JpaTransactionManager(Objects.requireNonNull(storeEntityManagerFactory.getObject()));
    }
}
