package tugasPendahuluan;
import javax.swing.*;

public class indexArray {
    
    // Code by Radja Aulia Al Ramdani => github.com/HamsterKaget
    public static void main(String[] args) {
        
        // Deklarasi Array Multidimensi
        int[][] data = {
            {4,6,4,7,8,3,2,10},
            {4,6,4,2,8,8,2,10}
        };

        String input = JOptionPane.showInputDialog("Masukan Nilai Element Yang Ingin Kamu Cari");

        int request = Integer.parseInt(input);

        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data[i].length; j++){
                if(data[i][j] == request) {
                    System.out.println("Nilai " + request + " Terdapat Pada Index " + j + " Pada Array Ke " + i);
                }
            }
        }        


    }
}
