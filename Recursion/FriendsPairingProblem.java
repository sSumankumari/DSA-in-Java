package Recursion;

public class FriendsPairingProblem {
    public static int pairWithFriends(int n){
        if (n==1 || n==2){
            return n;
        }

        // Single
        int s = pairWithFriends(n-1);
        // Paired
        int p = (n-1) * pairWithFriends(n-2);

        return (s+p);
    }
    public static void main(String[] args) {
        System.out.println(pairWithFriends(3));
        System.out.println(pairWithFriends(5));
        System.out.println(pairWithFriends(7));

    }
}
