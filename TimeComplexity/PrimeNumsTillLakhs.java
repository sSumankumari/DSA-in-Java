package TimeComplexity;

public class PrimeNumsTillLakhs {
    public static boolean prime(int num){
        for (int i=2; i<num-1; i++){
            if (num %i == 0) return false;
        }
        return true;
    }
    // Using Sieve of Eratosthenes
    // It is an ancient algorithm used to find all prime numbers up to a given limit.
    // It works by iteratively marking the multiples of each prime number starting from 2 as composite (not prime).
    // The algorithm is efficient, operating in O(√n) time complexity, making it one of the most effective methods for finding small prime numbers.
    public static void main(String[] args) {
        // Code having time complexity "N^2"
//        for (int i=1; i<=100000; i++){
//            if (prime(i) == true) {
//                System.out.print(i+" ");
//            }
//        }

        // Code having less Time complexity "N √(N)"
        boolean[] nums = new boolean[100000];
        for (int i=2; i<100000; i++){
            if (nums[i] == false){
                System.out.print(i+" ");
                for (int j = 2*i; j<100000; j=j+i){
                    nums[j] = true;
                }
            }
        }
    }
}
