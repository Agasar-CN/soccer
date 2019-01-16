package nchu.software.soccer.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

@Configuration
@MapperScan("nchu.software.soccer.dao")
public class DataSourceConfiguration {
    @Value("${jdbc.driver}")
    private String jdbcDriver;
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.username}")
    private String jdbcUsername;
    @Value("${jdbc.password}")
    private String jdbcPassword;

    @Bean(name="datasource")
    public DruidDataSource createDataSource() {
       DruidDataSource dataSource=new DruidDataSource();
       dataSource.setDriverClassName(jdbcDriver);
       dataSource.setUrl(jdbcUrl);
       dataSource.setUsername(jdbcUsername);
       dataSource.setPassword(jdbcPassword);
       return dataSource;
    }
}
