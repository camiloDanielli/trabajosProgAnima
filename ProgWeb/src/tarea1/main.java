package tarea1;

import java.util.Locale;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Contacto[] agenda = new Contacto[255]; // variables en minusculas! Se puede poner todo en una linea.
        // Saque las variables aca porque es mejor definirlas cerca de donde las vas a usar. Osea abajo.

        Scanner input = new Scanner(System.in);
        System.out.println("⬛⬛⬛⬛⬛⬛AGENDA DE CAMILO⬛⬛⬛⬛⬛⬛");
        while (true) { // aca debe ir el while! Pensa porque...
          System.out.println("(I)ngresar nuevo contacto o (C)onsultar existentes");
          char selector = input.nextLine().toLowerCase().charAt(0);

          if (selector == 'i') {
              System.out.println("⬛⬛⬛⬛⬛⬛⬛Crear nuevo usuario⬛⬛⬛⬛⬛⬛⬛");
              int a = 1;
              // while (a==1) { No pero entiendo lo que querias hacer..
                // Fijate aca como se podria hacer con nombre

                String nombre;
                do {
                  nombre = input.nextLine();
                } while (nombre.isEmpty());

                // idem para numero

                int numero; // numero es un string! "O99432334" o "+598 (34) 99432334"
                
                // Para email es un poco mas dificil...

                String mail;
                do {
                  mail = input.nextLine();
                } while (!nombre.isEmpty() && !mailIsValid(mail)); // supongo que defini esa funcion arriba mailIsValid 
                  
                // Ahora hay que agregarlo al array de contactos
              }
          }
          if (selector == 'c') {
            // falta implementar
          }
        }
    }
}
