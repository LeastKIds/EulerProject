class test
{
  public static void main(String[] args)
  {
    int[][] pyramid=new int[4][];
    pyramid[0]=new int[] {3};
    pyramid[1]=new int[] {7,4};
    pyramid[2]=new int[] {2,4,6};
    pyramid[3]=new int[] {8,5,9,3};

    final int FLOOR=4;

//    for(int i=0; i<FLOOR; i++)
//    {
//      for(int j=0; j<=i; j++)
//        System.out.print(pyramid[i][j] + " ");
//      System.out.println();
//    }

    int sum=0, max=0;
    int n;
    int[] fork=new int[FLOOR-1];

    boolean special=false;
    for(int i=1; i<=4; i++)
    {
      sum=0;
      n=FLOOR-i;

      //fork rollback
      for(int k=0; k<FLOOR-1; k++)
        fork[k]=0;

      for(int j=FLOOR-1; j>=0; j--)
      {
        if(n==j || n==0)
          special=true;
        else if(fork[j-1]!=0)
          n-=1;
        else
          fork[j-1]=1;

        System.out.println(pyramid[j][n]);
        sum+=pyramid[j][n];
        if(special && n!=0)
          n--;
      }
      System.out.println();

      if(max<sum)
        max=sum;
      special=false;
    }

    System.out.println(max);
  }
}
