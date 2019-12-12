import java.math.BigInteger;

class Problem25
{
  public static void main(String[] args)
  {
    BigInteger pibonacciNum1=new BigInteger("1");
    BigInteger pibonacciNum2=new BigInteger("1");
    BigInteger pibonacciNum3;
    int count=2;

    while(true)
    {
      pibonacciNum3=pibonacciNum1.add(pibonacciNum2);
      pibonacciNum1=pibonacciNum2;
      pibonacciNum2=pibonacciNum3;
      count++;
      if(pibonacciNum3.toString().length()>999)
        break;
    }
    System.out.println(count);
  }
}
