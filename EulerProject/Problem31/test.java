class test
{
  public static void main(String[] args)
  {
    int count=1;
    count=switchLoop(count);
    System.out.println(count);
  }

  public static int switchLoop(int count)
  {
    count++;
    return count;
  }
}
