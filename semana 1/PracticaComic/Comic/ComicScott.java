package semana1.Diego.Tareas.Comic;

public class ComicScott extends Thread {
    private int Pagina;
    private String Nombre;

    public ComicScott (String Nombre, int Pagina){
        this.Nombre = Nombre;
        this.Pagina = Pagina;

    }

    public String getNombre() {return Nombre;}
    public int getPagina(){return Pagina;}


    public boolean setNombre(String Nombre){
        if (!Nombre.isEmpty()){
            this.Nombre = Nombre;
            return true;
        }else
            return false;
    }

    public boolean setPagina(int Pagina){
        if (Pagina > 0){
            this.Pagina = Pagina;
            return true;
        }else
            return false;
    }
    public String show(){
        return
                "\nNombre: " + Nombre + "\nPagina: #"+ Pagina;
    }
}
