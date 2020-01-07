class Problem31
{
  public static void main(String[] args)
  {
      final int MAKE_POUND=200;

      int[] combination=new int[]{200,100,50,20,10,5,2,1};
      int combinationLength=combination.length;
      int count=0;

      int remind,result;
      while(true)
      {
        for(int i=0; i<combinationLength; i++)
        {
          result=MAKE_POUND/combination[i];
          remind=MAKE_POUND%combination[i];
          if(remind==0)
          {
            count++;
            break;
          }
          
        }
      }
  }
}
