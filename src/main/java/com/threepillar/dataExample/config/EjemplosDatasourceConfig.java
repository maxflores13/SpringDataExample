package com.threepillar.dataExample.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Objects;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.threepillar.dataExample.ejemplos.repository",
entityManagerFactoryRef = "ejemplosEntityManagerFactory",
transactionManagerRef = "ejemplosTransactionManager")
public class EjemplosDatasourceConfig {
    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource")
    public DataSourceProperties ejemplosDatasourceProperties(){
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource.configuration")
    public DataSource ejemplosDatasource(){
        return ejemplosDatasourceProperties().initializeDataSourceBuilder().build();
    }

    @Bean(name = "ejemplosEntityManagerFactory")
    @Primary
    public LocalContainerEntityManagerFactoryBean ejemplosEntityManagerFactory(EntityManagerFactoryBuilder builder){
        return builder.dataSource(ejemplosDatasource()).packages("com.threepillar.dataExample.ejemplos.models").build();

    }

    @Bean(name = "ejemplosTransactionManager")
    @Primary
    public PlatformTransactionManager ejemplosTransactionManager(
            @Qualifier("ejemplosEntityManagerFactory") LocalContainerEntityManagerFactoryBean ejemplosEntityManagerFactory) {
        return new JpaTransactionManager(Objects.requireNonNull(ejemplosEntityManagerFactory.getObject()));
    }
}
