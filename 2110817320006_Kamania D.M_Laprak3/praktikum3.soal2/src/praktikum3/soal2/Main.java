//Main praktikum3.soal2

package praktikum3.soal2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nama = "", jenis_kepemimpinan="", nama_pemimpin="";
        int tanggal_kemerdekaan=0, bulan_kemerdekaan=0, tahun_kemerdekaan=0;
        Scanner input = new Scanner(System.in);
        Negara negara = new Negara(nama, jenis_kepemimpinan, nama_pemimpin, tanggal_kemerdekaan, bulan_kemerdekaan, tahun_kemerdekaan);
        LinkedList<Negara> llNegara = new LinkedList<Negara>();

        int ulang;
        ulang = input.nextInt();

        for (int i=0; i<ulang; i++){
            Negara c = new Negara(nama, jenis_kepemimpinan, nama_pemimpin, tanggal_kemerdekaan, bulan_kemerdekaan, tahun_kemerdekaan);
            c.getData();
            llNegara.add(c);
        }

        for (int i = 0; i < llNegara.size(); i++){
            Negara nIndex = llNegara.get(i);
            nIndex.tampilkan();
    }
    }
}