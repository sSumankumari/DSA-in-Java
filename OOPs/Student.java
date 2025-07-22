package OOPs;

public class Student {
    static int count1 = 0;
    int count2 = 0;
    String str;
    int roll;

    Student(String str, int roll){
        this.str = str;
        this.roll = roll;
        count1++;
        count2++;
    }
}
