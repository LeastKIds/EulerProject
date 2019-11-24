import java.math.*;

class Problem16
{
  public static void main(String[] args)
  {
    BigInteger number=new BigInteger("2");
    BigInteger bigNumber=number.pow(1000);
    BigInteger sum=new BigInteger("0");
    BigInteger standard=BigInteger.TEN;


    while(bigNumber.compareTo(standard)!=-1)
    {
      sum=sum.add(bigNumber.remainder(standard));
      bigNumber=bigNumber.divide(standard);
    }


    System.out.println(sum.add(bigNumber));
  }
}
