package conditional_statements;
import java.util.Scanner;
public class bookStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        membuat variable
        int total;
        double jumlah,dis1,dis2,dis3;
//        membuat scanner
        System.out.println("Masukan total buku yang anda pinjam : ");
        total = input.nextInt();
//        membuat kondisi
        jumlah = total * 10000;
        dis1 = jumlah -((jumlah*2.5)/100);
        dis2 = jumlah -((jumlah*5)/100);
        dis3 = jumlah -((jumlah*10)/100);
        
        switch(total){
            case 1:
                System.out.println("Total bayar anda Rp" + jumlah);
                break;
            case 2:
                System.out.println("Total bayar anda Rp" + jumlah);
                break;
            case 3:
                System.out.println("Total bayar anda Rp" + jumlah);
                break;
            case 4:
                System.out.println("Anda mendapat diskon 2,5%");
                System.out.println("Total bayar anda Rp" + dis1);
                break;
            case 5:
                System.out.println("Anda mendapat diskon 5%");
                System.out.println("Total bayar anda Rp" + dis2);
                break;
            case 10:
                System.out.println("Anda mendapat diskon 10%");
                System.out.println("Total bayar anda Rp" + dis3);
                break;
            default:
                System.out.println("Peminjaman melebihi kapasitas");   
    }
}
}