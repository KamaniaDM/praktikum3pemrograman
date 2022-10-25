//Negara praktikum3.saol2

package praktikum3.soal2;

import java.util.HashMap;
import java.util.Scanner;

public class Negara {
    private String nama, jenis_kepemimpinan, nama_pemimpin;
    private int tanggal_kemerdekaan, bulan_kemerdekaan, tahun_kemerdekaan;

    public Negara(String nama, String jenis_kepemimpinan, String nama_pemimpin, int tanggal_kemerdekaan, int bulan_kemerdekaan, int tahun_kemerdekaan){
        this.nama = nama;
        this.jenis_kepemimpinan = jenis_kepemimpinan;
        this.nama_pemimpin = nama_pemimpin;
        this.tanggal_kemerdekaan = tanggal_kemerdekaan;
        this.bulan_kemerdekaan = bulan_kemerdekaan;
        this.tahun_kemerdekaan = tahun_kemerdekaan;
    }

    public int getBulan(){
        return bulan_kemerdekaan;
    }

    void getData(){
        Scanner scn = new Scanner(System.in);
        nama=scn.nextLine();
        jenis_kepemimpinan=scn.nextLine();
        nama_pemimpin=scn.nextLine();
        if (jenis_kepemimpinan.equalsIgnoreCase("presiden")||jenis_kepemimpinan.equalsIgnoreCase("perdana menteri")) {
            tanggal_kemerdekaan = scn.nextInt();
            bulan_kemerdekaan = scn.nextInt();
            tahun_kemerdekaan = scn.nextInt();
        }
    }

    void tampilkan(){
        HashMap<Integer, String> month = new HashMap<Integer,String>();
        month.put(1, "Januari");
        month.put(2, "Februari");
        month.put(3, "Maret");
        month.put(4, "April");
        month.put(5, "Mei");
        month.put(6, "Juni");
        month.put(7, "Juli");
        month.put(8, "Agustus");
        month.put(9, "September");
        month.put(10, "Oktober");
        month.put(11, "November");
        month.put(12, "Desember");
        if (jenis_kepemimpinan.equalsIgnoreCase("presiden")||jenis_kepemimpinan.equalsIgnoreCase("perdana menteri")) {
        System.out.println("Negara "+nama+" mempunyai "+jenis_kepemimpinan+" bernama "+nama_pemimpin);}
        else if (jenis_kepemimpinan.equalsIgnoreCase("monarki")){
            System.out.println("Negara "+nama+" mempunyai Raja"+" bernama "+nama_pemimpin+"\n");
        }
        if (jenis_kepemimpinan.equalsIgnoreCase("presiden")||jenis_kepemimpinan.equalsIgnoreCase("perdana menteri")) {
        System.out.println("Deklarasi Kemerdekaan pada Tanggal "+tanggal_kemerdekaan+" "+month.get(getBulan())+" "+tahun_kemerdekaan+"\n");}
    }
}