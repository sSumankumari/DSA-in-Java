package OOPs;

class Pen {
    private String color;
    private int tip;

    // Getters
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    // Setters
    void setColor(String color){
        this.color = color;
    }
    void setTip(int tip){
        this.tip = tip;
    }
}
public class UsingthisKeyword {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("Green");
        p1.setTip(10);
        System.out.println(p1.getColor() +" and "+ p1.getTip());
    }
}
