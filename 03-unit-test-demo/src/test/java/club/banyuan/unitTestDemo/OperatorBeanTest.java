package club.banyuan.unitTestDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;

@SpringBootTest
public class OperatorBeanTest {
    @Autowired
    OperatorBean operatorBean;

    @Test
    public void add() {
        Assertions.assertEquals(5, operatorBean.add(1, 4));
    }

    @Test
    public void sub() {
    }
}