import java.util.Scanner;

public class PrimeDagdag
{
    void prime_W(int W) 
    {
        int x, y, flg;
        System.out.println();

        for (x = 1; x <= W; x++) 
        {
            if (x == 1 || x == 0) 
            {
                continue;
            }

            flg = 1;
            for (y = 2; y <= x / 2; ++y) 
            {
                if (x % y == 0) 
                {
                    flg = 0;
                    break;
                }
            }

            if (flg == 1) 
            {
                System.out.print(x + " ");
            }
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Value of W: ");
        int W = scanner.nextInt();
        
        Primes obj = new Primes();
        obj.prime_W(W);
        scanner.close();
    }
}
