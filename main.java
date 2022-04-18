import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik,total=0,counter=0,ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat= input.nextInt();
        if((mat>=0 && mat <=100)) {
            total += mat;
            counter++;
        }else{
            mat=0;
        }

        System.out.print("Türkçe notunuz : ");
        turkce=input.nextInt();
        if((turkce>=0 && turkce <=100)) {
            total += turkce;
            counter++;
        }else{
            turkce=0;
        }

        System.out.print("Fizik Notunuz : ");
        fizik=input.nextInt();
        if((fizik>=0 && fizik <=100)) {
            total += fizik;
            counter++;
        }else{
            fizik=0;
        }

        System.out.print("Kimya notunuz : ");
        kimya=input.nextInt();
        if((kimya>=0 && kimya <=100)) {
            total += kimya;
            counter++;
        }else{
            kimya=0;
        }

        System.out.print("Müzik Notunuz: ");
        muzik=input.nextInt();
        if((muzik>=0 && muzik <=100)) {
            total += muzik;
            counter++;
        }else{
            muzik=0;
        }

        ortalama=total/counter;
        if(ortalama<55){
            System.out.println("Sınıfta Kaldınız");

        }else{
            System.out.println("Tebrikler sınıfı geçtiniz ! ");

        }
        System.out.println("Ortalamanız : " + ortalama);
    }
}
