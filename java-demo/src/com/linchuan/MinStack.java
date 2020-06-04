package com.linchuan;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
class Solution {
    public int waysToStep(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else if (n == 3) {
            return 4;
        }
        long a = 1, b = 2, c = 4;
        long x = 0;
        for (; n > 3; n--) {
            x = (a + b + c) % 1000000007;
            a = b;
            b = c;
            c = x;
        }
        return (int)x;
    }
}
/*
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        // 需要一个map来存放不同点数的个数, 最少点数那个牌的张数需要是其他点数的张数的公约数
        Map<Integer, Integer> deckMap = new HashMap<>();
        for (int i = 0; i < deck.length; i++) {
            Integer v = deckMap.getOrDefault(deck[i], 0);
            v++;
            deckMap.put(deck[i], v);
        }

        Map.Entry<Integer, Integer> min = null;

        for (Map.Entry<Integer, Integer> entry: deckMap.entrySet()) {
            if (min == null || entry.getValue().compareTo(min.getValue()) < 0) {
                min = entry;
            }
        }

        if (min.getValue() < 2)
            return false;

        // 任意不同牌的张数的所有公约数
        Map.Entry<Integer, Integer> other = null;
        for (Map.Entry<Integer, Integer> entry: deckMap.entrySet()) {
            if (entry.getKey() != min.getKey()) {
                other = entry;
            }
        }
        if (other == null) {
            return true;
        }

        Set<Integer> deckSet = new HashSet<>();

        for (Integer i = 2; i <= min.getValue(); i++) {
            if (min.getValue() % i == 0 && other.getValue() %i == 0) {
                deckSet.add(i);
            }
        }

        if (deckSet.isEmpty())
            return false;

        for (Map.Entry<Integer, Integer> entry: deckMap.entrySet()) {
            boolean found = false;
            for(Integer item: deckSet) {
                if (entry.getValue() % item == 0) {
                    found = true;
                    break;
                }
            }
            if (!found)
                return false;
        }
        return true;
    }
}

*/

/*
class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (J.contains(new String(String.valueOf(S.charAt(i)))))
                count++;
        }
        return count;
    }
}
*/
