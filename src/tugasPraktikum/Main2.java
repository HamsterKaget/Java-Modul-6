package tugasPraktikum;

import java.util.Arrays;

public class Main2 {

    // Code by Radja Aulia Al Ramdani => github.com/HamsterKaget
    public static void main(String[] args) {
        
        // Deklarasi Array 
        String data[][] = {
            {"ABDUL", "085646668991", "Kediri"}, 
            {"KUSNO", "085646668992", "Trenggalek"}, 
            {"PONIRAN", "085646668999", "Bojonegoro"}
        };

        System.out.print("\nNAMA " + "     " + "ALAMAT " + "     " + "TELEPON\n");

        int a = 0;

        while(a < data.length) {
            int b = 0;
            while ( b < data[a].length) {
                if(b == (data[a].length - 2)) {
                    System.out.print(data[a][(b+1)]+ "     ");
                } else if ( b == data[a].length - 1) {
                    System.out.print(data[a][(b-1)]+ "     ");
                } else {
                    System.out.print(data[a][b]+ "     ");
                }
                b++;
            }
            System.out.println();
            a++;
        }


        // for(int a = 0; a < data.length; a++) {
        //     for(int b = 0; b < data[a].length; b++) {
        //         System.out.print(data[a][b] + "     ");
        //         if(b == (data[a].length - 1)) {
        //             System.out.println();
        //         }
        //     }
        // }
    }
    
    
}
