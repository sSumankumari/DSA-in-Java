package BitManipulation;
import java.util.ArrayList;
import java.util.List;

public class ReadBinaryWatchTimings {
    public static int countBits(int n){
        int count = 0;
        while (n > 0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> res = new ArrayList<>();

        for (int hr=0; hr<12; hr++){
            int hrBits = countBits(hr);

            if (hrBits > turnedOn) continue;

            for (int min=0; min<60; min++){
                int minBits = countBits(min);

                if ((hrBits + minBits) == turnedOn){
                    String time = hr + ":" + (min < 10? "0" : "") + min;
                    res.add(time);
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        // Total no. of LEDs on
        int turnedOn = 4;
        readBinaryWatch(turnedOn);
        System.out.println(readBinaryWatch(2));
        System.out.println(readBinaryWatch(turnedOn));
    }
}
