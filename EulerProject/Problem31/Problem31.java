class Problem31
{
  public static void main(String[] args)
  {
      final int MAKE_POUND=200;
      int[] combination=new int[]{100,50,20,10,5,2};
      int combinationLength=combination.length;
      int count=2;
      int digit_count_100=0,digit_count_50=0,digit_count_20=0,
      digit_count_10=0,digit_count_5=0,digit_count_2=0;
      int remind,result;
      final int MAX_2=MAKE_POUND/combination[5];
      final int MAX_5=MAKE_POUND/combination[4];
      final int MAX_10=MAKE_POUND/combination[3];
      final int MAX_20=MAKE_POUND/combination[2];
      final int MAX_50=MAKE_POUND/combination[1];
      final int MAX_100=MAKE_POUND/combination[0];

      for(int num_100=0; num_100<=MAX_100; num_100++)
      {
        for(int num_50=0; num_50<=MAX_50; num_50++)
        {
          for(int num_20=0; num_20<=MAX_20; num_20++)
          {
            for(int num_10=0; num_10<=MAX_10; num_10++)
            {
              for(int num_5=0; num_5<=MAX_5; num_5++)
              {
                for(int num_2=1; num_2<=MAX_2; num_2++)
                {
                  result=combination[5]*num_2 + combination[4]*num_5 + combination[3]*num_10 + combination[2]*num_20 + combination[1]*num_50 + combination[0]*num_100;
                  if(result>MAKE_POUND)
                    break;
                  count++;
                }
              }
            }
          }
        }
      }

      System.out.println(count);

  }
}
