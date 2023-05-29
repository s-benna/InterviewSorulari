package gunlukcalisma01;

import java.util.Scanner;

public abstract class bankaapp {
    /*  Task-01
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
    ATM app. method create ediniz.      */
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        System.out.println("Lutfen; Para yatirma, Para cekme, Bakiye ogrenme, Cikis islemlerinden birini seciniz..");
    String islem = input.nextLine().toLowerCase();

    double bakiye = 1000;
    atmApp (bakiye,islem);


    }//main

    private static void atmApp(double bakiye, String islem) {
        Scanner input = new Scanner(System.in);
        if (islem.equalsIgnoreCase("bakiye ogrenme")){
            System.out.println("Hesabinizdaki para miktari: "+bakiye);
        }
        else if (islem.equalsIgnoreCase("para cekme")){
            System.out.println("Cekilecek miktari giriniz...");
            double cekilentutar = input.nextDouble();
            if  (bakiye < cekilentutar){
                System.out.println("Cekilecek miktar bakiyeden fazla olamaz.. Yeniden deneyiniz...");
            } else if (islem.equalsIgnoreCase("para cekme")) {

                System.out.println("Yeni bakiye: "+(bakiye-cekilentutar));
                }

        } else if (islem.equalsIgnoreCase("para yatirma")) {
            System.out.println("Yatirilacak miktari giriniz...");
            double yatanparaile = input.nextDouble();
            System.out.println("Yeni bakiyeniz: "+(yatanparaile+bakiye));
        }
          else if (islem.equalsIgnoreCase("cikis"))
        {
            System.out.println("Iyi gunler dileriz...");
        } else {
            System.out.println("Lutfen gecerli islem giriniz...");
        }


    }//atmApp



}//class
