import java.util.Scanner;
public class Num1 {
    int count=0;
    Num1(){
        System.out.println("enter the number:");
        Scanner scan=new Scanner(System.in);
        String n= scan.next();
        for(int i=0;i<n.length();i++){
        if (Character.isDigit(n.charAt(i))) {
                count+=1;
            }
            }
        if(count==n.length()){
            System.out.println("yes");
        }
            else{
                System.out.println("no");
        }  
    }
    
    public static void main(String [] args){
        Num1 obj=new Num1();
    }
}
