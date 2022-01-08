package tugasPraktikum;

import java.util.Arrays;

public class Main4 {
    
    public static void main(String[] args) {
        
        String[] mahasiswa={"Joni","Toni","Bekti","Rudi"};
        
        String[] matakuliah={"Daspro","RPL","Jarkom","PCD"};
        
        int[][] nilai= {
            {70,80,50,90},
            {90,40,60,40},
            {50,90,40,40},
            {60,80,80,40}};

            // Mencari Rata Rata 
            double[] rata = new double[nilai.length];

            for(int a = 0; a < nilai.length; a++) {
                double total = 0;
                double average = 0;
                for(int b = 0; b < nilai[a].length; b++) {
                    total += nilai[a][b];
                }
                average = total / nilai[a].length;
                rata[a] = average;
            }


            String[] huruf = new String[nilai.length];

            for(int c = 0; c < huruf.length; c++) {
                if(rata[c] > 85){
                    huruf[c] = "A";
                } else if (rata[c] > 75 && rata[c] <= 85) {
                    huruf[c] = "B+";
                } else if (rata[c] > 65 && rata[c] <= 75) {
                    huruf[c] = "B";
                } else if (rata[c] > 55 && rata[c] <= 65) {
                    huruf[c] = "C+";
                } else if (rata[c] > 45 && rata[c] <= 55) {
                    huruf[c] = "C";
                } 
            }

            /* Code Untuk Menghitung Maksimal dan Minimal */

            double max = rata[0];
            double min = rata[0];

            for(int d = 0; d < rata.length; d++) {
                if(max < rata[d]) {
                    max = rata[d];
                } else if(min > rata[d]) {
                    min = rata[d];
                }
            }

            /* Print Data */
            System.out.println("DATA PENILAIAN MAHASISWA TEKNIK INFORMATIKA");
            System.out.println("==============================================");
            System.out.println("Nama    |   Matakuliah                        |");
            System.out.println("         -------------------------------------");
            System.out.print("        ");
            for ( int e = 0; e < matakuliah.length; e++) {
                System.out.print(matakuliah[e] + " | " );
            }
            System.out.print("Rata2" + " | "  + "Huruf" + " | " );
            System.out.println("\n----------------------------------------------");

            for(int f = 0; f < nilai.length; f++) {
                if(mahasiswa[f] == "Bekti") {
                    System.out.print(mahasiswa[f] + "   |  ");
                } else {
                    System.out.print(mahasiswa[f] + "    |  ");
                }
                
                for(int g = 0; g < nilai[f].length; g++) {
                    System.out.print(nilai[f][g] + "  |  " );
                }

                
                System.out.print(rata[f] + "  |  ");
                if(huruf[f] == "A" || huruf[f] == "B" || huruf[f] == "C") {
                    System.out.print(huruf[f] + "   |  ");
                } else {
                    System.out.print(huruf[f] + "  |  ");
                }
                
                System.out.println();
            }
            System.out.println("----------------------------------------------");

            for(int h = 0; h < nilai.length; h++) {
                if(rata[h] == max) {
                    System.out.println("Rata2 Terbesar dipegang " + mahasiswa[h] + " Dengan Nilai " + max);
                } else if(rata[h] == min) {
                    System.out.println("Rata2 Terkecil dipegang " + mahasiswa[h] + " Dengan Nilai " + min);
                }
            }

            System.out.println();
    }
}
