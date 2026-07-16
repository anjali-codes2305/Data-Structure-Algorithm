package Linear_Search;

public class max_wealth {

    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int[]ints :accounts){
            int sum = 0;
            for (int anints:ints){
                sum += anints;
            }
             if(sum >ans){
              ans =sum;
        }
        }
        return ans;
       
        
    }
    
}
