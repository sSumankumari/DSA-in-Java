package Strings;

public class UsingStringBuilder {
    public static void main(String[] args) {
        // String concatenation using +
        long startTime1 = System.currentTimeMillis();
        String ans = "";
        System.out.println("Starting string concatenation...");
        for (int i=0; i<50000; i++) {
            ans = ans + "0";
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("String concatenation done.");
        System.out.println("Time taken using String: " + (endTime1 - startTime1) + " ms");

        // UsingStringBuilder append
        long startTime2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        System.out.println("Starting UsingStringBuilder append...");
        for (int i=0; i<50000; i++) {
            sb.append("0");
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("UsingStringBuilder append done.");
        System.out.println("Time taken using UsingStringBuilder: " + (endTime2 - startTime2) + " ms");
    }
}
