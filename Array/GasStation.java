public class GasStation {
    public static void main(String[] args) {
//        int gas[] = {1, 2, 3, 4, 5};
//        int cost[] = {3, 4, 5, 1, 2};
        int gas[] = {2, 3, 1, 6, 2};
        int cost[] = {1, 2, 6, 1, 2};

//        int ans = find(gas, cost);
        int ans = findStation(gas, cost);
        System.out.println("You can start from gas station no. "+ ans);
    }
    // Bruteforce Method
    public static int find(int[] gas, int[] cost){
        int n = gas.length;
        for (int i=0; i<n; i++){
            int fuel = 0;
            int temp = 0;
            for (int j=i; j<n+i; j++){
                fuel = fuel + gas[j%n] - cost[j%n];

                if (fuel<0){
                    temp = 1;
                    break;
                }
            }
            if (temp==0) return i;
        }
        return -1;
    }

    // Using Kadanes Algorithm
    public static int findStation(int[] gas, int[] cost){
        int n = gas.length;
        int tgas = 0;
        int tcost = 0;
        for (int i=0; i<n; i++){
            tgas = tgas + gas[i];
            tcost = tcost + cost[i];
        }

        if (tgas<tcost) return -1;

        int ans = 0;
        int currentGas = 0;
        for (int i=0; i<n; i++){
            currentGas = currentGas + gas[i] - cost[i];
            if (currentGas<0){
                ans = i+1;
                currentGas=0;
            }
        }
        return ans;
    }
}
