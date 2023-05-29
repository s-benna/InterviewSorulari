package gunlukcalisma01;

import java.util.Scanner;

public class day01 {

    public static void main(String[] args) {

        /*
          TASK-02: Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
                   return eden metod yaziniz.

          ornek:   input            output
                  elma  2           eaea
                  army  3           ayayay
         */



        //TASK-03: Kullanıcıdan alacağınız bir Stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        System.out.println("Herhangi bir dilde cumle yaziniz...");//Kullaniciyi yonlendir
        Scanner task3 = new Scanner(System.in);//her zaman ki gibi "new"

        String input = task3.nextLine();//nextLine dememizin sebbei datanin hepsini alabilmek
        boolean a1 = input.contains(" ");
        System.out.println("TASK-03: " + a1);


       /* TASK-04: Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */

        System.out.println("Adinizi ve Soyadinizi yazin");
        Scanner task4 = new Scanner(System.in);

        String input1 = task4.nextLine();
        String ab = input1.split(" ")[0];
        String cd = input1.split(" ")[1];

        System.out.println("Isim: " + ab);
        System.out.println("Soyisim: " + cd);




    }
}
