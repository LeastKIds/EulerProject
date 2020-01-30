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
    permutation(n,r,perArr,perCheck);
  }

  public static void permutation(int n, int r, LinkedList<Integer> perArr, int[] perCheck)
  {
    if(perArr.size()==r)
    {
      for(int i : perArr)
        System.out.print(i+" ");
      System.out.println();
      return;
    }

    for(int i=1; i<=n; i++)
      if(perCheck[i-1]==0)
      {
        perArr.add(i);
        perCheck[i-1]=1;
        permutation(n,r,perArr,perCheck);
        perCheck[i-1]=0;
        perArr.removeLast();
      }
  }
}
