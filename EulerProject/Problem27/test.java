import java.util.ArrayList;

class test
{
  public static void main(String[] args)
  {
    ArrayList<Integer> test=new ArrayList<>();
    ArrayList<Integer> test2=new ArrayList<>();
    ArrayList<Integer> test3=new ArrayList<>();

    test.add(1);
    test.add(2);
    test.add(3);

    test2.add(10);
    test2.add(20);
    test2.add(30);

    test3.add(test);
    test3.add(test2);

  }
}
