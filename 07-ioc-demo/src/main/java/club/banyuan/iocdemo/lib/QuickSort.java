package club.banyuan.iocdemo.lib;

import java.util.ArrayList;
import java.util.List;

public class QuickSort implements SortAlgorithm{
    @Override
    public List<Integer> sort(List<Integer> input) {
        System.out.println("using QuickSort");
        List <Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        return a;
    }
}
