package com.vattanac.demo.learndemo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfiguration {

    @Bean("dataSource")
    @Profile("my-h2")
    public DataSource inMemoryDB(){
        EmbeddedDatabaseBuilder databaseBuilder = new EmbeddedDatabaseBuilder();
        databaseBuilder.setType(EmbeddedDatabaseType.H2);
        databaseBuilder.addScript("h2db/schema.sql");
       databaseBuilder.addScript("h2db/data.sql");

        return  databaseBuilder.build();
    }
}
