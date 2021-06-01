//package com.example.demodata.config.atomikos;
//
///**
// * @ClassName: AccountDataSourceConfig
// * @Author: liuzuncai
// * @Description:
// * @Date: 2021/2/24 10:09
// * @Version: 1.0
// */
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//
//import javax.sql.DataSource;
//
//@Configuration
//@MapperScan(basePackages = { "com.example.demodata.dal.dao" }, sqlSessionFactoryRef = "accountSqlSessionFactory")
//public class AccountDataSourceConfig {
//
//    public static final String MAPPER_XML_LOCATION = "classpath*:/mapper/account/*.xml";
//
//    @Autowired
//    @Qualifier("accountDataSource")
//    private DataSource accountDataSource;
//
//    @Bean
//    public SqlSessionTemplate accountSqlSessionTemplate() throws Exception {
//        return new SqlSessionTemplate(accountSqlSessionFactory());
//    }
//
//    @Bean
//    public SqlSessionFactory accountSqlSessionFactory() throws Exception {
//        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//        factoryBean.setDataSource(accountDataSource);
//        factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MAPPER_XML_LOCATION));
//        return factoryBean.getObject();
//    }
//}
