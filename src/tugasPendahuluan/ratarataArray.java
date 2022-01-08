package tugasPendahuluan;
public class ratarataArray {
    
    // Code by @Radja Aulia Al Ramdani => github.com/HamsterKaget
    public static void main(String[] args) {
        
        int data[][]={
            {4,6,4,7,8,3,2,10},
            {4,6,4,2,8,8,2,10}
        };

        double total = 0;
        int totalIndex = 0;

        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                total += data[i][j];
                totalIndex++;
            }
        }

        double average = total / totalIndex;

        System.out.println("Jumlah Total Dari Kedua Array Adalah : " + total);
        System.out.println("Jumlah Total Index Dari Kedua Array Adalah : " + totalIndex);
        System.out.println("Hasil Rata Rata Dari Kedua Array Adalah : " + average);
        
    }
}
