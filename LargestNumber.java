import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Numbers (Separated by comma):");
        String[] arrStr = in.nextLine().split(",");
        System.out.println("Output:");
        System.out.println(largestNumber(arrStr));
    }
    static String largestNumber(String[] arrStr){
        int size = arrStr.length;
        Arrays.sort(arrStr, Collections.reverseOrder());
        String largeNo = "";
        for (int i = 0; i < size; i++) {
            if(largeNo != "") {
                largeNo = compareEle(largeNo, arrStr[i].trim());
            } else {
                largeNo = arrStr[i].trim();
            }
        }
        return largeNo;
    }

    static String compareEle(String X, String Y){
        String XY = X + Y;
        String YX = Y + X;
        return XY.compareTo(YX) > 0 ? XY : YX;
    }
}
