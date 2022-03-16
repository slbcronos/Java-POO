/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseYObjetos;

/**
 *
 * @author Salvador Lopez Baltazar
 */
public class Coche {
    // Atributos
    
    String Color;
    String marca;
    int km;
    
    //Metodos
    public static void main(String [] args){
        Coche coche1 = new Coche ();
        
        coche1.Color ="Verde";
        coche1.marca = "Audi";
        coche1.km = 100;
        
        System.out.println("El Coche1 es de color: "+ coche1.Color);
        System.out.println("El Coche1 es Marca: "+ coche1.marca);
        System.out.println("El Coche1 tiene: "+ coche1.km + " kilometros");
    }
    
}
