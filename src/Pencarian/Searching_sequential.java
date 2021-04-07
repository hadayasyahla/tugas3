/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pencarian;
import java.util.Scanner;
/**
 *
 * @author AVITA
 */
public class Searching_sequential {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String data[] = {"Galileo", "Archimedes", "Alkhawarizmi", "Aljabar", "Anggit", "Tesla"};
        String key;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Data Yang Akan Dicari : ");
        key = input.nextLine();
        
        System.out.print("Isi data Adalah : ");
        for (int i = 0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        for (int i = 0; i<data.length; i++){
            if (key.equalsIgnoreCase(data[i])){
                System.out.print("Data " + key + "Berada di Indeks ke- " +i);
                break;
            }
        }
        System.out.println("\n");
        System.out.println();
        System.out.println("Nurul Lita Syahla Hadaya");
    }
}
