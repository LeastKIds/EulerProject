

class Problem14
{
  public static void main(String[] args)
  {
    long firstN=0, secondN=0;

    int maxCount=0, maxNum=0;

    for(int i=2; i<=1000000; i++)
    {

      int count=0;
      firstN=i;
      while(firstN!=1)
      {
        if(firstN%2==0)
          firstN/=2;
        else
          firstN=(firstN*3)+1;

        count++;
      }
      if(maxCount<count)
      {
        maxCount=count;
        maxNum=i;
      }

    }

    System.out.println(maxNum);
    System.out.println(maxCount);
  }
}
