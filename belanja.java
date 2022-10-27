package conditional_statements;
import java.util.Scanner;
public class belanja {
    public static void main(String[] args) {
//    membuat variable
    int bayar,totalPembelanjaan;
//    membuat scanner
    Scanner input = new Scanner(System.in);
    System.out.println("Masukan total pembelanjaan :");
    totalPembelanjaan = input.nextInt();
//    membuat kondisi
   if((totalPembelanjaan>=100000)&& (totalPembelanjaan<150000)){
       bayar = totalPembelanjaan - 10000;
       System.out.println("Selamat anda mendapat diskon 10000");
       System.out.println("Pembayaran total anda Rp"+bayar);
   }else if((totalPembelanjaan>=150000)&& (totalPembelanjaan<300000)){
       bayar = totalPembelanjaan - 20000;
       System.out.println("Selamat anda mendapat diskon 20000");
       System.out.println("Pembayaran total anda Rp"+bayar);
   }else if((totalPembelanjaan>=300000)&& (totalPembelanjaan<500000)){
       bayar = totalPembelanjaan - 50000;
       System.out.println("Selamat anda mendapat diskon 50000");
       System.out.println("Pembayaran total anda Rp"+bayar);
   }else if(totalPembelanjaan>=500000){
       bayar = totalPembelanjaan - 75000;
       System.out.println("Selamat anda mendapat diskon 75000");
       System.out.println("Pembayaran total anda Rp"+bayar);
   }   
   }
}
