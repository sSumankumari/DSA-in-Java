package OOPs;

public class StaticKeyword {
    public static void main(String[] args) {
        Student o1 = new Student("abc", 1);
        Student o2 = new Student("def", 2);
        Student o3 = new Student("ghi", 3);

        System.out.println("Checking static variable call: ");
        System.out.println(o1.count1);
        System.out.println(o2.count1);
        System.out.println(o3.count1);

        System.out.println("Checking non-static variable call: ");
        System.out.println(o1.count2);
        System.out.println(o2.count2);
        System.out.println(o3.count2);

        System.out.println(Student.count1);
    }
}
