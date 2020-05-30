package com.linchuan;

import java.util.HashSet;
import java.util.Set;

public class SetUsage {
    public Set<Integer> genSet(int n) {
        Set<Integer> s = new HashSet<>();
        for(int i = 0; i < 10; i++) {
            s.add(i);
        }
        return s;
    }
}
