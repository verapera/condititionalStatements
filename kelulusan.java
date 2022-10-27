package conditional_statements;
import java.util.Scanner;
public class kelulusan {
    public static void main(String[] args) {
//     membuat variable
    String nama;
    int nilai;
//    membuat scanner
    Scanner input = new Scanner(System.in);
    System.out.println("Masukan nama :");
    nama = input.nextLine();
    System.out.println("Masukan nilai :");
    nilai = input.nextInt();
    
//    membuat kondisi
    System.out.println("Hasil :");
    if ((nilai >= 75)&& (nilai <=100)){
        System.out.println("Selamat " +nama+ " anda dinyatakan Lulus");
    }else if ((nilai >= 0)&& (nilai <75)){
        System.out.println("Mohon maaf " +nama+ " anda dinyatakan tidak Lulus");
    }else{
        System.out.println("Nilai yang anda masukan tidak valid");
    }
    }    
}
