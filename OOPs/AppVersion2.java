package OOPs;

public class AppVersion2 extends AppVersion1{
    public void videoCall(){
        System.out.println("Video call is allowed!");
    }
    public void story(){
        System.out.println("Story is enabled!");
    }

    @Override
    public void seen(){
        System.out.println("Seen feature is now working well!");
    }
}
