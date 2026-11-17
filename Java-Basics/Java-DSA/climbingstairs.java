import java.util.*;
public class climbingstairs {
    public int ClimbingStairs(int n) {
        int[] dp = new int[n + 1];
        return solve(n, dp);
    }
    public int solve(int n, int[] dp) {
        if(n == 1 || n == 0) {
            return 1;
        }
        if(dp[n] != 0) {
            return dp[n];
        }
        dp[n] = solve(n - 1, dp) + solve(n - 2, dp);
        return dp[n];
    }
    public static void main(String[] args) {
        climbingstairs obj = new climbingstairs();
        System.out.println(obj.ClimbingStairs(5));
    }
}