import java.util.Scanner;

public class SortedArrayTarget {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Sorted Numbers (Separated by comma):");
        String[] arrStr = in.nextLine().split(",");
        System.out.println("Enter Target:");
        int target = Integer.parseInt(in.nextLine());
        System.out.println("Output:");
        System.out.println(sortedArrayTarget(arrStr, target));
    }

    static String sortedArrayTarget(String[] arrStr, int target) {
        int size = arrStr.length;
        for (int i = 0; i < (size - 1); i++) {
            for (int j = (i + 1); j < size; j++) {
                if (Integer.parseInt(arrStr[i]) + Integer.parseInt(arrStr[j]) == target) {
                    return "[" + i + ", " + j + "], " + "nums[" + i + "] + nums[" + j + "] = " + target;
                }
            }
        }
        return "No Match found";
    }
}
