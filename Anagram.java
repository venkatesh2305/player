import java.util.*;
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        int count=0;
        String str="kabali";
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the no of strings");
        byte n=scan.nextByte();
        System.out.println("enter the strings one by one");
        String[] arr= new String[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.next();
        }
        for(int i=0;i<n;i++){
        if(arr[i].length()==str.length()){
            char[] a1= str.toCharArray();
            Arrays.sort(a1);     
            char[] a2= arr[i].toCharArray();
            Arrays.sort(a2); 
                if(Arrays.equals(a1,a2)){
                    count++;
                }
          }
        }
        System.out.println(count);
    }
    
    
}
