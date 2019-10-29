class Problem12
{
  public static void main(String[] args)
  {
    int tripleNum=0;
    int n=0;

    while(true)
    {
      n++;
      tripleNum+=n;
      int divisor=0;
      for(int i=1; i<=Math.sqrt(tripleNum); i++)
      {
        if(tripleNum%i==0 && i!=Math.sqrt(tripleNum))
          divisor+=2;
        else if(tripleNum%i==0 && i==Math.sqrt(tripleNum))
          divisor+=1;
      }

      if(divisor>=500)
        break;
    }

    System.out.println(tripleNum);
  }
}
