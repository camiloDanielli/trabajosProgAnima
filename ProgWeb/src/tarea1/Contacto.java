package tarea1;

public class Contacto {
    private String Nombre;
    private int Numero;
    private String Mail;

    public Contacto(){

    }
    public Contacto(String nombre, int numero, String mail) {
        Nombre = nombre;
        Numero = numero;
        Mail = mail;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }
}
