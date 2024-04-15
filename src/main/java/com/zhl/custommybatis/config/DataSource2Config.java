package com.zhl.custommybatis.config;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @author hailang.zhang
 * @since 2024-04-15
 */
@Configuration
@MapperScan(basePackages = "com.zhl.custommybatis.database.cramapper", sqlSessionFactoryRef = "sqlSessionFactory2")
public class DataSource2Config {

    @Bean(name = "dataSource2")
    @ConfigurationProperties(prefix = "spring.datasource.datasource2")
    public DataSource dataSource2() {
//        HikariDataSource hikariDataSource = new HikariDataSource();
//        hikariDataSource.setDriverClassName("oracle.jdbc.OracleDriver");
//        hikariDataSource.setJdbcUrl("jdbc:oracle:thin:@192.168.2.133:1521:zpdw");
//        hikariDataSource.setUsername("bpo_ronly");
//        hikariDataSource.setPassword("zhaopin");
        return DataSourceBuilder.create().build();
//                .driverClassName()
//                .url()
//                .username("bpo_ronly")
//                .password("zhaopin")
//                .build();
    }

    @Bean(name = "sqlSessionFactory2")
    public SqlSessionFactory sqlSessionFactory2(DataSource dataSource2) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource2);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:cramapper/*.xml"));
        return bean.getObject();
    }
}