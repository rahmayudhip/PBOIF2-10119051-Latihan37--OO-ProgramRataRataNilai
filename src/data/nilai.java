/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.util.Scanner;

/**
 *
 * @author RYP
 */
public class nilai {
    public double rata;
    public double jumlah;
    public double nilai;
    public int n;
    
    public void hitungRataRata(double jumla, int n){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        n = input.nextInt();
        jumlah = 0;
         for (int i=1; i <= n; i++){
             System.out.print("Nilai Mahasiswa Ke-" + i+" : ");
             nilai = input.nextInt();
             jumlah += nilai;
         }
             rata = jumlah/n;
             System.out.println("Maka, Rata-rata Nilainya adalah : "+rata);
             System.out.println("(Developed by : Rahmayudhi Prakoso)");
             
        
    }
}
