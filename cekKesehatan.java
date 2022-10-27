package conditional_statements;
import java.util.Scanner;
public class cekKesehatan {
    public static void main(String[] args) {
//    membuat variable
    String kis, wargaSetempat, bukanWargasetempat, kewarganegaraan, ya = "ya";
    int bayar = 0;
//    membuat scanner
    Scanner input = new Scanner(System.in);
//    membuat kondisi
    System.out.println("Jawab ya jika anda punya, selain itu anda akan di anggap tidak punya");
    System.out.println("Apakah anda mempunyai KIS?");
    kis = input.nextLine();
    
    System.out.println("Apakah anda warga setempat?");
    wargaSetempat = input.nextLine();
    
    System.out.println("Apakah anda bukan warga setempat?");
    bukanWargasetempat = input.nextLine();
    
    System.out.println("Apakah anda tidak mempunyai kewarganegaraan?");
    kewarganegaraan = input.nextLine();
    
    if(kis.equals(ya)){
        bayar = 0;
    }else if (wargaSetempat.equals(ya)){
        bayar = 7500;
    }else if (bukanWargasetempat.equals(ya)){
        bayar = 10000;
    }else if (kewarganegaraan.equals(ya)){
        bayar = 12; 
    }
    
    if(bayar == 12){
        System.out.println("Anda tidak boleh berobat");
    }else{
        System.out.println("Yang harus anda bayar = " +bayar);
    }
    }
}
