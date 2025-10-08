package BitManipulation;

public class OperationsInBits {
    public static int getIthBit(int num, int i){
        int bitmask = 1<<i;
        if ((num & bitmask) == 0){
            return 0;
        }
        else return 1;
    }
    public static int setIthBit(int num, int i){
        int bitmask = 1<<i;
        return num | bitmask;
    }
    public static int clearIthBit(int num, int i){
        int bitmask = ~(1<<i);
        return num & bitmask;
    }
    public static int updateIthBit(int n, int i, int newBit){
//        if (newBit == 0){
//            return clearIthBit(n, i);
//        }
//        else{
//            return setIthBit(n, i);
//        }

        n = clearIthBit(n, i);
        int bitmask = newBit<<i;
        return n | newBit;
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(33, 5));
        System.out.println(getIthBit(10, 2));

        System.out.println(setIthBit(33, 5));
        System.out.println(setIthBit(10,2));

        System.out.println(clearIthBit(33, 5));
        System.out.println(clearIthBit(10,1));

        System.out.println(updateIthBit(33, 5, 1));
        System.out.println(updateIthBit(10, 2, 0));
    }
}
