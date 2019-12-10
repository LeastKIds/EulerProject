import java.util.ArrayList;

class test
{
  public static void main(String[] args)
  {
    int sum=0;
    int sum_sub=1;

    for(int i=2; i<10; i++)
      sum_sub*=i;

    sum_sub*=2;
    sum+=sum_sub;
    sum_sub=1;

    for(int i=2; i<9; i++)
      sum_sub*=i;

    sum_sub*=6;
    sum+=sum_sub;
    sum_sub=1;

    for(int i=2; i<8; i++)
      sum_sub*=i;

    sum_sub*=6;
    sum+=sum_sub;
    sum_sub=1;

    for(int i=2; i<7; i++)
      sum_sub*=i;

    sum_sub*=2;
    sum+=sum_sub;
    sum_sub=1;

    for(int i=2; i<6; i++)
      sum_sub*=i;

    sum_sub*=5;
    sum+=sum_sub;
    sum_sub=1;

    for(int i=2; i<5; i++)
      sum_sub*=i;

    sum_sub*=1;
    sum+=sum_sub;
    sum_sub=1;

    for(int i=2; i<4; i++)
      sum_sub*=i;

    sum_sub*=2;
    sum+=sum_sub;
    sum_sub=1;

    for(int i=2; i<3; i++)
      sum_sub*=i;

    sum_sub*=2;
    sum+=sum_sub;

    System.out.println(sum);



  }
}
