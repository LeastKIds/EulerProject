class test
{
  public static void main(String[] args)
  {
    String number="75 95 64 17 47 82 18 35 87 10 20 04 82 47 65 19 01 23 75 03 34";
    String[] singleNumber=number.split("\\s");

    final int FLOOR=6;
    int[][] pyramid=new int[FLOOR][];
    for(int i=0; i<FLOOR; i++)
      pyramid[i]=new int[i+1];

    int singleNumberStack=0;
    for(int i=0; i<FLOOR; i++)
        for(int j=0; j<=i; j++)
      {
        pyramid[i][j]=Integer.parseInt((singleNumber[singleNumberStack]));
        singleNumberStack++;
      }

    int[][] route=new int[FLOOR-3][(FLOOR-3)*2];
    int count=0;
    boolean first=true;
    for(int i=FLOOR-2; i>1; i--)
    {
      count=0;
      for(int j=1; j<i; j++)
      {
        if(first)
        {
          route[i-2][count]=pyramid[i][j]+pyramid[i+1][j];
          System.out.println(route[i-2][count] + " " + count);
          count++;
          route[i-2][count]=pyramid[i][j]+pyramid[i+1][j+1];
          System.out.println(route[i-2][count] + " " + count);
          count++;
        }
        else
        {
          route[i-2][count]=route[i-1][count]+route[i-1][count+1];
        }
      }
      first=false;
    }

  }
}
