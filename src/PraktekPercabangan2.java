/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
public class PraktekPercabangan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String identitas = "SYIFA' AULIYA ASH-SHOLIHAH / XR6 / 39";
        System.out.println("Identitas : "+ identitas);
        System.out.print("\nSaran Resep dari Bahan Milik Anda\n");
        Scanner scanner = new Scanner (System.in);
        System.out.println("Bahan Pertama: ");
        System.out.println("1. Pisang");
        System.out.println("2. Telur");
        System.out.print("Masukkan no pilihan Anda :");
        int bahan1 = scanner.nextInt();
        if(bahan == 1 || bahan1 == 2)
        {
            System.out.println("Bahan Kedua: ");
            if(bahan1 == 1){
                System.out.println("1. Susu");
                System.out.println("2. Minyak Goreng");
                System.out.println("3. Tidak ada");
            }
            System.out.print("Masukkan no pilihan Anda :");
            int bahan2 = scanner.nextInt();
        }else
            System.out.println("Mohon Maaf, Pilihan tidak ditemukan, " + "tidak dapat memberikan saran resep");
        
            }
            
        }
    }
    
}
