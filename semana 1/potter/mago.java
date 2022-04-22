package semana1.potter;

// declaracion de variables
public class mago {
    private String nombre, genero, casa, boggart, patronus;
    private int edad;

    public mago() { };

    public mago(String nombre) {
        this.nombre = nombre;
    }

    public mago(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public mago(String nombre, String genero, String casa) {
        this.nombre = nombre;
        this.genero = genero;
        this.casa = casa;
    }

    public mago(String nombre, String genero, String casa, String patronus) {
        this.nombre = nombre;
        this.genero = genero;
        this.casa = casa;
        this.patronus = patronus;
    }

    public mago(String nombre, String genero, String casa, String patronus, String boggart) {
        this.nombre = nombre;
        this.genero = genero;
        this.casa = casa;
        this.patronus = patronus;
        this.boggart = boggart;
    }
    public String getnombre(){ return nombre;}
    public String getgenero(){ return genero;}
    public String getcasa(){ return casa;}
    public String getpatronus(){ return patronus;}
    public String getBoggart(){ return boggart;}
}