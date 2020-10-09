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
    public void addTest1() {
        Assertions.assertEquals(4, operatorBean.add(1, 3));
    }

    @Test
    public void addTest2() {
        Assertions.assertEquals(5, operatorBean.add(2, 3));
    }

    @Test
    public void subTest1() {
        Assertions.assertEquals(8, operatorBean.sub(10, 2));
    }
}