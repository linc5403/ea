package club.banyuan.unitTestDemo;

import org.springframework.stereotype.Component;

@Component
public class OperatorBean {
    public Integer add(Integer a, Integer b) {
        return a+b;
    }
}
