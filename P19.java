import java.util.Scanner;
public class P19 {
    
    public static void main(String[] args) {
        int i,j;
        Scanner scan = new Scanner(System.in);
		       int n = scan.nextInt();

        for(i=2;i<=n;i++)
            {
            if(n%i==0)
                System.out.println(i);
            {
                while(n%i==0)
                {
                  n/=i;
                }
            }
        }
    }  
}
