import java.util.Scanner;
public class Ex {
    
    public static void main(String[] args) {
        int i;
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int r = scan.nextInt();
        for(i=r;i>=1;i--) 
            if(l%i==0 && r%i==0)
                { 
            System.out.println(i);
            break; 
        } 
    } 
}
