package algorithm;

public class PrimeNumbers {

    public void printPrimeNumbers(int n){
        boolean is_prime[] = new boolean[n+1];
        int numbersArray[] = new int[n];
        for (int i = 0; i<=n; i++){
            is_prime[i] = true;
        }
        // move pointer from left to right, print Prime numbers
        int k = 0;
        for (int p=2; p<=n; p++){
            if (is_prime[p]){
                numbersArray[k] = p;
                k = k+1;

                //mark all multiples of p as not Prime
                for (int j= 2*p; j<=n; j+=p){
                    is_prime[j] = false;
                }
            }
        }
        for ( int i = 0; i<=numbersArray.length-1; i++){
            System.out.println(numbersArray[i]);
        }
    }
}
