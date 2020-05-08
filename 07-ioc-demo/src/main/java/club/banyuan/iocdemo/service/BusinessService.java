package club.banyuan.iocdemo.service;

import club.banyuan.iocdemo.lib.BubbleSort;
import club.banyuan.iocdemo.lib.QuickSort;
import club.banyuan.iocdemo.lib.SortAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class BusinessService {
    public void doSomeService() {
        // 需要对一些数据进行处理
        SortAlgorithm sort = new QuickSort();
        List a =  sort.sort(new ArrayList(10));

        // do something...
        System.out.println(a);
    }
}
