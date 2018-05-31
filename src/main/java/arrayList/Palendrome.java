package arrayList;

import java.util.ArrayList;

public class Palendrome {

    public static void main(String[] args) {
        boolean isPalindrome = true;
        ArrayList<Integer> palendrome1 = new ArrayList<Integer>();
        palendrome1.add(1);
        palendrome1.add(3);
        palendrome1.add(5);
        palendrome1.add(3);
        palendrome1.add(1);
        ArrayList<Integer> palendrome2 = new ArrayList<Integer>();
        for (int i = 0; i < palendrome1.size(); i++) {
            palendrome2.add(i, palendrome1.get((palendrome1.size() - 1) - i));
        }
        for (int i = 0; i < palendrome1.size() - 1; i++) {
            int y = palendrome1.get(i);
            int z = palendrome2.get(i);
            if (y != z) {
                isPalindrome = false;
            }
        }
        if (isPalindrome) {
            System.out.println("This is palendrome!");
        } else {
            System.out.println("This is not a palindrome!");
        }
    }
}
