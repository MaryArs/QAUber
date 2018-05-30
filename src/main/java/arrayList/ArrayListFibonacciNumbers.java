package arrayList;

import java.util.ArrayList;

public class ArrayListFibonacciNumbers {

    public void FibonacciNumbers(int n){
        int f1 = 0;
        int f2 = 1;
        if (n < 1){
            return;
        }
        ArrayList<Integer> f = new ArrayList<Integer>();
        for (int i=1; i<=n; i++){
            f.add(f2);
            int fn =f1+f2;
            f1=f2;
            f2 = fn;
        }

        for (int i=0; i<f.size(); i++){
            System.out.println(f.get(i));
        }
    }
}
