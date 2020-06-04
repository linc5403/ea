package club.banyuan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution solution = new Solution();
        String s = solution.sortString("aaaabbbbcccc");
        System.out.println(s);
        System.out.println(s.equals("abccbaabccba"));
        /*
        boolean r;
        r = solution.checkPossibility(new int[]{4, 2, 1}); // false
        System.out.println(r);
        r = solution.checkPossibility(new int[]{0, 4, 2, 3}); // true
        System.out.println(r);
        r = solution.checkPossibility(new int[]{3, 4, 2, 3}); // false
        System.out.println(r);
        r = solution.checkPossibility(new int[]{3, 2, 3, 2, 4}); // false
        System.out.println(r);
        r = solution.checkPossibility(new int[]{3, 2, 3}); // true
        System.out.println(r);
        */
    }
}
