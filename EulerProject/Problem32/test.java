
import java.util.ArrayList;

class test
{
  public static void main(String[] args)
  {
    ArrayList<Integer> arr=new ArrayList<>();
    for(int i=1; i<5; i++)
      arr.add(i);

    permutation(arr);
  }

  public static void permutation(ArrayList<Integer> arr)
  {
    boolean check=true;

    if(check==false)
    {
      for(int i=0; i<5; i++)
        arr.add(i);
      System.out.println();
      }
    for(int i=0; i<arr.size(); i++)
    {
      System.out.print(arr.get(i));
      if(check)
        arr.remove(i);
      if(arr.size()==0)
        check=false;
      permutation(arr);
    }
    return;
  }
}
