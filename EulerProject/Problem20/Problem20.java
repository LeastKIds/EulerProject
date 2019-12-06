import java.math.*;

class Problem20
{
  public static void main(String[] args)
  {
    BigInteger pactorial=new BigInteger("1");
    BigInteger chiperSum=new BigInteger("0");
    BigInteger standard=BigInteger.TEN;

    for(int i=1; i<=100; i++)
      pactorial=pactorial.multiply(BigInteger.valueOf(i));



    while(true)
    {
      chiperSum=chiperSum.add(pactorial.remainder(standard));
      pactorial=pactorial.divide(standard);

      if(pactorial.compareTo(BigInteger.valueOf(0)) == 0)
        break;
    }

    System.out.println(chiperSum);


  }
}
