import java.util.Scanner;

public class Lingkaran {
    private static final double PI = 3.14;
    public static double hitungLuas(double radius) throws ZeroNumberException {
        if(radius < 0){
            // tidak boleh <= karena nol akan terlibat pd 1 Exception
            throw new IllegalArgumentException("Radius harus bernilai positif");
        }else if(radius == 0){
            // untuk menghandle jika input radius bernilai nol
            throw new ZeroNumberException("Radius tidak boleh nol");
        }else{
            System.out.println("Radius bernilai positif\n");
        }
        return PI * radius * radius;
    }
    void input(){
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Masukkan jari - jari : ");
            int radius = input.nextInt();
            System.out.println("Luas lingkaran = " + hitungLuas(radius));
        }catch(IllegalArgumentException | ZeroNumberException e){
            System.out.println(e.getMessage());
        }
        input.close();

    }
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.input();
    }
}
class ZeroNumberException extends Exception{
    // membuat Class Exc. Handling untuk input yg bernilai nol
    public ZeroNumberException(String message){
        super(message);
}
}