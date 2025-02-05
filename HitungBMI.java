package belajar;

import java.util.Scanner;

public class HitungBMI {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        float badan,tinggi;
        System.out.print("Masukkan Berat badan = ");
        badan = input.nextInt();
        System.out.print("Masukkan Tinggi Badan = ");
        tinggi = input.nextInt();
        float convert = tinggi / 100;
        float hasil = badan / (convert*convert);
        System.out.println("BMI mu adalah = " + hasil);
        if (hasil >= 0){
            if (hasil < 18.5){
                System.out.println("Kategori kurus");
            }else {
                if (hasil < 24.9){
                    System.out.println("Kategori ideal");
                }else {
                    if ( hasil < 29.9) {
                        System.out.println("Kategori Overweight");
                    }else {
                        System.out.println("Kategori Obesitas");
                    }
                }
            }
        } else {
            System.out.println("Data tidak valid");
        }
    }
}
