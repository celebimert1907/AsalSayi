package AsalSayiBulma;

import java.util.Scanner;

public class AsalSayiHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x;
        int y;

        System.out.println("Sayi araligini belirleyiniz.");
        System.out.println("Baslagic sayisi: ");
        x = input.nextInt();
        System.out.println("Bitis sayisi: ");
        y = input.nextInt();
        int sayac = 0;

        for (int i = x ; i<y; i++){
            for (int a = 2; a<i; a++){
                if (i%a != 0 ){
                    sayac ++;
                    if(sayac == i-2){
                        System.out.println(i + " asal sayidir.");
                        sayac = 0;
                    }
                }else {
                    System.out.println(i + " asal sayi degildir.");
                    sayac = 0;
                    break;
                }
            }
        }
    }
}

