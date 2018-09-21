package my.general.examples;
import java.util.*;

public class Leaderboard {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        int[] alice_ranks = new int[m];
        int rank = 0;
        int a_index = m-1;
        int c_score = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(scores[i] < c_score){
                rank++;
                c_score = scores[i];
            }
            while(a_index >= 0 && alice[a_index] >= scores[i]){
                alice_ranks[a_index] = rank;
                //System.out.println("alice");
                a_index--;
            }
            //System.out.println(rank);
        }
        while(a_index >= 0){
            //System.out.println("alice");
            alice_ranks[a_index] = rank+1;
            a_index--;
        }
        for(int j = 0; j < m; j++){
            System.out.println(alice_ranks[j]);
        }
    }
}
