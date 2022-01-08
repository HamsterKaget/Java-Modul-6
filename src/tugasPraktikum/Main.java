package tugasPraktikum;

import java.util.Arrays;

import javax.swing.*;

public class Main {
    
    // Code by @Radja Aulia Al Ramdani => github.com/HamsterKaget
    public static void main(String[] args) {
        
        int data[][]={
            {4,6,4,2,8,4,2,10},
            {4,6,4,2,8,4,2,10}
        };

        
        // Looping Menggunakan While
        System.out.println("\n== Looping Menggunakan While ==\n");

        int a = 0;
        while(a < data.length) {
            int b = 0;
            while(b < data[a].length) {
                System.out.print(data[a][b] + " ");
                b++;
            }
            a++;
            System.out.println();
        }

        

        // Looping Menggunakan do while
        System.out.println("\n== Looping Menggunakan do while ==\n");
        int c = 0;
        do {
            int d = 0;
            do {
                System.out.print(data[c][d] + " ");
                d++;
            } while (d < data[c].length);
            c++;
            System.out.println();
        } while (c < data.length);




        // Looping Menggunakan For 
        System.out.println("\n== Looping Menggunakan For ==\n");

        for(int e = 0; e < data.length; e++) {
            for(int f = 0; f < data[e].length; f++) {
                System.out.print(data[e][f] + " ");
            }
            System.out.println();
        }

        // Looping Menggunakan For Each
        System.out.println("\n== Looping Menggunakan For Each ==\n");

        for(int[] g : data) {
            for(int h : g) {
                System.out.print(h + " ");
            }
            System.out.println();
        }



        /* Code Untuk Mencari Rata Rata Array */
        System.out.println("\n== Rata Rata Array ==\n");

        double total = 0;
        int totalIndex = 0;

        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                total += data[i][j];
                totalIndex++;
            }
        }

        double average = total / totalIndex;

        System.out.println("\nNilai Total Semua Array Adalah : " + total);
        System.out.println("Jumlah Total Index Semua Array Adalah : " + totalIndex);
        System.out.println("Nilai Rata Rata dari Semua Array Adalah : " + average);
        System.out.println();





        /* Code Untuk Mencari Index Array dan Mengubahnya */
        System.out.println("\n== Index dan Swap Array ==\n");

        // Mengambil Input
        String Input = JOptionPane.showInputDialog("Masukan Nilai Element Yang Ingin Kamu Cari");

        int request = Integer.parseInt(Input);

        for(int k = 0; k < data.length; k++) {
            for(int l = 0; l < data[k].length; l++) {
                if(data[k][l] == request) {
                    JOptionPane.showMessageDialog(null, "Nilai " + request + " Terdapat Pada Index ke : " + l + " di array ke : " + k);
                    int x = JOptionPane.showConfirmDialog(null, "Ubah Nilai Dari Index Tadi ? ", "Program Array by Radja", JOptionPane.YES_NO_OPTION);

                    switch( x ) {
                        case 0: 
                        String inputBaru = JOptionPane.showInputDialog("Masukan Nilai Baru Kedalam Index " + l + " di Array ke " + k);

                        int nilaiBaru = Integer.parseInt(inputBaru);

                        data[k][l] = nilaiBaru;
                        
                        JOptionPane.showMessageDialog(null, "Berhasil Menganti Indek ke " + l + " Pada Array ke " + k + " Menjadi " + nilaiBaru );
                        break;
                        case 1:
                        JOptionPane.showMessageDialog(null, "Kamu Tidak Mengubah Nilai Dari Indek Ini ");
                        break;
                    }
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Data Array Yang Baru\n" + Arrays.deepToString(data));
        System.out.println();
        System.out.println("Data Array Yang Baru\n" + Arrays.deepToString(data) );

        /* Code Untuk Menjumlahkan Semua Element */
        int totalGanjil = 0;
        int totalGenap = 0;

        for(int m = 0; m < data.length; m++) {
            for(int n = 0; n < data[m].length; n++) {
                if(n % 2 == 0) {
                    totalGenap += data[m][n];
                } else {
                    totalGanjil += data[m][n];
                }
            }
        }

        System.out.println("Nilai Total Semua Index Genap Adalah : " + totalGenap);
        System.out.println("Nilai Total Semua Index Ganjil Adalah : " + totalGanjil);







    }
}
