#include <stdio.h>

int main() 
{
	char a[100];
	int n,m,i;
	scanf("%s",a);
	for(i=0;a[i]!='\0';i++)
	{
		if(a[i]=='x' && a[i]=='y' && a[i]=='z')
		{
			n=a[i];
			m=n-23;
			a[i]=m;
		}
		else
		{
		n=a[i];
		m=n+3;
		a[i]=m;
		}
	}
	printf("%s",a);
	return 0;
}
