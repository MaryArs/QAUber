package algorithm;

public class PrimeNumbers {

    public void printPrimeNumbers(int n){
        boolean is_prime[] = new boolean[n+1];
        for (int i = 0; i<=n; i++){
            is_prime[i] = true;
        }
        // move pointer from left to right, print Prime numbers
        for (int p=2; p<=n; p++){
            if (is_prime[p]){
                System.out.println(p);
                //mark all multiples of p as not Prime
                for (int j= 2*p; j<=n; j+=p){
                    is_prime[j] = false;
                }
            }
        }
    }
}
