package semana1.potter;

public class personajes {
    public static void main(String[] args) {
        show();
    }
    public static void show(){
        mago hermione = new mago("Hermione Granger","Femenino","Gryffindor","Nutria","La profesora McGonagall le dice que desaprobo todos sus examenes (fracaso en general)");
        System.out.println("nombre del mago: "+hermione.getnombre());
        System.out.println("genero del mago: "+hermione.getgenero());
        System.out.println("casa a la que pertenece: " + hermione.getcasa());
        System.out.println("su patronus es: "+hermione.getpatronus());
        System.out.println("su boggart es: "+hermione.getBoggart());

        mago Ron = new mago ("Ron Weasley","Masculino","Gryffindor", "Jack Russell Terrier","Una arana gigante");
        System.out.println("\nnombre del mago: "+Ron.getnombre());
        System.out.println("genero del mago: "+Ron.getgenero());
        System.out.println("casa a la que pertenece: " + Ron.getcasa());
        System.out.println("su patronus es: "+Ron.getpatronus());
        System.out.println("su boggart es: "+Ron.getBoggart());

        mago Harry = new mago("Harry Potter","Masculino","Gryffindor","ciervo","dementor");
        System.out.println("\nnombre del mago: "+Harry.getnombre());
        System.out.println("genero del mago: "+Harry.getgenero());
        System.out.println("casa a la que pertenece: " + Harry.getcasa());
        System.out.println("su patronus es: "+Harry.getpatronus());
        System.out.println("su boggart es: "+Harry.getBoggart());

        mago Leta = new mago("Leta Lestrange","Femnino","Slytherin","Desconocido","El cadaver de su hermano Corvus flotando en el agua");
        System.out.println("\nnombre del mago: "+Leta.getnombre());
        System.out.println("genero del mago: "+Leta.getgenero());
        System.out.println("casa a la que pertenece: " + Leta.getcasa());
        System.out.println("su patronus es: "+Leta.getpatronus());
        System.out.println("su boggart es: "+Leta.getBoggart());

        mago Newt = new mago("Newt Scamander","Masculino","Hufflepuff","Puercoespin", "Trabajar como oficinista");
        System.out.println("\nnombre del mago: "+Newt.getnombre());
        System.out.println("genero del mago: "+Newt.getgenero());
        System.out.println("casa a la que pertenece: " + Newt.getcasa());
        System.out.println("su patronus es: "+Newt.getpatronus());
        System.out.println("su boggart es: "+Newt.getBoggart());
    }
}
