import java.util.Scanner;
public class Ex {
    
    public static void main(String[] args) {
        int i;
        Scanner scan = new Scanner(System.in);
		       int l = scan.nextInt();
         int r = scan.nextInt();
        for(i=1;i<=1000;i++)
            if(i%l==0 && i%r==0)
                {
        System.out.println(i);
        break;    
        }
    }  
}
