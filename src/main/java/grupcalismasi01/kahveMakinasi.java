package grupcalismasi01;

import java.util.Scanner;

public class kahveMakinasi {
    public static void main(String[] args) {

         /*   todo ----------------------------------
        Sistem bize şu soruyu sorsun: "Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):
         "   Konsolda aynen böyle  yazmalı. Parantez içi de konsolda olsun.
       String sut olusturun.
                                                                           todo 2.Koşul Bölümü
       eğer String sut,  evet   e eşitse,konsola, Süt ekleniyor... yazısı gelsin.
        --(Büyük küçük harf duyarlı olmaması için String methodu kullanın. Olması gereken ihtimaller:
         Evet, EVET, EvEt,EVEt vs.
      eğer String sut, hayır a eşit ise, konsola , Süt eklenmiyor  yazısı gelsin.
                                                                                    todo ----------------------------------
        Sistem bize "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : " şeklinde bir soru sorsun.
        (Büyük küçük harf duyarlılıgı olmaması için string method kullanın.
        String seker oluşturunuz.
                                                                todo 3.Koşul Bölümü
        todo if(){
        Eğer String seker   Evet e eşitse ,  sistem bize "Kaç şeker olsun?" sorusunu sormalı.
        Sorunun altına int kacSeker  oluşturunuz.
        Şeker sayısını giriniz.
        Ve konsola   şunu yazdırınız örnek: 5 şeker ekleniyor.  (ipucu: Bu kodların heosi if bloğunun içerisinde olacak)
        todo }   */


        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Hangi Kahveyi istersiniz\n"+
                            "1.Turk kahvesi\n"+
                            "2.Filtre Kahve\n"+
                            "3.Espresso");

        String kaffe = input.nextLine();

            if (kaffe.equalsIgnoreCase("Turk kahvesi")){

                String tercih = input.nextLine();
                if (tercih.equalsIgnoreCase("Evet")){
                }else {
                System.out.println("Turk kahveniz hazirlaniyor..");
            } break;
            } else if (kaffe.equalsIgnoreCase("Filtre kahve")) {
                System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız): ");
                System.out.println("Filtre kahveniz hazirlaniyor..");
                break;
            } else if (kaffe.equalsIgnoreCase("Espresso")) {
                System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız): ");
                System.out.println("Espresso'nuz hazirlaniyor..");
                break;
            } else {
                System.out.println("Lutfen gecerli bir tercih seciniz!!");
            }
        }while(true);
        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız): ");
        String tercih = input.nextLine();
        if (tercih.equalsIgnoreCase("evet")){
            System.out.println("Sutunuz ekleniyor..");
        } else if (tercih.equalsIgnoreCase("hayir")) {
            System.out.println("Sut eklenmiyor!!");
        }


    }
}
