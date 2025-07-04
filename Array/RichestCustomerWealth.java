public class RichestCustomerWealth {
    public static void main(String[] args) {
        int accounts[][] = {{1,5},{7,3},{3,5}};

        int max = findMax(accounts);
        System.out.println(max);
    }
    public static int findMax(int[][] accounts){
        int n = accounts.length;
        int m = accounts[0].length;

        int maxWealth = Integer.MIN_VALUE;
        for (int i=0; i<n; i++){
            int wealth = 0;
            for (int j=0; j<m; j++){
                wealth = wealth + accounts[i][j];
            }
            if (wealth > maxWealth) maxWealth = wealth;
        }

        return maxWealth;
    }
}
