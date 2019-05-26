import java.util.*;
public class PerfectSquare {
    public static void main(String[] args) {
        int count=0,n;
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the value of L");
        int l=scan.nextInt();
        System.out.println("enter the value of r");
        int r=scan.nextInt();
        for(int i=l;i<=r;i++){
            for(int j=1;j<=i;j++){
                n=j*j;
                if(i==n){
                count+=1;
                }
            }
            }
        System.out.println(count);
    }
}
