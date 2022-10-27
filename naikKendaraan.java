package conditional_statements;
import java.util.Scanner;
public class naikKendaraan {
     public static void main(String[] args) {
//        membuat variable
        String kendaraan;
//        membuat scanner
        Scanner transportasi = new Scanner(System.in);
        System.out.println("Masukan jumlah penumpang :");
        kendaraan = transportasi.nextLine();
//        membuat kondisi
        switch(kendaraan){
            case "1":
                System.out.println("Sepeda");
                break;
            case "2":
                System.out.println("Motor");
                break;
            case "4":
                System.out.println("Mobil");
                break;
            case "30":
                System.out.println("Bus");
                break;
            case "50":
                System.out.println("Pesawat");
                break;
            default:
                System.out.println("Penumpang melelebihi kapasitas");              
        }
     }
}
