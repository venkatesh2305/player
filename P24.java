import java.util.Scanner;
public class New {
    int Temp=0,Tem=0;
    New(){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter  n");
        int n=scan.nextInt();
        System.out.println("enter k");
        int k=scan.nextInt();
        int [] nl=new int[n];
        System.out.println("enter the values of n");
        for(int i=0;i<n;i++){
            nl[i]=scan.nextInt();
        }
        int [] kl=new int[k];
        System.out.println("enter the values of k");
        for(int i=0;i<k;i++){
            kl[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            Temp=nl[0];
            if(Temp<nl[i])
                Temp=nl[i];
        }
        for(int i=0;i<k;i++){
            Tem=kl[0];
            if(Tem<kl[i])
                Tem=kl[i];
        }
        System.out.println(Temp);
        System.out.println(Tem);
    }
    public static void main(String[] args) {
        New obj= new New();
    } 
}
