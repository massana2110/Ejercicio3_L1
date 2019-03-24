/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_l1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author David Massana
 */
public class Ejercicio3_L1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> data;
        data = captura();
        operaciones(data);
    }
    
    public static ArrayList<Integer> captura(){
        ArrayList<Integer> arrayNum = new ArrayList<>();
        Scanner key = new Scanner(System.in);
        System.out.print("Favor ingrese el numero de datos: ");
        int datos = key.nextInt();
        for (int i = 0; i < datos; i++) {
            System.out.print("Dato " + i + ": ");
            arrayNum.add(key.nextInt());
        }
        return arrayNum;
    }
    
    public static void operaciones(ArrayList<Integer> datos){
        float suma = 0;
        double media = 0.0;
        int i = 0;
        for (Integer dato : datos) {
            suma = suma + datos.get(i);
            i++;
            if (i == datos.size()) {
                break;
            }
        }
        System.out.println("\nSuma: " + suma);
        System.out.println("Datos: " + datos.size());
        media = (double)(suma / datos.size());
        System.out.println("Media Aritmetica: " + Math.rint(media*100)/100);
        
        System.out.println("PARES: ");
        Iterator<Integer> iteradorPares = datos.iterator();
        
        while(iteradorPares.hasNext()){
            int dato = iteradorPares.next();
            if (dato % 2 == 0) {
                System.out.print(dato + " ");
            }  
        }
        
        Iterator<Integer> iteradorImpar = datos.iterator();
        System.out.println("\nIMPARES: ");
        while(iteradorImpar.hasNext()){
            int datoImpar = iteradorImpar.next();
            if (datoImpar % 2 != 0) {
                System.out.print(datoImpar + " ");
            }  
        }
        System.out.print("\n");
    }
}
