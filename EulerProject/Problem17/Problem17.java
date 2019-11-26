class Problem17
{
  public static void main(String[] args)
  {
    int sum=0, temporarily=0;
    int figure;

    // one~twenty letter length setting
    String[] one_twenty = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve",
  "Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty"};
    int[] one_twenty_length = new int[20];
    for(int i=0; i<20; i++)
      one_twenty_length[i]=one_twenty[i].length();

    // tenth digit letter length setting
    String[] twenty_tenthDigit = {"Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    int[] twenty_tenthDigit_length = new int[8];
    for(int i=0; i<8; i++)
      twenty_tenthDigit_length[i]=twenty_tenthDigit[i].length();

    // hundred letter length setting
    String hundred="hundred";
    int hundred_length=hundred.length();

    // thousand letter length setting
    String thousand="thousand";
    int thousand_length=thousand.length();

    // remind letter setting
    int and_length=3;

    for(int i=1; i<=1000; i++)
    {
      temporarily=i;
      if(i==1000)  { figure=4; }
      else if(i>99) { figure=3; }
      else { figure=2; }

      switch(figure)
      {
        case 4:
          sum+=thousand_length; sum+=one_twenty_length[0];  break;
        case 3:
          sum+=one_twenty_length[temporarily/100-1]; sum+=hundred_length;
          if(temporarily%100==0)  { break;  }
          sum+=and_length;
          temporarily-=(temporarily/100)*100;

        case 2:
          if(temporarily>20)
          {
            sum+=twenty_tenthDigit_length[temporarily/10-2];
            if(temporarily%10==0) { break;  }
            sum+=one_twenty_length[temporarily%10-1];
          }
          else
            sum+=one_twenty_length[temporarily-1];

      }
    }
    System.out.println(sum);
  }
}
