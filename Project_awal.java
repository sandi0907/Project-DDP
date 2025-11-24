/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prauts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Cendi
 */
public class Project_awal {
    public static void main (String [] args) throws IOException{
        BufferedReader ip = new BufferedReader (new InputStreamReader(System.in));
        String input;
        int pilih,sp,st;
        double angka,last;
        while(true){
        try{
            System.out.println("          KONVERSI SATUAN");
        System.out.println("1. Panjang/Jarak");
        System.out.println("2. Massa");
        System.out.println("3. Mata Uang");
        System.out.print("Input Pilihan 1-5 : ");
        pilih = Integer.parseInt(ip.readLine());
        
        switch (pilih){
            case 1:
                System.out.println("======= Konversi Panjang/Jarak =======");
                String[] unit = {"Km","Hm","Dam","m","Dm","Cm","Mm"};

                for (int i = 0; i < unit.length; i++){
                System.out.println((i+1) + ". " + unit[i]);}
                System.out.print("Input Satuan Awal 1-7 : ");
                sp = Integer.parseInt(ip.readLine());
                if (sp ==1){
                    System.out.print("Silahkan Masukkan Angka : ");
                    angka = Integer.parseInt(ip.readLine());
                    System.out.print("Silahkan Input Pilihan Konversi : ");
                    st = Integer.parseInt(ip.readLine());
                    if (st == 1){
                    last = angka*1;
                    System.out.println(angka+" Km = "+last+ " Km");
                    }
                    else if (st == 2){
                        last = angka*10;
                    System.out.println(angka+" Km = "+last+" Hm");
                    }
                    else if (st == 3){
                        last = angka*100;
                    System.out.println(angka+" Km = "+last+" Dam");
                    }
                    else if (st == 4){
                        last = angka*1000;
                    System.out.println(angka+" Km = "+last+" m");
                    }
                    else if (st == 5){
                        last = angka*10000;
                    System.out.println(angka+" Km = "+last+" Dm");
                    }
                    else if (st == 6){
                        last = angka*100000;
                    System.out.println(angka+" Km = "+last+" Cm");
                    }
                    else if (st == 7){
                        last = angka*1000000;
                    System.out.println(angka+" Km = "+last+" Mm");
                    }
                    else {
                        System.out.println("Input Tidak Tersedia");
                    }
                }
                else if(sp ==2){
                     System.out.print("Silahkan Masukkan Angka : ");
                    angka = Integer.parseInt(ip.readLine());
                    System.out.print("Silahkan Input Pilihan Konversi : ");
                    st = Integer.parseInt(ip.readLine());
                    if (st == 1){
                    last = angka/10;
                    System.out.println(angka+" Hm = "+last+ " Km");
                    }
                    else if (st == 2){
                        last = angka*1;
                    System.out.println(angka+" Hm = "+last+" Hm");
                    }
                    else if (st == 3){
                        last = angka*10;
                    System.out.println(angka+" Hm = "+last+" Dam");
                    }
                    else if (st == 4){
                        last = angka*100;
                    System.out.println(angka+" Hm = "+last+" m");
                    }
                    else if (st == 5){
                        last = angka*1000;
                    System.out.println(angka+" Hm = "+last+" Dm");
                    }
                    else if (st == 6){
                        last = angka*10000;
                    System.out.println(angka+" Hm = "+last+" Cm");
                    }
                    else if (st == 7){
                        last = angka*100000;
                    System.out.println(angka+" Hm = "+last+" Mm");
                    }
                    else {
                        System.out.println("Input Tidak Tersedia");
                    }
                }
                else if(sp ==3){
                   System.out.print("Silahkan Masukkan Angka : ");
                    angka = Integer.parseInt(ip.readLine());
                    System.out.print("Silahkan Input Pilihan Konversi : ");
                    st = Integer.parseInt(ip.readLine());
                    if (st == 1){
                    last = angka/100;
                    System.out.println(angka+" Dam = "+last+ " Km");
                    }
                    else if (st == 2){
                        last = angka/10;
                    System.out.println(angka+" Dam = "+last+" Hm");
                    }
                    else if (st == 3){
                        last = angka*1;
                    System.out.println(angka+" Dam = "+last+" Dam");
                    }
                    else if (st == 4){
                        last = angka*10;
                    System.out.println(angka+" Dam = "+last+" m");
                    }
                    else if (st == 5){
                        last = angka*100;
                    System.out.println(angka+" Dam = "+last+" Dm");
                    }
                    else if (st == 6){
                        last = angka*1000;
                    System.out.println(angka+" Dam = "+last+" Cm");
                    }
                    else if (st == 7){
                        last = angka*10000;
                    System.out.println(angka+" Dam = "+last+" Mm");
                    }
                    else {
                        System.out.println("Input Tidak Tersedia");
                    }
                }
                else if (sp ==4){
                    System.out.print("Silahkan Masukkan Angka : ");
                    angka = Integer.parseInt(ip.readLine());
                    System.out.print("Silahkan Input Pilihan Konversi : ");
                    st = Integer.parseInt(ip.readLine());
                    if (st == 1){
                    last = angka/1000;
                    System.out.println(angka+" m = "+last+ " Km");
                    }
                    else if (st == 2){
                        last = angka/100;
                    System.out.println(angka+" m = "+last+" Hm");
                    }
                    else if (st == 3){
                        last = angka/10;
                    System.out.println(angka+" m = "+last+" Dam");
                    }
                    else if (st == 4){
                        last = angka*1;
                    System.out.println(angka+" m = "+last+" m");
                    }
                    else if (st == 5){
                        last = angka*10;
                    System.out.println(angka+" m = "+last+" Dm");
                    }
                    else if (st == 6){
                        last = angka*100;
                    System.out.println(angka+" m = "+last+" Cm");
                    }
                    else if (st == 7){
                        last = angka*1000;
                    System.out.println(angka+" m = "+last+" Mm");
                    }
                    else {
                        System.out.println("Input Tidak Tersedia");
                    }
                }
                else if (sp ==5){
                    System.out.print("Silahkan Masukkan Angka : ");
                    angka = Integer.parseInt(ip.readLine());
                    System.out.print("Silahkan Input Pilihan Konversi : ");
                    st = Integer.parseInt(ip.readLine());
                    if (st == 1){
                    last = angka/10000;
                    System.out.println(angka+" Dm = "+last+ " Km");
                    }
                    else if (st == 2){
                        last = angka/1000;
                    System.out.println(angka+" Dm = "+last+" Hm");
                    }
                    else if (st == 3){
                        last = angka/100;
                    System.out.println(angka+" Dm = "+last+" Dam");
                    }
                    else if (st == 4){
                        last = angka/10;
                    System.out.println(angka+" Dm = "+last+" m");
                    }
                    else if (st == 5){
                        last = angka*1;
                    System.out.println(angka+" Dm = "+last+" Dm");
                    }
                    else if (st == 6){
                        last = angka*10;
                    System.out.println(angka+" Dm = "+last+" Cm");
                    }
                    else if (st == 7){
                        last = angka*100;
                    System.out.println(angka+" Dm = "+last+" Mm");
                    }
                    else {
                        System.out.println("Input Tidak Tersedia");
                    }
                }
                else if (sp ==6){
                    System.out.print("Silahkan Masukkan Angka : ");
                    angka = Integer.parseInt(ip.readLine());
                    System.out.print("Silahkan Input Pilihan Konversi : ");
                    st = Integer.parseInt(ip.readLine());
                    if (st == 1){
                    last = angka/100000;
                    System.out.println(angka+" Cm = "+last+ " Km");
                    }
                    else if (st == 2){
                        last = angka/10000;
                    System.out.println(angka+" Cm = "+last+" Hm");
                    }
                    else if (st == 3){
                        last = angka/1000;
                    System.out.println(angka+" Cm = "+last+" Dam");
                    }
                    else if (st == 4){
                        last = angka/100;
                    System.out.println(angka+" Cm = "+last+" m");
                    }
                    else if (st == 5){
                        last = angka/10;
                    System.out.println(angka+" Cm = "+last+" Dm");
                    }
                    else if (st == 6){
                        last = angka*1;
                    System.out.println(angka+" Cm = "+last+" Cm");
                    }
                    else if (st == 7){
                        last = angka*10;
                    System.out.println(angka+" Cm = "+last+" Mm");
                    }
                    else {
                        System.out.println("Input Tidak Tersedia");
                    }
                }
                else if (sp ==7){
                    System.out.print("Silahkan Masukkan Angka : ");
                    angka = Integer.parseInt(ip.readLine());
                    System.out.print("Silahkan Input Pilihan Konversi : ");
                    st = Integer.parseInt(ip.readLine());
                    if (st == 1){
                    last = angka/1000000;
                    System.out.println(angka+" Mm = "+last+ " Km");
                    }
                    else if (st == 2){
                        last = angka/100000;
                    System.out.println(angka+" Mm = "+last+" Hm");
                    }
                    else if (st == 3){
                        last = angka/10000;
                    System.out.println(angka+" Mm = "+last+" Dam");
                    }
                    else if (st == 4){
                        last = angka/1000;
                    System.out.println(angka+" Mm = "+last+" m");
                    }
                    else if (st == 5){
                        last = angka/100;
                    System.out.println(angka+" Mm = "+last+" Dm");
                    }
                    else if (st == 6){
                        last = angka/10;
                    System.out.println(angka+" Mm = "+last+" Cm");
                    }
                    else if (st == 7){
                        last = angka*1;
                    System.out.println(angka+" Mm = "+last+" Mm");
                    }  
                    else {
                        System.out.println("Input Tidak Tersedia");
                    }
                }
                else {
                        System.out.println("Input Tidak Tersedia");
                    }
                break;
            case 2:
                System.out.println("======= Konversi Massa =======");
                String[] unit2 = {"Kg","Hg","Dag","g","Dg","Cg","Mg"};

                for (int i = 0; i < unit2.length; i++){
                System.out.println((i+1) + ". " + unit2[i]);}
                System.out.print("Input Satuan Awal 1-7 : ");
                sp = Integer.parseInt(ip.readLine());
                if (sp ==1){
                    System.out.print("Silahkan Masukkan Angka : ");
                    angka = Integer.parseInt(ip.readLine());
                    System.out.print("Silahkan Input Pilihan Konversi : ");
                    st = Integer.parseInt(ip.readLine());
                    if (st == 1){
                    last = angka*1;
                    System.out.println(angka+" Kg = "+last+ " Kg");
                    }
                    else if (st == 2){
                        last = angka*10;
                    System.out.println(angka+" Kg = "+last+" Hg");
                    }
                    else if (st == 3){
                        last = angka*100;
                    System.out.println(angka+" Kg = "+last+" Dag");
                    }
                    else if (st == 4){
                        last = angka*1000;
                    System.out.println(angka+" Kg = "+last+" g");
                    }
                    else if (st == 5){
                        last = angka*10000;
                    System.out.println(angka+" Kg = "+last+" Dg");
                    }
                    else if (st == 6){
                        last = angka*100000;
                    System.out.println(angka+" Kg = "+last+" Cg");
                    }
                    else if (st == 7){
                        last = angka*1000000;
                    System.out.println(angka+" Kg = "+last+" Mg");
                    }
                    else {
                        System.out.println("Input Tidak Tersedia");
                    }
                }
                else if(sp ==2){
                     System.out.print("Silahkan Masukkan Angka : ");
                    angka = Integer.parseInt(ip.readLine());
                    System.out.print("Silahkan Input Pilihan Konversi : ");
                    st = Integer.parseInt(ip.readLine());
                    if (st == 1){
                    last = angka/10;
                    System.out.println(angka+" Hg = "+last+ " Kg");
                    }
                    else if (st == 2){
                        last = angka*1;
                    System.out.println(angka+" Hg = "+last+" Hg");
                    }
                    else if (st == 3){
                        last = angka*10;
                    System.out.println(angka+" Hg = "+last+" Dag");
                    }
                    else if (st == 4){
                        last = angka*100;
                    System.out.println(angka+" Hg = "+last+" g");
                    }
                    else if (st == 5){
                        last = angka*1000;
                    System.out.println(angka+" Hg = "+last+" Dg");
                    }
                    else if (st == 6){
                        last = angka*10000;
                    System.out.println(angka+" Hg = "+last+" Cg");
                    }
                    else if (st == 7){
                        last = angka*100000;
                    System.out.println(angka+" Hg = "+last+" Mg");
                    }
                    else {
                        System.out.println("Input Tidak Tersedia");
                    }
                }
                else if(sp ==3){
                   System.out.print("Silahkan Masukkan Angka : ");
                    angka = Integer.parseInt(ip.readLine());
                    System.out.print("Silahkan Input Pilihan Konversi : ");
                    st = Integer.parseInt(ip.readLine());
                    if (st == 1){
                    last = angka/100;
                    System.out.println(angka+" Dag = "+last+ " Kg");
                    }
                    else if (st == 2){
                        last = angka/10;
                    System.out.println(angka+" Dag = "+last+" Hg");
                    }
                    else if (st == 3){
                        last = angka*1;
                    System.out.println(angka+" Dag = "+last+" Dag");
                    }
                    else if (st == 4){
                        last = angka*10;
                    System.out.println(angka+" Dag = "+last+" g");
                    }
                    else if (st == 5){
                        last = angka*100;
                    System.out.println(angka+" Dag = "+last+" Dg");
                    }
                    else if (st == 6){
                        last = angka*1000;
                    System.out.println(angka+" Dag = "+last+" Cg");
                    }
                    else if (st == 7){
                        last = angka*10000;
                    System.out.println(angka+" Dag = "+last+" Mg");
                    }
                    else {
                        System.out.println("Input Tidak Tersedia");
                    }
                }
                else if (sp ==4){
                    System.out.print("Silahkan Masukkan Angka : ");
                    angka = Integer.parseInt(ip.readLine());
                    System.out.print("Silahkan Input Pilihan Konversi : ");
                    st = Integer.parseInt(ip.readLine());
                    if (st == 1){
                    last = angka/1000;
                    System.out.println(angka+" g = "+last+ " Kg");
                    }
                    else if (st == 2){
                        last = angka/100;
                    System.out.println(angka+" g = "+last+" Hg");
                    }
                    else if (st == 3){
                        last = angka/10;
                    System.out.println(angka+" g = "+last+" Dag");
                    }
                    else if (st == 4){
                        last = angka*1;
                    System.out.println(angka+" g = "+last+" g");
                    }
                    else if (st == 5){
                        last = angka*10;
                    System.out.println(angka+" g = "+last+" Dg");
                    }
                    else if (st == 6){
                        last = angka*100;
                    System.out.println(angka+" g = "+last+" Cg");
                    }
                    else if (st == 7){
                        last = angka*1000;
                    System.out.println(angka+" g = "+last+" Mg");
                    }
                    else {
                        System.out.println("Input Tidak Tersedia");
                    }
                }
                else if (sp ==5){
                    System.out.print("Silahkan Masukkan Angka : ");
                    angka = Integer.parseInt(ip.readLine());
                    System.out.print("Silahkan Input Pilihan Konversi : ");
                    st = Integer.parseInt(ip.readLine());
                    if (st == 1){
                    last = angka/10000;
                    System.out.println(angka+" Dg = "+last+ " Kg");
                    }
                    else if (st == 2){
                        last = angka/1000;
                    System.out.println(angka+" Dg = "+last+" Hg");
                    }
                    else if (st == 3){
                        last = angka/100;
                    System.out.println(angka+" Dg = "+last+" Dag");
                    }
                    else if (st == 4){
                        last = angka/10;
                    System.out.println(angka+" Dg = "+last+" g");
                    }
                    else if (st == 5){
                        last = angka*1;
                    System.out.println(angka+" Dg = "+last+" Dg");
                    }
                    else if (st == 6){
                        last = angka*10;
                    System.out.println(angka+" Dg = "+last+" Cg");
                    }
                    else if (st == 7){
                        last = angka*100;
                    System.out.println(angka+" Dg = "+last+" Mg");
                    }
                    else {
                        System.out.println("Input Tidak Tersedia");
                    }
                }
                else if (sp ==6){
                    System.out.print("Silahkan Masukkan Angka : ");
                    angka = Integer.parseInt(ip.readLine());
                    System.out.print("Silahkan Input Pilihan Konversi : ");
                    st = Integer.parseInt(ip.readLine());
                    if (st == 1){
                    last = angka/100000;
                    System.out.println(angka+" Cg = "+last+ " Kg");
                    }
                    else if (st == 2){
                        last = angka/10000;
                    System.out.println(angka+" Cg = "+last+" Hg");
                    }
                    else if (st == 3){
                        last = angka/1000;
                    System.out.println(angka+" Cg = "+last+" Dag");
                    }
                    else if (st == 4){
                        last = angka/100;
                    System.out.println(angka+" Cg = "+last+" g");
                    }
                    else if (st == 5){
                        last = angka/10;
                    System.out.println(angka+" Cg = "+last+" Dg");
                    }
                    else if (st == 6){
                        last = angka*1;
                    System.out.println(angka+" Cg = "+last+" Cg");
                    }
                    else if (st == 7){
                        last = angka*10;
                    System.out.println(angka+" Cg = "+last+" Mg");
                    }
                    else {
                        System.out.println("Input Tidak Tersedia");
                    }
                }
                else if (sp ==7){
                    System.out.print("Silahkan Masukkan Angka : ");
                    angka = Integer.parseInt(ip.readLine());
                    System.out.print("Silahkan Input Pilihan Konversi : ");
                    st = Integer.parseInt(ip.readLine());
                    if (st == 1){
                    last = angka/1000000;
                    System.out.println(angka+" Mg = "+last+ " Kg");
                    }
                    else if (st == 2){
                        last = angka/100000;
                    System.out.println(angka+" Mg = "+last+" Hg");
                    }
                    else if (st == 3){
                        last = angka/10000;
                    System.out.println(angka+" Mg = "+last+" Dag");
                    }
                    else if (st == 4){
                        last = angka/1000;
                    System.out.println(angka+" Mg = "+last+" g");
                    }
                    else if (st == 5){
                        last = angka/100;
                    System.out.println(angka+" Mg = "+last+" Dg");
                    }
                    else if (st == 6){
                        last = angka/10;
                    System.out.println(angka+" Mg = "+last+" Cg");
                    }
                    else if (st == 7){
                        last = angka*1;
                    System.out.println(angka+" Mg = "+last+" Mg");
                    }
                    else {
                        System.out.println("Input Tidak Tersedia");
                    }
                    }
                else {
                        System.out.println("Input Tidak Tersedia");
                    }
                break;
            case 3:
                    System.out.println("===== Konversi Mata Uang =====");
                    System.out.println("1. Rupiah");
                    System.out.println("2. US Dollar");
                    System.out.println("3. SG Dollar");
                    System.out.print("Input Satuan Awal 1-3 : ");
                sp = Integer.parseInt(ip.readLine());
                if (sp == 1)
                {
                    System.out.print("Masukkan jumlah : ");
                    angka = Integer.parseInt(ip.readLine());
                    System.out.print("Input Pilihan Konversi : ");
                    st = Integer.parseInt(ip.readLine());
                    if (st == 1){
                        last = angka*1;
                        System.out.println("Rp."+angka+" = Rp."+last);
                    }
                    else if (st == 2){
                        last = angka/16764;
                        System.out.println("Rp."+angka+" = USD."+last);
                    }
                    else if (st == 3){
                        last = angka/12860.40;
                        System.out.println("Rp."+angka+" = SGD."+last);
                    }
                    else {System.out.println("Input Tidak Tersedia");}
                }
                else if (sp == 2){System.out.print("Masukkan jumlah : ");
                    angka = Integer.parseInt(ip.readLine());
                    System.out.print("Input Pilihan Konversi : ");
                    st = Integer.parseInt(ip.readLine());
                    if (st == 1){
                        last = angka*16764;
                        System.out.println("USD."+angka+" = Rp."+last);
                    }
                    else if (st == 2){
                        last = angka*1;
                        System.out.println("USD."+angka+" = USD."+last);
                    }
                    else if (st == 3){
                        last = angka*1.30;
                        System.out.println("USD."+angka+" = SGD."+last);
                    }
                    else {System.out.println("Input Tidak Tersedia");}
                }
                else if (sp == 3){
                System.out.print("Masukkan jumlah : ");
                    angka = Integer.parseInt(ip.readLine());
                    System.out.print("Input Pilihan Konversi : ");
                    st = Integer.parseInt(ip.readLine());
                    if (st == 1){
                        last = angka*12860.40;
                        System.out.println("SGD."+angka+" = Rp."+last);
                    }
                    else if (st == 2){
                        last = angka/1.30;
                        System.out.println("SGD."+angka+" = USD."+last);
                    }
                    else if (st == 3){
                        last = angka*1;
                        System.out.println("SGD."+angka+" = SGD."+last);
                    }
                    else {System.out.println("Input Tidak Tersedia");}
                }
                else {System.out.println("Input Tidak Tersedia");}
                break;
                }       
        }
        catch(Exception ie) {
            System.out.println("Input Tidak Tersedia");
        }
        System.out.print("Ulangi? (y/n): ");
    String ulang = ip.readLine();

    if (!ulang.equalsIgnoreCase("y")) {
        System.out.println("Program selesai.");
        break;
    }
    System.out.println();
    }
}
}
