import java.util.Scanner;
public class SortAlph {
    String Temp;
    SortAlph(){
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the no of strings");
        byte n=scan.nextByte();
        System.out.println("enter the string one by one");
        String[] str = new String[n];
        for(int i=0;i<n;i++){
            str[i]=scan.next();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(str[i].length()>str[j].length()){
                    Temp=str[i];
                    str[i]=str[j];
                    str[j]=Temp;
                }
                if(str[i].length()==str[j].length()){
                    if(str[i].compareTo(str[j])>0){
                    Temp=str[i];
                    str[i]=str[j];
                    str[j]=Temp;
                    }
                    
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(str[i]);
        }
    }
    public static void main(String[] args) {
        SortAlph obj=new SortAlph();
    }
}
