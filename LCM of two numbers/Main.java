#include<stdio.h>
int main()
{
  int a,b,i,max,lcm;
  scanf("%d%d",&a,&b);
  max=a>b?a:b;
  for(i=0;i<max;i++)
  {
    if(max%a==0 && max%b==0)
    {
      lcm=max;
      break;
    }
    max++;
  }
  printf("%d",lcm);
}
