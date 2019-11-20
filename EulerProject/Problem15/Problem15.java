class Problem15
{
  public static void main(String[] args)
  {
    final int LENTH=21;
    long[][] matrix=new long[LENTH][LENTH];
    for(int i=0; i<LENTH; i++) { matrix[0][i]=1; matrix[i][0]=0; }

    for(int i=1; i<LENTH; i++)
      for(int j=1; j<LENTH; j++)
        matrix[i][j]=matrix[i][j-1]+matrix[i-1][j];

    System.out.println(matrix[LENTH-1][LENTH-1]*2);
  }
}
