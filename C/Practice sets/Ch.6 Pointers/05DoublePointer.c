#include <stdio.h>
int main()
{
  int i=5;
  int *p1=&i;
  int **p2=&p1;

  printf("%d",(**p2));

 
return 0;
}