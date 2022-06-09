import java.util.Scanner;
    
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int p, l, t, v;
        System.out.println("Menghitung Luas Permukaan Balok");
        System.out.print("Masukan Panjang Balok: ");
        p = input.nextInt();
        System.out.print("Masukan Lebar balok: ");
        l = input.nextInt();
        System.out.print("Masukan Tinggi Balok: ");
        t = input.nextInt();
        v = p*l*t;
        System.out.println("volume balok adalah: " + v);
        for(int a=1;a<=v;a++){
            if(a%2==0){
                System.out.println(a);
            }
        }
    }
}