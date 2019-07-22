#include<stdio.h>
int main()
{
  int n=365,quotient,remainder;
  quotient=n/4;
  remainder=n%4;
  printf("Quotient: %d\nRemainder: %d",quotient,remainder);
  return 0;
}