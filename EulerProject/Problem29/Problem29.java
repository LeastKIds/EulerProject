import java.util.HashSet;
import java.math.BigInteger;

class Problem29
{
  public static void main(String[] args)
  {
    HashSet<BigInteger> pow=new HashSet<>();
    final int smallNum=2;
    final int bigNum=100;

    BigInteger aBigInteger=new BigInteger("0");
    BigInteger result=new BigInteger("0");

    String aString,bString;
    for(int a=smallNum; a<=bigNum; a++)
    {
      for(int b=smallNum; b<=bigNum; b++)
      {
        aBigInteger=new BigInteger(Integer.toString(a));
        result=aBigInteger.pow(b);
        pow.add(result);

      }
    }

    System.out.println(pow.size());

  }
}
