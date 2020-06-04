package com.linchuan;

import java.util.ArrayList;
import java.util.List;

public class ListUsage {
    public List<Integer> genList(int n) {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(i);
        }
        return l;
    }
}
