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
  public boolean isEven(int num) {
    return (num % 2) == 0;
  }

  public isDivisible(int a, int b) {
    return (a % b) == 0;
  }
  
}
