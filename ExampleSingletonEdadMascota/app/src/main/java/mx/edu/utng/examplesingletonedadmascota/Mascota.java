package mx.edu.utng.examplesingletonedadmascota;

/**
 * Created by volibear on 13/09/16.
 */
public class Mascota {
    private String nombre;
    private String raza;
    private int edad;
    private static Mascota mascota;

    private Mascota(){
        this.nombre="";
        this.raza="";
        this.edad=0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public static Mascota getMascota(){
        if(mascota==null){
            mascota = new Mascota();
        }
        return mascota;
    }

}
