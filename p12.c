#include <stdio.h>
int main()
{
	int n,s[10],k,temp=0,i,j;
	scanf("%d %d\n",&n,&k);
	for(i=0;i<n;i++)
	{
	    scanf("%d",&s[i]);
	}
	for(i=0;i<k;i++)
	{
	    temp=s[n-1];
	    for(j=n-1;j>=0;j--)
	    {
	       s[j]=s[j-1];
	    }
	    s[0]=temp;
	}
	for(i=0;i<n;i++)
	{
	    printf("%d ",s[i]);
	}
	return 0;
}
