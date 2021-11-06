public class Recursion
{
    // 5: The sum of the digits of the number.
    private static void sum(int number)
    {
        System.out.println(sum_main(number));;
    }

    public static int sum_main(int number)
    {
        int s = 0;
        if (number == 0) return s;
        s += number % 10;
        return s + sum_main(number / 10);
    }

    // 6: Checking the number for simplicity.
    private static void prime(int number)
    {
        if (prime_main(number) == true) System.out.println("YES");
        else System.out.println("NO");
    }

    private static boolean prime_main(int number)
    {
        if (number == 0 || number == 1) return true;
        return div(number, 2);
    }

    private static boolean div(int number, int divider)
    {
        if (number == divider) return true;
        if (number % divider == 0) return false;
        else return div(number, divider + 1);
    }

    // 7: Factorization.
    private static void factorize(int number)
    {
        factorize_main(number, 2);
    }

    public static void factorize_main(int n, int k)
    {
        if (k > n) return;
        if (n % k == 0)
        {
            while(n % k == 0)
            {
                System.out.println(k);
                n = n / k;
            }
        }
        factorize_main(n, k + 1);
    }

    // Main.
    public static void main(String[] args)
    {
        int n = 168;
        sum(n);
        n = 17;
        prime(n);
        n = 16;
        prime(n);
        n = 126;
        factorize(n);
    }
}
