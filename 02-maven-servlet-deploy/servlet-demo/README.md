
# Table of Contents

1.  [使用Maven创建和部署Servlet项目](#orgfa3e7d0)
    1.  [创建项目](#orgbc0323b)
    2.  [POM加入 `servlet` 依赖](#orgdb6e410)
    3.  [POM指定 `JRE` 版本](#orga6a9713)
    4.  [实现自己的 `servlet` 代码](#org0bc56fa)
    5.  [生成 `war` 文件](#org4934fbd)
    6.  [在Tomcat上部署](#orgfece892)
        1.  [配置 `Tomcat` 管理用户名和密码](#orgced7679)
        2.  [启动或重启Tomcat](#orgd53be20)
        3.  [在Maven中配置Tomcat的用户名和密码](#org4669e74)
        4.  [在项目的POM文件中配置Tomcat的插件](#orgc3cc85e)
        5.  [在DD文件中(web.xml)配置servlet映射关系](#org59ae8ee)
        6.  [部署或卸载应用](#org2e5e3f6)


<a id="orgfa3e7d0"></a>

# 使用Maven创建和部署Servlet项目


<a id="orgbc0323b"></a>

## 创建项目

`mvn archetype:generate`

选则 `10 - webapp`, 一步步跟着提示填入 `GroupID` 和 `ArtifactID`,即可生成项目


<a id="orgdb6e410"></a>

## POM加入 `servlet` 依赖

    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>javax.servlet-api</artifactId>
      <version>4.0.1</version>
      <scope>provided</scope>
    </dependency>


<a id="orga6a9713"></a>

## POM指定 `JRE` 版本

    <plugin>
        <artifactId>maven-compiler-plugin</artifactId>
        <configuration>
    	<source>11</source>
    	<target>11</target>
        </configuration>
    </plugin>


<a id="org0bc56fa"></a>

## 实现自己的 `servlet` 代码

`src/main/java/club/banyuan/ServletDemo.java`

    public class ServletDemo extends HttpServlet{
    	private static final long serialVersionUID = 1L;
    
    	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    	resp.setContentType("text/html;charset=utf-8");
    	PrintWriter out = resp.getWriter();
    	out.println("<html>" +
    		"<body>" +
    		"<h1 align=center> 这是你手写的Servlet </h1>" +
    		"今天是4月22日" +
    		"</body>" + "<html>");
        }
    }


<a id="org4934fbd"></a>

## 生成 `war` 文件

    mvn package

在 `target` 目录下可以看到新生成的war文件


<a id="orgfece892"></a>

## 在Tomcat上部署


<a id="orgced7679"></a>

### 配置 `Tomcat` 管理用户名和密码

`conf/tomcat_users.xml`

    <role rolename="manager-gui"/>
    <role rolename="manager-script"/>
    <user username="admin" password="password" roles="manager-gui, manager-script"/>


<a id="orgd53be20"></a>

### 启动或重启Tomcat

-   `bin/shutdown.sh`
-   `bin/starup.sh`


<a id="org4669e74"></a>

### 在Maven中配置Tomcat的用户名和密码

`~/.m2/settings.xml`

    <server>
      <id>TomcatServer</id>
      <username>admin</username>
      <password>password</password>
    </server>

**注意: username 和 password 需要和Tomcat的conf文件中配置保持一致**


<a id="orgc3cc85e"></a>

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


<a id="org59ae8ee"></a>

### 在DD文件中(web.xml)配置servlet映射关系

    <servlet>
        <servlet-name>my-1st-servlet</servlet-name>
        <servlet-class>club.banyuan.ServletDemo</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>my-1st-servlet</servlet-name>
        <url-pattern>/aaa</url-pattern>
    </servlet-mapping>


<a id="org2e5e3f6"></a>

### 部署或卸载应用

-   `mvn tomcat7:deploy`
-   `mvn tomcat7:redeploy`
-   `mvn tomcat7:undeploy`

