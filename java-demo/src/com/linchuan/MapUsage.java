package com.linchuan;

import java.util.HashMap;
import java.util.Map;

public class MapUsage {
    public Map<Character, Integer> genMap(int n) {
        Map<Character, Integer> myM = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            myM.put((char) (0x30 + i), i);
        }
        return myM;
    }
}
