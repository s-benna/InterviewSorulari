package gunlukcalisma01;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
  /*   TASK : Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya musteri karti olup olmadigini sorun
              Musteri karti varsa ve +10 urunden fazla alirsa %20, yoksa %15 indirim yapin+
              Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10 indirim yapan
              code create ediniz. */



        System.out.println("Lutfen urun adedi giriniz..");
        Scanner input = new Scanner(System.in);
        int urunadet = input.nextInt();

        System.out.println("Lutfen urunun liste fiyatini giriniz..");
        int listefiyati = input.nextInt();

        System.out.println("Musteri kartiniz var ise 'Y', yok ise 'N' basiniz..");
        String uyelikkarti = input.next().toLowerCase();


        double iskonto1 = (listefiyati*80)/100;
        double iskonto2 = (listefiyati*85)/100;
        double iskonto3 = (listefiyati*90)/100;


        if ( uyelikkarti.equalsIgnoreCase("Y") && 10<=urunadet){
            System.out.println("Uye 10 ve uzeri sipariste %20 indirim: " + iskonto1);//uyelik icin
        } else if (uyelikkarti.equalsIgnoreCase("N") && 10>urunadet) {
            System.out.println("Uye degil 10'dan fazla siparis %15 indirim: " + iskonto2);//uye disi
        } else if (uyelikkarti.equalsIgnoreCase("N") && 10<urunadet) {
            System.out.println("Uye degil 10'dan az siparis %10 indirim: " + iskonto3);//uye disi 10dan az alim
        } else {
            System.out.println("Uye olsaniz dahi 10'dan az alimlarda normal fiyat gecerlidir..");
        }


    }//main
}//class
