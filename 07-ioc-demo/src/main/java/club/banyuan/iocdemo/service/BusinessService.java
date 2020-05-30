package club.banyuan.iocdemo.service;

import club.banyuan.iocdemo.lib.BubbleSort;
import club.banyuan.iocdemo.lib.QuickSort;
import club.banyuan.iocdemo.lib.SortAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BusinessService {

    @Autowired
    @Qualifier("QuickSort")
    private SortAlgorithm sort;

    public void doSomeService() {
        // 需要对一些数据进行处理
        List a =  sort.sort(new ArrayList(10));

        // do something...
        System.out.println(a);
    }
}
