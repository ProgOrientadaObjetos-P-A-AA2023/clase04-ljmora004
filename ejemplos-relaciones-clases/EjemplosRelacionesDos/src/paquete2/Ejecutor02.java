/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Ejecutor02 {
    
    public static void main(String[] args) {
        // 1. Crear una persona de Barrio el Valle de la ciudad de Loja
        Ciudad city01 = new Ciudad("Loja");
        Barrio barr01 = new Barrio("El Valle", city01);
        Persona person01 = new Persona("Luis Mora", "0996548654", barr01);
        
        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona %s es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                person01.obtenerNombre(),
                person01.obtenerBarrio().obtenerNombre(),
                person01.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
        // 2. Crear una persona del Barrio Central de la ciudad de Cuenca
        Ciudad city02 = new Ciudad("Cuenca");
        Barrio barr02 = new Barrio("Central", city02);
        Persona person02 = new Persona("Javier Rodriguez", "165864865", barr02);
        
        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona %s es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                person02.obtenerNombre(),
                person02.obtenerBarrio().obtenerNombre(),
                person02.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
        // 3. Crear una persona del Barrio Centenario de la ciuda de Guayaquil
        Ciudad city03 = new Ciudad("Guayaquil");
        Barrio barr03 = new Barrio("Centenario", city03);
        Persona person03 = new Persona("Jose Morales", "07578654", barr03);
        
        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona %s es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                person03.obtenerNombre(),
                person03.obtenerBarrio().obtenerNombre(),
                person03.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
        
        
        
    }
}
