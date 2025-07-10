import java.util.Scanner;

public class PairOfRosesProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt(); // No. of test cases

        for (int t=0; t<cases; t++){
            int roses = sc.nextInt(); // No. of roses
            int[] prices = new int[roses]; // Array of prices of roses
            for (int j=0; j<roses; j++){
                prices[j] = sc.nextInt();
            }
            int money = sc.nextInt();

            int minDiff = Integer.MAX_VALUE;
            int p1 = 0, p2 = 0;

            for (int i=0; i<roses; i++){
                for (int j=i+1; j<roses; j++){
                    if (prices[i] + prices[j] == money){
                        int diff = Math.abs(prices[i] - prices[j]);
                        if (diff < minDiff){
                            minDiff = diff;
                            p1 = Math.min(prices[i], prices[j]);
                            p2 = Math.max(prices[i], prices[j]);
                        }
                    }
                }
            }

            System.out.println("Deepak should buy roses whose prices are "+ p1 +" and "+ p2+".");
        }
    }
}
