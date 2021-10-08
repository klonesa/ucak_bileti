package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int km,yas,tip;
        System.out.println("Kilometre :");
        km=input.nextInt();
        System.out.println("Yaşınız :");
        yas=input.nextInt();
        System.out.println("Yolculuk tipi - Tek Yön (1) - Gidiş-Dönüş (2)");
        tip=input.nextInt();
        if(km<1){
            throw new Exception("Hatalı veri Girdiniz");
        }
        int fiyat=(km*1/10);
        fiyat=yas<12?fiyat*1/2:
                yas>=12&&yas<25?fiyat-=fiyat*1/10:
                        yas>65?fiyat-=fiyat*3/10:
                                tip==2?fiyat-=fiyat*1/5:fiyat;
        System.out.println("Fiyat "+fiyat);
    }
}
