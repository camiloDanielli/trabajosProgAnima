package tarea1;

import java.util.Locale;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Contacto[] Agenda;
        Agenda = new Contacto[255];
        String Nombre;
        int Numero;
        String Mail;

        Scanner input = new Scanner(System.in);
        System.out.println("⬛⬛⬛⬛⬛⬛AGENDA DE CAMILO⬛⬛⬛⬛⬛⬛");
        System.out.println("(I)ngresar nuevo contacto o (C)onsultar existentes");
        char Selector = input.nextLine().toLowerCase(Locale.ROOT).charAt(0);
        if (Selector == 'i') {
            System.out.println("⬛⬛⬛⬛⬛⬛⬛Crear nuevo usuario⬛⬛⬛⬛⬛⬛⬛");
            int a = 1;
            while (a==1) {
                System.out.println("ingrese nombre");
                Nombre = input.nextLine();
                System.out.println("ingrese Numero telefonico");
                Numero = input.nextInt();
                boolean Sverif = false;
                do {System.out.println("ingrese correo electronico (de lo contrario ingrese enter)");
                Mail = input.nextLine();

                if (Mail != ""){
                    char M[] = Mail.toCharArray();
                    for (int i = 0; i <= M.length; i++){
                        if (M[i] == '@'){
                            Sverif = true;
                        }
                    if (Sverif){
                        System.out.println("el correo ingresado no es valido");
                    }
                    }
                }else{
                    Sverif = true;
                }} while (Sverif);

            }
        }
    }
}
