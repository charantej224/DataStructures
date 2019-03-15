// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class SquareRoot {
    int max = 0;
    static int max1 = 0;

    public int solution(int A, int B) {
        // write your code in Java SE 8
        int counter = A;
        while (counter < B) {
            squareRoot(counter, 0);
            counter++;
        }
        return max;
    }

    private void squareRoot(double count, int maxi) {
        double sqrtVal = count;
        double value = Math.sqrt(sqrtVal);
        if (value % 1 == 0) {
            maxi++;
            squareRoot(value, maxi);
        }
        if (maxi > max) {
            max = maxi;
        }
    }

    public static void main(String[] args) {
        SquareRoot squareRootSolution = new SquareRoot();
        //System.out.println(solution.solution(10, 20));
        int[] a = {1000,1001};
        squareRootSolution.squareRoot2(a,0);
        System.out.println(max1);
    }

    public void squareRoot2(int[] a,int max) {
        double rootA = Math.sqrt(a[0]);
        double rootB = Math.sqrt(a[1]);
        int aUpperLimit = (int) rootA;
        int bUpperLimit = (int) rootB;
        if (aUpperLimit != bUpperLimit) {
            if(!(rootA % 1 == 0))
                aUpperLimit++;
            max++;
            a[0] = aUpperLimit;
            a[1] = bUpperLimit;
            squareRoot2(a,max);
        }
        if(max > max1){
            max1 = max;
        }
    }
    

}