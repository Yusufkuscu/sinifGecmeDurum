import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        Scanner scan = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz : ");
        mat = scan.nextInt();
        System.out.println("Fizik notunuzu giriniz : ");
        fizik = scan.nextInt();
        System.out.println("Türkçe notunuzu giriniz : ");
        turkce = scan.nextInt();
        System.out.println("Kimya notunuzu giriniz : ");
        kimya = scan.nextInt();
        System.out.println("Müzik notunuzu giriniz : ");
        muzik = scan.nextInt();

        double toplam=0;
        if(mat>=0 && mat<=100){
            toplam +=mat;
        }
        if(fizik>=0 && fizik<=100){
            toplam +=fizik;
        }
        if(turkce>=0 && turkce<=100){
            toplam +=turkce;
        }
        if(kimya>=0 && kimya<=100){
            toplam +=kimya;
        }
        if(muzik>=0 && muzik<=100){
            toplam +=muzik;
        }

        double notOrtalamasi = toplam /5;

        if (notOrtalamasi>=55){
            System.out.println("Not Ortalaması : " +notOrtalamasi + " Sınıfı Geçtiniz.");
        }else {
            System.out.println("Not Ortalaması : " +notOrtalamasi + " Sınıfta Kaldınız.");
        }

    }
}
