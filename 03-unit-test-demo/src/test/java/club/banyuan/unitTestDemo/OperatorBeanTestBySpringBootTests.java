package club.banyuan.unitTestDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OperatorBeanTestBySpringBootTests {
    @Autowired
    OperatorBean operatorBean;

    @Test
    public void addTest() {
        Assertions.assertEquals(4, operatorBean.add(1, 3));
    }
}