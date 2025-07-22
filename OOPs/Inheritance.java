package OOPs;

public class Inheritance extends AppVersion2{
    public static void main(String[] args) {
        AppVersion1 v = new AppVersion1();

        v.chat();
        v.seen();
        System.out.println();

        AppVersion2 v2 = new AppVersion2();

        v2.chat();
        v2.videoCall();
        v2.story();
        v2.seen();
    }
}
