package gunlukcalisma01;

import java.util.Scanner;

public class S07_StringManipulations {
    /*
       Kullanıcıdan adını, ikinci adını ve soyadını tek bir satırda girmesini isteyin.
       Ardından ikinci adın ve soyadın ilk karakterini yazdırın.
       Örnek: Mark Hansel Twain ==> HT
   */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen tam adinizi yaziniz");
        String tamIsim = input.nextLine();

        char ad = tamIsim.toUpperCase().split(" ")[1].charAt(0);
        char soyad = tamIsim.toUpperCase().split(" ")[2].charAt(0);
        System.out.println(""+ ad + soyad);

        // basina bosluk koymazsan char ascii degeri verir bosluk koymayi unutmna


    }

}
