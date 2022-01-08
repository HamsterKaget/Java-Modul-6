package tugasPendahuluan;


public class loopingArray {

    // Code by Radja Aulia Al Ramdani => github.com/HamsterKaget
    public static void main(String[] args) {
        
        int data[][]={
            {4,6,4,7,8,3,2,10},
            {4,6,4,2,8,8,2,10}
        };

        // Looping Menggunakan While
        System.out.println("==== Looping While di Multidimensional Array ====");
        int i = 0;
        
        while(i < data.length) {
            int j = 0;
            while(j < data[i].length) {
                System.out.print(data[i][j] + " ");
                j++;
            }
            i++;
        }

        System.out.println("\n\n========================\n");

        // Looping Menggunakan do while Loop
        System.out.println("==== Looping Do While di Multidimensional Array ====");
        int a = 0;

        do {
            int b = 0;
            do {
                System.out.print(data[a][b] + " ");
                b++;
            } while(b < (data[a].length));
            a++;
        } while (a < (data.length));


        System.out.println("\n\n========================\n");


        // Looping Menggunakan For Loop
        System.out.println("==== Looping For di Multidimensional Array ====");

        for(int c = 0; c < data.length; c++) {
            for(int d = 0; d < data[c].length; d++) {
                System.out.print(data[c][d] + " ");
            }
        }

        System.out.println("\n\n========================\n");

        // Looping Menggunakan For Each
        System.out.println("==== Looping For Each di Multidimensional Array ====");
        for(int[] baris : data) {
            for(int angka : baris) {
                System.out.print(angka + " ");
            }
        }

        System.out.println();








    }
}
