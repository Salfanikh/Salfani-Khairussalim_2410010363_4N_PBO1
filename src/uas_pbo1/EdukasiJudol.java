package uas_pbo1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class EdukasiJudol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println(" SIMULASI MEMBONGKAR TRIK JUDI ONLINE");
        System.out.println("=========================================");

        try {
            System.out.print("Mau coba berapa spin? (masukkan angka): ");
            int spin = input.nextInt();

            if (spin <= 0) {
                System.out.println("Jumlah spin harus lebih dari 0 kawan!");
            } else {
                // set peluang awal cuma 15% (0.15)
                JudiOnline slot = new JudiOnline("Mesin Slot Settingan", 0.15); 
                
                slot.tampilkanEdukasi();
                slot.bongkarTrik(spin);
            }

        } catch (InputMismatchException e) {
            System.out.println("\nError: Masukin angka yang bener dong, jangan huruf!");
        } catch (Exception e) {
            System.out.println("\nError sistem: " + e.getMessage());
        } finally {
            input.close();
            System.out.println("\n=========================================");
            System.out.println("Kesimpulan: Gak ada bandar yang mau rugi.");
            System.out.println("=========================================");
        }
    }
}
