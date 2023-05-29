package grupcalismasi01;

import java.util.Scanner;

/*
  1. Basit bir Kahve makinesi oluşturun.    3 çeşit kahvemiz olsun.
  2. Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
  3.Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
   Örn:
  Hangi Kahveyi İstersiniz?
  1.Türk kahvesi
  2.Filtre Kahve
  3.Espresso
        String hangiKahve oluşturun ve var olan kahvelerden birini yazınız.
         (örn: Türk Kahvesi,  ya da türk kahvesi.  --->  Büyük- küçük harf duyarlı olmaması için String methodu kullanın.)
                                                                                     todo 1. Koşul bölümü
        Eğer kahve Türk kahvesi ise, konsola = Türk kahvesi hazırlanıyor. yazsın.(Dümdüz Türk kahvesi yazmayın.
         String hangiKahve'yi çağırın!!)
        Eğer filtre kahve ise,   konsola = Filtre kahve hazırlanıyor.  yazsın.     (String hangiKahve'yi kullanın !)
        Eğer Espresso ise, konsola =  Espresso hazırlanıyor...   yazsın.  (String hangiKahve'yi kullanın !)
        Eğer yanlış harf girerseniz, konsola = Hatalı tuşlama yaptınız. yazsın. (Hatalı tuslamadan sonra kod
        calısmaya devam edecektir, o konuyu daha görmediniz bu yüzden bastan baslatın.)
                                                                                     todo ----------------------------------
        Sistem bize şu soruyu sorsun: "Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):
         "   Konsolda aynen böyle  yazmalı. Parantez içi de konsolda olsun.
       String sut olusturun.
                                                                           todo 2.Koşul Bölümü
       eğer String sut,  evet   e eşitse,konsola, Süt ekleniyor... yazısı gelsin.
        --(Büyük küçük harf duyarlı olmaması için String methodu kullanın. Olması gereken ihtimaller:
         Evet, EVET, EvEt,EVEt vs.
      eğer String sut, hayır a eşit ise, konsola , Süt eklenmiyor  yazısı gelsin.
                                                                                    todo ----------------------------------
        Sistem bize "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz)" şeklinde bir soru sorsun.
        (Büyük küçük harf duyarlılıgı olmaması için string method kullanın.
        String seker oluşturunuz. */
public class C01_KahveMakinasi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hangi kahveyi istersiniz?\n"+
                "1.Türk kahvesi\n"+
                "2.Filtre Kahve\n"+
                "3.Espresso\n");
        String kahve    = input.nextLine();

        System.out.println("Süt eklememizi ister misiniz? (Evet veya Hayır olarak cevaplayınız): ");
        String tercih   = input.nextLine();

        System.out.println("Şeker ister misiniz? (Evet veya Hayır cevabını veriniz): ");
        String sugar    = input.nextLine();

        System.out.println("Lutfen seker adedini yaziniz..");
        int adet        = input.nextInt();

        System.out.println("Kahve boyutunu yaziniz. Buyuk-Orta");
        String boyut = input.next();



            if (kahve.equalsIgnoreCase("turk kahvesi")){
            if (tercih.equalsIgnoreCase("evet")){
                System.out.println("Sutlu Turk kahveniz hazirlaniyor..\n"+
                                   "Lutfen Biraz Bekleyin..");    }
            else if (sugar.equalsIgnoreCase("evet")) {
                System.out.println("Sekerli kahveniz hazirlaniyor..\n"+
                                   "Lutfen Biraz Bekleyin..");
            } else if (0<adet){
                    System.out.println("Kahvenize "+ adet +" seker ekleniyor!!");

            } else {
                System.out.println("Filtre kahveniz hazirlaniyor..\n"+
                                   "Sade turk kahveniz hazirlaniyor..\n"+
                                   "Lutfen Biraz Bekleyin..");
            }
        }   else if (kahve.equalsIgnoreCase("filtre kahve")) {
            System.out.println("Filtre kahveniz hazirlaniyor..\n"+
                               "Lutfen Biraz Bekleyin..");
            if (tercih.equalsIgnoreCase("evet")){
                System.out.println("Sutlu filtre kahveniz hazirlaniyor..\n"+
                                   "Lutfen Biraz Bekleyin..");
            } else if (sugar.equalsIgnoreCase("evet")) {
                System.out.println("Sekerli kahveniz hazirlaniyor..\n"+
                                   "Lutfen Biraz Bekleyin..");
            } else {
                System.out.println("Sut eklenmiyor\n"+
                                   "Filtre kahveniz hazirlaniyor..\n"+
                                   "Lutfen Biraz Bekleyin..");
            }
        } else if (kahve.equalsIgnoreCase("espresso")) {
            if (tercih.equalsIgnoreCase("evet")){
                System.out.println("Espresso'nuza sut ilave ettiniz..\n"+
                                   "Lutfen Biraz Bekleyin..");
            } else if (sugar.equalsIgnoreCase("evet")) {
                System.out.println("Sekerli kahveniz hazirlaniyor..\n"+
                                   "Lutfen Biraz Bekleyin..");
            } else {
                System.out.println("Sut eklenmiyor\n"+
                                   "Espresso'nuz hazirlaniyor..\n"+
                                   "Lutfen Biraz Bekleyin..");
            }
        }

            if (boyut.equalsIgnoreCase("buyuk")){
                System.out.println("Kahvenizi Buyuk boy sectiniz..");
            } else if (boyut.equalsIgnoreCase("kucuk")) {
                System.out.println("Kahvenizi Kuyuk boy sectiniz..");
            } else {
                System.out.println("Gecerli boyut giriniz..");
            }


    }//main
}//class
