#include<stdio.h>
#include<conio.h>
int main()
{
    int n,r,s,sum=0;
    scanf("%d",&n);
    while(n>0)
{
    r=n%10;
    s=r*r;
    sum=sum+s;
    n=n/10;
}
printf("%d",sum);
return 0;
}
