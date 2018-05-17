package palendrome;

public class ispalendrome {
    public static void main(String[] args){
        int numbers[] = {1,2,3,2,1};
        int numbers1[] = new int[5];
        boolean isPalindrome = true;
        for( int i = 0; i<= numbers.length -1; i++){
            numbers1[i] = numbers[(numbers.length-1)-i];
        }
        for (int i =0; i<=numbers.length-1; i++){
            if (numbers[i] != numbers1[i]){
                isPalindrome = false;
            }
        }
       if (isPalindrome){
           System.out.println("This is palendrome.");
       } else {
           System.out.println("This is not a palindrome");
       }
    }
}
