package OOPs;

class Students {
    String name;
    int roll;
    String password;
    int[] marks;

    // Shallow copy constructor
//    Students(Students s1){
//        marks = new int[3];
//        this.name = s1.name;
//        this.roll = s1.roll;
//        this.marks = s1.marks;
//    }

    // Deep copy constructor
    Students(Students s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }

    Students(){
        marks = new int[3];
        System.out.println("Constructor is called!");
    }

}
public class CopyConstructor {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "Ankita";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Students s2 = new Students(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;
        for (int i=0; i<s2.marks.length; i++){
            System.out.println(s2.marks[i]);
        }
    }
}
