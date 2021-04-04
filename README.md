#SSM
```markdown
1). add jar
 spring spring-mvc mybatis mybatis-spring mysql druid log4j servlet-api jstl jackson
 
2). spring.xml
   1.open annotation-scan
   2.create DruidDataSource Bean
        inject driver url username password
   3.create SqlSessionFactory
        inject dataSource mapperLocaltions typeAliasesPackage
   4.create MapperScannerConfigure 
        inject sqlSessionFactoryBean DAO the basePackage 
   5.create DataSourceTransactionManager
        inject dataSource
   6.open tx:annotation-driven

3). spring-mvc.xml
   1.open annotation-scan
   2.configuration mvc:annotation-driver
   3.configuration mvc:default-servlet-handler
   4.configuration InternalResourceViewResolver
        inject prefix suffix
        
4). web.xml
   1.configuration DispatcherServlet init contextConfigLocation
   2.configuration CharacterEncodingFilter 
   


```