package OOPs;

public class UsingTryCatchAndFinally {
    public static void main(String[] args) {
        int arr[] = new int[5];

        try {
            System.out.println(arr[6]);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("There could be an error!");
        }

        System.out.println("Normal Statement Execution!");
    }
}
