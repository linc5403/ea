
# Table of Contents

1.  [使用Maven创建和部署Servlet项目](#org64bee70)
    1.  [创建项目](#org044791d)
    2.  [POM加入 `servlet` 依赖](#orgc329988)
    3.  [POM指定 `JRE` 版本](#orga2b77a4)
    4.  [实现自己的 `servlet` 代码](#orgeefd974)
    5.  [生成 `war` 文件](#org78d60b7)
    6.  [在Tomcat上部署](#org6a8f6fe)
        1.  [配置 `Tomcat` 管理用户名和密码](#org07926a6)
        2.  [启动或重启Tomcat](#org82b0a5c)
        3.  [在Maven中配置Tomcat的用户名和密码](#org3afac1c)
        4.  [在项目的POM文件中配置Tomcat的插件](#orgebd3083)
        5.  [部署或卸载应用](#orga9622fb)


<a id="org64bee70"></a>

# 使用Maven创建和部署Servlet项目


<a id="org044791d"></a>

## 创建项目

`mvn archetype:generate`

选则 `10 - webapp`, 一步步跟着提示填入 `GroupID` 和 `ArtifactID`,即可生成项目


<a id="orgc329988"></a>

## POM加入 `servlet` 依赖

    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>javax.servlet-api</artifactId>
      <version>4.0.1</version>
      <scope>provided</scope>
    </dependency>


<a id="orga2b77a4"></a>

## POM指定 `JRE` 版本

    <plugin>
        <artifactId>maven-compiler-plugin</artifactId>
        <configuration>
    	<source>11</source>
    	<target>11</target>
        </configuration>
    </plugin>


<a id="orgeefd974"></a>

## 实现自己的 `servlet` 代码

`src/main/java/club/banyuan/ServletDemo.java`

    @WebServlet("/servlet")
    public class ServletDemo extends HttpServlet{
    	private static final long serialVersionUID = 1L;
    
    	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    	resp.getWriter().append("Hello, servlet!");
        }
    }


<a id="org78d60b7"></a>

## 生成 `war` 文件

    mvn package

在 `target` 目录下可以看到新生成的war文件


<a id="org6a8f6fe"></a>

## 在Tomcat上部署


<a id="org07926a6"></a>

### 配置 `Tomcat` 管理用户名和密码

`conf/tomcat_users.xml`

    <role rolename="manager-gui"/>
    <role rolename="manager-script"/>
    <user username="admin" password="password" roles="manager-gui, manager-script"/>


<a id="org82b0a5c"></a>

### 启动或重启Tomcat

-   `bin/shutdown.sh`
-   `bin/starup.sh`


<a id="org3afac1c"></a>

### 在Maven中配置Tomcat的用户名和密码

`~/.m2/settings.xml`

    <server>
      <id>TomcatServer</id>
      <username>admin</username>
      <password>password</password>
    </server>

**注意: username 和 password 需要和Tomcat的conf文件中配置保持一致**


<a id="orgebd3083"></a>

### 在项目的POM文件中配置Tomcat的插件

`pom.xml`

    <plugin>
        <groupId>org.apache.tomcat.maven</groupId>
        <artifactId>tomcat7-maven-plugin</artifactId>
        <version>2.2</version>
        <configuration>
    	<url>http://localhost:8080/manager/text</url>
    	<server>TomcatServer</server>
    	<path>/myapp</path>
        </configuration>
    </plugin>

-   `<url>` 配置Tomcat的管理地址,你只需要注意IP和端口号是否需要改变,其余不动
-   `<server>` 和Maven `settings.xml` 中配置的 `<server> <id>` 保持一致
-   `<path>` `app` 运行在Tomcat上的路径


<a id="orga9622fb"></a>

### 部署或卸载应用

-   `mvn tomcat7:deploy`
-   `mvn tomcat7:redeploy`
-   `mvn tomcat7:undeploy`

