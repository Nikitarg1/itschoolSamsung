import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        long a = in.nextInt();

        System.out.println((a & -a) == a ? '0' : '1');
    }
}