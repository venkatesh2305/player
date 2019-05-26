import java.util.*;
public class SentenceSpace {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the sentence");
    String str=scan.nextLine(); 
    str=str.replaceAll("\\s", "");
    System.out.println(str);    
    }
}
