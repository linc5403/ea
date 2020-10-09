package club.banyuan.unitTestDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
//@TestPropertySource(locations = "/foo.properties")
@TestPropertySource(locations = "/application-test.yml")
//@ActiveProfiles("foo.properties")
//@ActiveProfiles("test")
public class ExternTest2 {
    @Value("${foo}")
    String foo;

    @Test
    void test() {
        System.out.println(foo);
        Assertions.assertEquals("woo", foo);
    }
}
