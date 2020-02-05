//https://limkydev.tistory.com/178



import java.util.LinkedList;

class test_2
{
  public static void main(String[] args)
  {
    int n=9;
    int r=5;

    LinkedList<Integer> perArr=new LinkedList<Integer>();
    int[] perCheck=new int[n];
    String[] oneToFivePermutation=new String[9*8*7*6*5];
    int oneToFivePermutationCount=0;
    permutation(n,r,perArr,perCheck,oneToFivePermutation,oneToFivePermutationCount);
    for(int i=0; i<oneToFivePermutation.length; i++)
      System.out.println(oneToFivePermutation[i]);
  }

  public static void permutation(int n, int r, LinkedList<Integer> perArr, int[] perCheck, String[] oneToFivePermutation, int oneToFivePermutationCount)
  {
    if(perArr.size()==r)
    {
      for(int i=0; i<perArr.size(); i++)
        oneToFivePermutation[oneToFivePermutationCount]+=perArr.get(i);
      oneToFivePermutationCount++;
      return;
    }

    for(int i=1; i<=n; i++)
      if(perCheck[i-1]==0)
      {
        perArr.add(i);
        perCheck[i-1]=1;
        permutation(n,r,perArr,perCheck, oneToFivePermutation,oneToFivePermutationCount);
        perCheck[i-1]=0;
        perArr.removeLast();
      }
  }
}
