public class Estacion {

    // Quinta parte del ejercicio 4
    public static void main(String[] args) {

        String estacion = "Primavera";

        switch(estacion) {
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            case "Primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("Eso no es una estación");
        }

    }
}
