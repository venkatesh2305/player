#include <stdio.h>

int main() 
{
	int n,i,j,count=0;
	int a[100];
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		scanf("%d ",&a[i]);
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			if(a[i]==a[j] && i!=j)
			{
				count=count+1;	
			}

		}
		if(count==0)
	{
		printf("%d",a[i]);
	}
	}
	return 0;
}
