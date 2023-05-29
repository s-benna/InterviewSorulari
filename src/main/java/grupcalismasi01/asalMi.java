package grupcalismasi01;

import java.util.Scanner;

public class asalMi {
    public static void main(String[] args)
    {
        System.out.println("Sayı Giriniz : ");
        Scanner input = new Scanner(System.in);
        int sayi =input.nextInt();
        boolean durum = true;
        for (int i = 2; i < sayi; i++)
        {
            if (sayi % i == 0)
            {
                durum=false;
                break;
            }
        }
        if (durum==true)
        {
            System.out.println(sayi+" Asal sayidir.");
        }
        else
        {
            System.out.println(sayi+" Asal Değildir.");
        }
    }
}
