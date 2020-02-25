# ssm
最基础的Spring+SpringMvc
Spring框架是有多个组件构建的，没有一个包是包含全部的，也没不应该有，需要常用的网站快速搭建可以直接使用Spring Boot
自己创建一个可以跑Controller的项目：
## 1.创建maven的典型web项目
File->new->Project->Maven 选择maven-archetype-webapp 新建一个项目
## 2.粘贴网站所需的spring framework的依赖
<!--spring组件-->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-core</artifactId>
      <version>4.3.11.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-webmvc</artifactId>
      <version>4.3.8.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-web</artifactId>
      <version>4.3.8.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-beans</artifactId>
      <version>4.3.11.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-context</artifactId>
      <version>4.3.11.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-aop</artifactId>
      <version>4.3.8.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-test</artifactId>
      <version>4.3.8.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-tx</artifactId>
      <version>4.3.8.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-tx</artifactId>
      <version>4.3.8.RELEASE</version>
    </dependency>
    <!--spring组件-->
## 3.配置spring容器
web.xml里配置一个容器设置实例XML
## 4.配置spring mvc 并启用mvc
web.xml里配置一个mvc servlet实例XML 记得启动mvc——在servlet实例XML里配置:
<mvc:annotation-driven/>
