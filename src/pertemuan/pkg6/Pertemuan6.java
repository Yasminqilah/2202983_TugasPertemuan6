package pertemuan.pkg6;

import java.util.Scanner;

public class Pertemuan6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan panjang alas segitiga: ");
        double alas = input.nextDouble();
        
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = input.nextDouble();
        
        System.out.print("Masukkan panjang sisi segitiga: ");
        double sisi = input.nextDouble();
        
        Segitiga segitiga = new Segitiga(alas, tinggi, sisi);
        
        System.out.println("Keliling segitiga: " + segitiga.keliling());
        System.out.println("Luas segitiga: " + segitiga.luas());
    }
}

class Segitiga {
    private double alas;
    private double tinggi;
    private double sisi;

    public Segitiga(double alas, double tinggi, double sisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    public double keliling() {
        return this.sisi * 3;
    }

    public double luas() {
        return 0.5 * this.alas * this.tinggi;
    }
}
