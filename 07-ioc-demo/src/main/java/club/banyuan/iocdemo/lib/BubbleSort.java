package club.banyuan.iocdemo.lib;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Primary
public class BubbleSort implements SortAlgorithm{
    @Override
    public List<Integer> sort(List<Integer> input) {
        System.out.println("using BubbleSort");
        List <Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        return a;
    }
}
