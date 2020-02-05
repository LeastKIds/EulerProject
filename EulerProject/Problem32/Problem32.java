// 0 * 0000 = 0000
// 00 * 000 = 0000
// combination, permutation
import java.util.LinkedList;

class Problem32
{

  public static void main(String[] args)
  {
    int permutationN=9;
    int permutationR=5;
    LinkedList<Integer> permutationNumber=new LinkedList<>();
    int[] checkNumber=new int[permutationN];
    LinkedList<String> pandigitalOfFive=new LinkedList<>();

    permutation(permutationN, permutationR, permutationNumber, checkNumber, pandigitalOfFive);

    System.out.println(pandigitalOfFive);

  }

  public static void permutation(int permutationN, int permutationR, LinkedList<Integer> permutationNumber, int[] checkNumber,
                                  LinkedList<String> pandigitalOfFive)
  {
    if(permutationNumber.size()==permutationR)
    {
      String savePermutation="";
      for(int i=0; i<permutationR; i++)
        savePermutation+=permutationNumber.get(i)+"";

      pandigitalOfFive.add(savePermutation);
      return;
    }

    for(int i=1; i<=permutationN; i++)
      if(checkNumber[i-1]==0)
      {
        permutationNumber.add(i);
        checkNumber[i-1]=1;
        permutation(permutationN, permutationR, permutationNumber, checkNumber, pandigitalOfFive);
        checkNumber[i-1]=0;
        permutationNumber.removeLast();
      }
  }
}
