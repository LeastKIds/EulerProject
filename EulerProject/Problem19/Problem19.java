class Problem19
{
  public static void main(String[] args)
  {
    int day=6;  // 1901/01/06 is sunday
    int count=0;

    for(int year=1901; year<=2000; year++)
      for(int month=1; month<=12;)
      {
        day+=7;
        if(month==2)
        {
          if(((year%4==0 && year%100!=0) || year%400==0) && day>29)
          {
            day-=29;
            month++;
          }
          else if(day>28)
          {
            day-=28;
            month++;
          }
        }
        else if((month==4 || month==6 || month==9 || month==11) && day>30)
        {
            day-=30;
            month++;
        }
        else if(day>31)
        {
            day-=31;
            month++;
        }

        if(day==1)
        {
          count++;
          System.out.println(year);
          System.out.println(month);
          System.out.println(day);
        }

        }

    System.out.println();
    System.out.println(count);

  }
}
