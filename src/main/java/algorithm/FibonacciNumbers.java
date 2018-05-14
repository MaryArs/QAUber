package algorithm;

public class FibonacciNumbers {
    public void printFibonacciNumbers(int n){
        int f1 = 0;
        int f2 = 1;
        if (n < 1){
            return;
        }

        for (int i=1; i<=n; i++){
            System.out.println(f2);
         int fn =f1+f2;
            f1=f2;
            f2 = fn;
        }
    }
}
