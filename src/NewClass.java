/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author Iqbal Muhammad
 */
public class NewClass {
   public static void main(String[] args) {
        String input = "";
        int i=0, j = 1;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan bilangan faktorial : ");
        try {
            input = buffer.readLine();
        } catch (Exception e) {
        }
        int a = Integer.valueOf(input);
        System.out.println("n       n!");
        System.out.println("-----------------------------------");
        if (a < 1) {
            System.out.println("Silahkan masukkan angka lebih besar dari 0");
             } else {
            do{
                i++;
                if (i < a) {
                }
                j = j * i;
                System.out.println(i+"       "+j);
            }while(i<a);
            System.out.println("-----------------------------------");
            System.out.println("Hasil dari "+a+"! = " + j);
        }
    }
}
