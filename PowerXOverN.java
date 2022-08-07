import java.util.Scanner;

public class PowerXOverN {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x:");
        float x = Integer.parseInt(in.nextLine());
        System.out.println("Enter n:");
        int n = Integer.parseInt(in.nextLine());
        System.out.println("Output:");
        System.out.println(powerXOverN(x, n));
    }
    static float powerXOverN(float x, int n)
    {
        float temp;
        if( n == 0)
            return 1;
        temp = powerXOverN(x, n/2);

        if (n%2 == 0)
            return temp*temp;
        else
        {
            if(n > 0)
                return x * temp * temp;
            else
                return (temp * temp) / x;
        }
    }
}
