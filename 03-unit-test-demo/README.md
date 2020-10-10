
# Table of Contents

1.  [Spring Unit Test](#org82d4307)
    1.  [公共](#org6c56eba)
    2.  [Controller](#org36e551e)
    3.  [Service](#org61eb6ad)
    4.  [测试使用的资源文件配置](#org9cffdb9)


<a id="org82d4307"></a>

# Spring Unit Test


<a id="org6c56eba"></a>

## 公共

-   `@SpringBootTest`
    用在测试类上进行注解, 指定测试类使用SpringBoot的测试框架
-   `@Test`
    
    `import org.junit.jupiter.api.Test;`
    
    指定测试用例, 即测试类的方法


<a id="org36e551e"></a>

## Controller

通常情况下 `Controller` 主要负责路由, 参数解析等工作, 业务不太复杂, 因此实际工作中并非测试的重点.

-   `private MockMvc mvc;`
    
    使用 `MockMvc` 对MVC框架进行测试.

-   `@Before`
    
    构建 `Controller` 的实例, 为测试用例准备好条件. (业务代码的Controller是由IOC容器来生成)
    
        @Before
        public void setup() {
            this.mvc = MockMvcBuilders.standaloneSetup(new IndexController()).build();
        }

-   `this.mvc.perform`
    
    通过发送Request来获取Response, 验证Response是否符合预期.
    
        @Test
        public void showHomePage() throws Exception {
            this.mvc.perform(
        		get("/")
        		    .accept(MediaType.parseMediaType("application/html;charset=UTF-8")))
        	    .andExpect(status().isOk())
        	    .andExpect(content().contentType("application/html;charset=UTF-8"))
        	    .andExpect(content().string("Hello!"));
        }


<a id="org61eb6ad"></a>

## Service

Service层一般会依赖于Repository, 因此需要将Repository解耦.

-   `@MockBean`
    
    指定在测试用例中生成Bean, 而不是使用IOC容器中的Bean
    
        @MockBean
        private EmployDao employDao;

-   `import static org.mockito.BDDMockito.given;`
    
    使用BDDMockito的given方法构造Repository层的返回值
    
        @Test
        void findIdByName() {
            EmployBean zhangsan = new EmployBean("zhangsan", 20, 10);
        
            given(employDao.searchByName("zhangsan")).willReturn(zhangsan);
        
            Integer id = employService.findIdByName("zhangsan");
            Assertions.assertEquals(10, id);
        }


<a id="org9cffdb9"></a>

## 测试使用的资源文件配置

-   `@TestPropertySource(locations = "/application-test.yml")`

-   `@ActiveProfiles("test")`

