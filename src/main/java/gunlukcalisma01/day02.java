package gunlukcalisma01;

import java.util.Scanner;

public class day02 {
    public static void main(String[] args) {

        /* TASK-5: Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
              Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.*/
        System.out.println(" Adinizi ve Soyadinizi giriniz.. ");
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();

        char first  = userName.trim().toUpperCase().charAt(0);
        char second = userName.trim().toUpperCase().split(" ")[1].charAt(0);
        char third  = userName.trim().toUpperCase().split(" ")[2].charAt(0);

        System.out.println("TASK-5: "+first+"."+second+"."+third+".");


        /*TASK-2: Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
                  return eden metod yaziniz.

         ornek:   **input**        **output**
                   elma  2            eaea
                   army  3           ayayay     */

        Scanner input1 = new Scanner(System.in);
        System.out.println("Lutfen Kelime ve sayi giriniz.");
        String kelime  = input1.nextLine();
        double sayi    = input1.nextDouble();

        char kelime1 = kelime.charAt(0);
        char kelime2 = kelime.charAt(kelime.length()-1);








    }

    //public static String ilkvesonharf (String a, int b) {}


    }














