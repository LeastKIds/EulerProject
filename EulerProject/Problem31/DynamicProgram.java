//  http://euler.synap.co.kr/forum_list.php?p=31&pg=3
//  java DynamicProgram



class DynamicProgram
{
  public static void main(String[] args)
  {
    int coin[]= {1,2,5,10,20,50,100,200};
		int num[]=new int[201];
		int i,j;
		for(j=0;j<201;j++)
			num[j]=1;
		for(i=1;i<coin.length;i++) {
			for(j=1;j<201;j++) {
				if(j>=coin[i])
					num[j]+=num[j-coin[i]];
			}
		}
		System.out.println(num[200]);
  }
}
