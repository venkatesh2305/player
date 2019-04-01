#include <stdio.h>
int main()
{
    int n,s[50],i,j,t=0;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&s[i]);
    }
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if(s[i]==s[j])
            {
                t++;
            }
        }
        if(t==1)
        {
            printf("%d",s[i]);
        }
    }
    return 0;
}
