package my.general.examples;
import java.util.*;

public class MagicSquare {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        for(int s_i=0; s_i < 3; s_i++){
            for(int s_j=0; s_j < 3; s_j++){
                s[s_i][s_j] = in.nextInt();
            }
        }
        int [][] ans1 = {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}};
        int [][] ans2 = {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}};
        int [][] ans3 = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
        int [][] ans4 = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};

        int cost1 = costEval(s, ans1);
        int cost2 = costEval(s, ans2);
        int cost3 = costEval(s, ans3);
        int cost4 = costEval(s, ans4);
        int min = Math.min(cost1, Math.min(cost2, Math.min(cost3, cost4)));
        System.out.println(min);
    }
    
    static int costEval(int [][] in, int [][] key){
        int cost = 0;
        int flipcost = 0;
        for(int i = 0; i < in.length; i++){
            for(int j = 0; j < in[i].length; j++){
                cost += Math.abs(key[i][j] - in[i][j]);
                flipcost += Math.abs(key[i][2-j] - in[i][j]);
            }
        }
        return Math.min(flipcost, cost);
    }
}
