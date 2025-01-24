public class WarmUp
{
  public static void main(String[] args)
  {
    int a = 2;
    int b = 12;
    int c = 5;
    int d = 20;
    int e = 7;
    int f = 35;

    int sampleInt = 454453;
    double sampleDouble = 4598.458;
    boolean sampleBoolean = true;
    String sampleString = "afderjdaslkfjasd";

    System.out.println(isEven(a));
    System.out.println(isEven(b));
    System.out.println(isEven(c));
    System.out.println(isEven(d));
    System.out.println(isEven(e));
    System.out.println(isEven(f));

    System.out.println(isDivisible(b, a));
    System.out.println(isDivisible(f, d));
    System.out.println(isDivisible(d, c));
    System.out.println(isDivisible(a, f));
  }

  // write your methods below
  public static boolean isEven(int num) {
    return (num % 2) == 0;
  }

  public static boolean isDivisible(int a, int b) {
    return (a % b) == 0;
  }
  
}
