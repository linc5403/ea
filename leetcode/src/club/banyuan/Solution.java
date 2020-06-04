package club.banyuan;
class Solution {
    public String sortString(String s) {
        int[] a = new int[26];
        for(int i = 0; i < s.length(); i++) {
            a[s.charAt(i)-'a']++;
        }

        StringBuilder r = new StringBuilder();
        while(true) {
            boolean empty = true;
            for (int i = 0; i < 26; i++) {
                if (a[i] != 0) {
                    r.append((char)('a' + i));
                    a[i]--;
                    if (a[i] > 0)
                        empty = false;
                }
            }
            if (empty) {
                return r.toString();
            }
            for (int i = 25; i >= 0; i--) {
                if (a[i] != 0) {
                    r.append((char)('a' + i));
                    a[i]--;
                    if (a[i] > 0)
                        empty = false;
                }
            }
            if (empty) {
                return r.toString();
            }
        }
    }
}
/*
class Solution {
    public boolean judgeSquareSum(int c) {
        if (c == 0)
            return true;
        for (int a = 0; a < Math.sqrt(c); a++) {
            int b2 = c - a*a;
            int b = (int)Math.sqrt(b2);
            if ( b*b == b2 )
                return true;
        }
        return false;
    }
}
*/
/*
class Solution {
    public int lengthOfLastWord(String s) {
        String [] ss = s.split("[ ]");
        if (ss.length == 0) {
            return 0;
        } else {
            return ss[ss.length-1].length();
        }
    }
}
*/
/*
class Solution {
    public boolean checkPossibility(int[] nums) {
        if (nums == null)
            return false;
        if (nums.length <= 2)
            return true;
        boolean adjusted = false;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] < nums[i-1]) {
                if (adjusted)
                    return false;
                if (nums[i-1] < nums[i-2])
                    return false;

                if (nums[i] < nums[i-2])
                    // 只能把第三个数变大
                    nums[i] = nums[i - 1];
                else
                    nums[i-1] = nums[i];
                adjusted = true;
            } else if (nums[i-1] < nums[i-2]) {
                adjusted = true;
                nums[i-2] = nums[i-1];
            }
        }
        return true;
    }
}
*/

/*
class Solution {
    public boolean hua(int number[], int n) {
        if (n < 0 || n > number.length || number.length > 20000) {
            return false;
        }
        for (int i = 0; i < number.length - 1; i++) {
            if (number[0] == 0 && number.length == 1) {

            }
            if (number[0] == 0 && number[1] == 0) {

            }
            if (number[i] == 0 && number[i + 1] != 1) {
                if (i != number.length - 2) {
                    if (number[i + 2] != 1 || i + 1 == number.length - 2) {
//                    number[i+1]=1;
                        n--;
                    }
                } else {
                    n--;
                }
                i = i + 2;
            }
        }
        if (n <= 0) {
            return true;
        } else {
            return false;
        }
    }

}
*/
/*
class Solution {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n, s.length()) + s.substring(0, n);
    }
}
*/

/*
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
class Solution {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return  false;
        }
        if (A.equals(B)) {
            // 只要有两个相同的字母就可以
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < A.length(); i++) {
                if (set.contains(A.charAt(i))) {
                    return true;
                } else {
                    set.add(A.charAt(i));
                }
            }
            return false;
        } else {
            char[] diffA = new char[2];
            char[] diffB = new char[2];
            int diffIdx = 0;
            for (int i = 0; i < A.length(); i++) {
                if (A.charAt(i) != B.charAt(i)) {
                    if (diffIdx == 2) {
                        return false;
                    } else {
                        diffA[diffIdx] = A.charAt(i);
                        diffB[diffIdx] = B.charAt(i);
                        diffIdx++;
                    }
                }
            }
            if (diffA[0] == diffB[1] && diffA[1] == diffB[0]) {
                return true;
            } else {
                return false;
            }
        }
    }
}
*/

/*
import java.util.Arrays;
class Solution {
    private int findMin(int house, int[] heaters) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < heaters.length; i++) {
            int dis = Math.abs(heaters[i] - house);
            if ( dis <= min) {
                min = dis;
            } else {
                break;
            }
        }
        return min;
    }

    public int findRadius(int[] houses, int[] heaters) {
        // 每个供暖器覆盖的范围是多少？？
        // 每个房子找离它最近的那个供暖器， 获取其距离
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int min = 0;
        for(int i = 0; i < houses.length; i++) {
            int min_curr = findMin(houses[i], heaters);
            if (min_curr > min) {
                min = min_curr;
            }
        }
        return min;
    }
}
*/
