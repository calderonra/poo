package tarea1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAUL
 */
public class sujeto {
    
       String nombre;
    int edad;
    String universidad;

    public sujeto(String nombre, int edad, String universidad) {

        this.edad = edad;
        this.nombre = nombre;
        this.universidad = universidad;

    }
    
    public void mostrar(){
        System.out.println(nombre+edad+universidad);
    }

    
}
