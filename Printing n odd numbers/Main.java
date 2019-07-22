#include <stdio.h>
int main() 
{
	int n,i,a;
    scanf("%d",&n);
    a=2*n;
   for(i=1;i<=a;i+=2)
   {
     if(i%2!=0)
    printf("%d\n",i);
   }
    return 0;
}