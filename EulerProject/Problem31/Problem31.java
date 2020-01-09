class Problem31
{
  public static void main(String[] args)
  {
      final int MAKE_POUND=10;
      int[] combination=new int[]{100,50,20,10,5,2};
      int combinationLength=combination.length;
      int count=0;

      for(int i=combinationLength-1; i>=0; i--)
        count=switchLoop(MAKE_POUND,combination[i],count,i);
      //count=switchLoop(MAKE_POUND,2,count,5);
      //count=switchLoop(MAKE_POUND,5,count,4);
      System.out.println(count);

  }

  public static int switchLoop(final int MAKE_POUND, int combination, int count, int digit)
  {
    final int MAX_DIGIT=MAKE_POUND/combination;
    int digit_count_100=0,digit_count_50=0,digit_count_20=0,
    digit_count_10=0,digit_count_5=0,digit_count_2=0;
    switch(digit)
    {
      case 5: break;
      case 4: digit_count_5=1;
              break;
      case 3: digit_count_10=1;
              break;
      case 2: digit_count_20=1;
              break;
      case 1: digit_count_50=1;
              break;
      case 0: digit_count_100=1;
              break;
    }

    switch(combination)
    {
      case 2: count+=MAX_DIGIT;
              //System.out.println(count);
              break;
      case 5: for(int i=digit_count_5; i<=MAX_DIGIT; i++)
                count=switchLoop(MAKE_POUND-(i*5),2,count,digit)+1;
              //System.out.println(count);
              break;
      case 10: for(int i=digit_count_10; i<=MAX_DIGIT; i++)
                count=switchLoop(MAKE_POUND-(i*10),5,count,digit)+1;
              break;
      case 20: for(int i=digit_count_20; i<=MAX_DIGIT; i++)
                count=switchLoop(MAKE_POUND-(i*20),10,count,digit)+1;
              break;
      case 50: for(int i=digit_count_50; i<=MAX_DIGIT; i++)
                count=switchLoop(MAKE_POUND-(i*50),20,count,digit)+1;
              break;
      case 100: for(int i=digit_count_100; i<=MAX_DIGIT; i++)
                  count=switchLoop(MAKE_POUND-(i*100),50,count,digit)+1;
              break;
    }
    return count;
  }
}
