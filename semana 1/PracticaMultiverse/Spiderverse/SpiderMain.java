package semana1.Diego.Tareas.Spiderverse;

public class SpiderMain {
    public static void main(String[] args) {
        // villano y presentacion spiderman
        System.out.println("\nHa aparecido un villano");
        SpiderMan original = new SpiderMan();
        System.out.println("\nUn spiderman ha llegado para salvar el dia");
        System.out.println("es spiderMan!!!!\n");

        //combos spiderman
        original.Golpes();
        original.Patadas();
        original.SpiderSense();
        original.ContraAtaque();
        original.SpiderWeb();
        original.Finisher();
        System.out.println("\n_________________________________________________________________________________________" +
                "________________________________");
        //Miles morales intro
        System.out.println("\nHa aparecido un villano");
        MilesMorales Miles = new MilesMorales();
        System.out.println("\nUn spiderman ha llegado para salvar el dia");
        System.out.println("es Miles Morales!!!!\n");

        //combos Miles Morales
        Miles.Golpes();
        Miles.Patadas();
        Miles.SpiderSense();
        Miles.ContraAtaque();
        Miles.SpiderWeb();
        Miles.Finisher();
        System.out.println("\n_________________________________________________________________________________________" +
                "________________________________");
        //SpiderHam intro
        System.out.println("\nHa aparecido un villano");
        SpiderHam porker = new SpiderHam();
        System.out.println("\nUn spiderman ha llegado para salvar el dia");
        System.out.println("es Spider Ham!!!!\n");

        //SpiderHam combos
        porker.Golpes();
        porker.Patadas();
        porker.SpiderSense();
        porker.ContraAtaque();
        porker.SpiderWeb();
        porker.Finisher();
        System.out.println("\n_________________________________________________________________________________________" +
                "________________________________");
    }
}
