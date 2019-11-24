class Problem17
{
  public static void main(String[] args)
  {
    int sum=0, temporarily=0;
    String thousand="thousand"; 
    int[] figure=new int[4];

    for(int i=0; i<=1000; i++)
    {
      temporarily=i;
      for(int j=0; j<4; j++)
      {
        figure[j]=temporarily%10;
        temporarily/=10;
      }

      if(figure[3]!=0)
        sum+=thousand.length();
      else if(figure[2]!=0)
      {

      }
    }
  }
}
