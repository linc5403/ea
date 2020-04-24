package club.banyuan.unitTestDemo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(classes = UnitTestDemoApplication.class)
class OperatorBeanTestBySpring {
    @Autowired
    private OperatorBean operator;

    @Test
    void addTest() {
        Assert.assertEquals((Integer)4, operator.add(1, 3));
    }
}