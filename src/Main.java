import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int k,n,sonuc=1;
        Scanner input=new Scanner(System.in);
        System.out.print("Ussu alınacak sayıyı giriniz:");//k
        k=input.nextInt();
        System.out.print("Ussu  giriniz:");//n
        n=input.nextInt();
        for(int x=1;x<=n;x++){
            sonuc=sonuc*k;

        }
        System.out.print("Sonuc:"+sonuc);


    }
}