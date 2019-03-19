#include<stdio.h>
#include<conio.h>
void main()
{
    char a[100];
    int i,n,temp;
    scanf("%s",a);
    n=strlen(a);
    for(i=0;i<n;i++)
    if(i%2!=0)
    {
    temp=a[i];
    a[i]=a[i-1];
    a[i-1]=temp;
    }
    printf("%s",a);
    getch();
}
