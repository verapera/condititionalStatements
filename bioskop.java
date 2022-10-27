package conditional_statements;
import java.util.Scanner;
public class bioskop {
    public static void main(String[] args) {
//     membuat variable
    int usia;
//    membuat scanner
    Scanner input = new Scanner(System.in);
    System.out.println("Masukan usia :");
    usia = input.nextInt();
    
//    membuat kondisi
    System.out.println("Hasil :");
    if ((usia >= 5) && (usia <=12)){
        System.out.println("Anda akan menonton film Big Hiro");
    }else if ((usia >=12 ) && (usia <=100)){
        System.out.println("Jailangkung");
    }else{
        System.out.println("Usia yang anda masukan tidak valid");
    }
    }    
    
}


