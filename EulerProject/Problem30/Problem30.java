import java.util.ArrayList;

class Problem30
{
  public static void main(String[] args)
  {
    long start=System.currentTimeMillis();

    final int POW=5;
    int digitInt=(int)Math.pow(9,POW);
    String digitString=Integer.toString(digitInt);
    int digit=digitString.length()+1;
    int maxInt=(int)Math.pow(10,digit+1);

    String iString;
    ArrayList<Integer> sameResult=new ArrayList<>();
    int result;
    int iStringArrayLength;
    for(int i=2; i<maxInt; i++)
    {
      result=0;
      iString=Integer.toString(i);
      String[] iStringArray=iString.split("");
      iStringArrayLength=iStringArray.length;
      for(int j=0; j<iStringArrayLength; j++)
        result+=(int)Math.pow(Integer.parseInt(iStringArray[j]),POW);

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
