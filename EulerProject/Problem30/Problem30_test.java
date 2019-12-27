import java.util.ArrayList;

class Problem30_test
{
  public static void main(String[] args)
  {
    long start=System.currentTimeMillis();

    final int POW=5;
    int digitInt=(int)Math.pow(9,POW);
    String digitString=Integer.toString(digitInt);
    int digit=digitString.length()+1;
    int maxInt=(int)Math.pow(10,digit+1);
    int maxI=digitInt*digit;

    ArrayList<Integer> mathPow=new ArrayList<>();
    mathPow.add(0);
    mathPow.add(1);
    for(int i=2; i<10; i++)
      mathPow.add((int)Math.pow(i,POW));

    String iString;
    ArrayList<Integer> sameResult=new ArrayList<>();
    int result;
    int iStringArrayLength;
    for(int i=2; i<maxI; i++)
    {
      result=0;
      iString=Integer.toString(i);
      String[] iStringArray=iString.split("");
      iStringArrayLength=iStringArray.length;
      for(int j=0; j<iStringArrayLength; j++)
        result+=mathPow.get(Integer.parseInt(iStringArray[j]));

      if(i==result)
        sameResult.add(i);
    }

    int sum=0;
    for(int i=0; i<sameResult.size(); i++)
      sum+=sameResult.get(i);

    System.out.println(sum);

    long end=System.currentTimeMillis();
    System.out.println((end-start));
  }
}
