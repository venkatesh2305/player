#include <stdio.h>
void main()
{
	char a[20];
	int i,n;
	scanf("%s",&a);
	n=strlen(a);
	for(i=0;i<n;i=i+3){
		printf("%c",a[i]);
	}
	getch();
}
