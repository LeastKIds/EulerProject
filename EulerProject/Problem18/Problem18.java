class Problem18
{
  public static void main(String[] args)
  {
      //number setting
      String number = "75 95 64 17 47 82 18 35 87 10 20 04 82 47 65 19 01 23 75 03 34 88 02 77 73 07 63 67 99 65 04 28 06 16 70 92 41 41 26 56 83 40 80 70 33 41 48 72 33 47 32 37 16 94 29 53 71 44 65 25 43 91 52 97 51 14 70 11 33 28 77 73 17 78 39 68 17 57 91 71 52 38 17 14 91 43 58 50 27 29 48 63 66 04 68 89 53 67 30 73 16 69 87 40 31 04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";
      String[] singleNumber=number.split("\\s");

      //pyramid setting
      final int FLOOR=15;
      int[][] pyramid=new int[FLOOR][];
      for(int i=0; i<FLOOR; i++)
        pyramid[i]=new int[i+1];

      int count=0;
      for(int i=0; i<FLOOR; i++)
        for(int j=0; j<=i; j++)
        {
          pyramid[i][j]=Integer.parseInt(singleNumber[count]);
          count++;
        }

      //main calculation
      for(int i=FLOOR-2; i>=0; i--)
      {
        for(int j=0; j<=i; j++)
        {
          if(pyramid[i+1][j]>=pyramid[i+1][j+1])
            pyramid[i][j]+=pyramid[i+1][j];
          else
            pyramid[i][j]+=pyramid[i+1][j+1];
        }
      }
      System.out.println(pyramid[0][0]);

  }
}
