package my.general.examples;
import java.util.*;

public class NonDivisibleSubset {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int [] mod = new int[100];
        while(n-- > 0){
            mod[in.nextInt()%k]++;
        }
        int length = (mod[0] > 0) ? 1 : 0;
        int halfway = 0;
        halfway = k/2;
        if(k%2 == 0){
            length += (mod[halfway] > 0) ? 1 : 0;
        }
        else 
            halfway++;
        for(int i = 1; i < halfway; i++){
            length += Math.max(mod[i], mod[k - i]);
        }
        System.out.println(length);
        in.close();
    }
}
