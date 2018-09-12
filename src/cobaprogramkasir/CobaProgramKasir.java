package cobaprogramkasir;

import java.io.*;
import java.util.Scanner;
import java.util.logging.*;

public class CobaProgramKasir {

      public static void main(String[] args) {
          Scanner ABC = new Scanner(System.in);
        String kode="";
        int jumlah=0;
        int harga=0;
        byte proses_diulang;
        String nama="";
        String nama_kasir="Faradila Rahmandasari";
        float diskon;
        int total;
        System.out.println("======================================="); 
        System.out.println("==============RECEH  MART==============");
        System.out.println("=======================================");
        System.out.println("Nama Kasir : " + nama_kasir);
        System.out.println(" ~ KODE BARANG ~ " +
                "\n *) psl  : Pensil              ~ 3000 " +
                "\n *) pgs  : Penghapus           ~ 2000 " +
                "\n *) rtn  : Rautan              ~ 2500 " +
                "\n *) btk  : Buku tulis kotak    ~ 3000 " +
                "\n *) btg  : Buku tulis bergaris ~ 3500 ");
       
        BufferedReader baca=new BufferedReader(
                new InputStreamReader(System.in));
        try {
       System.out.println("Masukkan Kode Barang : ");
            kode=baca.readLine();
       System.out.println("Masukkan Jumlah Barang : ");
            jumlah=Integer.valueOf(baca.readLine());
        } catch (IOException ex) {
            Logger.getLogger(total.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (kode.equalsIgnoreCase("psl")){
            nama="Pensil";
            harga=3000;
            
        } else if (kode.equalsIgnoreCase("pgs")){
            nama="Penghapus";
            harga=2000;
            
        }else if (kode.equalsIgnoreCase("rtn")){
            nama="Rautan";
            harga=2500;
            
        }else if (kode.equalsIgnoreCase("btk")){
            nama="Buku tulis kotak";
            harga=3000;
            
        }else if (kode.equalsIgnoreCase("btg")){
            nama="Buku tulis bergaris";
            harga=3500;
        }
        
        total = jumlah * harga;
               if (total >= 500000) {
                    diskon=(float) (total*0.50);
               } else if (total >= 200000) {
                   diskon=(float) (total*0.20);
               } else if (total >= 100000) {
                   diskon=(float) (total*0.10);
               } else {
                    diskon=0;
               }     
               
        harga=jumlah*harga;
        total=(int) (harga-diskon);
        
        System.out.println("");
        System.out.println("=======================================");
        System.out.println("===========STRUK  PEMBAYARAN===========");
        System.out.println("=======================================");
        
        System.out.println("Kode Barang : "+kode);
               System.out.println("Nama Barang : "+nama);
        System.out.println("Jumlah Barang : "+jumlah);
               System.out.println("Total Harga : "+harga);
            System.out.println("Potongan Harga : "+diskon);
        System.out.println("Total Bayar : "+total);
        
        System.out.println("");
        
        System.out.println("=======================================");
        System.out.println("===TERIMA KASIH ATAS KEDATANGAN ANDA===");
        System.out.println("=======================================");
        System.out.println("");
    }
}