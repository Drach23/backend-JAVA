package semana1.Diego.Tareas.Spiderverse;

public class SpiderMan implements Ataques {
    public SpiderMan() {
    }

    public void Golpes() {
        System.out.println("Ataca con un golpe al rostro del villano con la cual lo hace retroceder un poco");
    }

    public void Patadas() {
        System.out.println("Da una patada a la cabeza del villano, la cual lo deja un poco aturdido");
    }


    public void SpiderSense() {
        System.out.println("presiente un ataque del enemigo por lo que se pone en alerta");
    }

    public void ContraAtaque() {
        System.out.println("el villano saca un arma y comienza disparar. Spiderman equiva mientras se acerca y le da una patada voladora" +
                "con la cual logra lanzarlo lejos");
    }


    public void SpiderWeb() {
        System.out.println("Antes de que el villano toque el suelo usa su spider web para jalarlo hacia " +
                "el y darle un gancho  a la barbilla con lo cual sale volando  ");
    }

    public void Finisher() {
        System.out.println("Cuando toca el piso inconciente lo inmoviliza pegandolo a este con su spider web");
    }
}
