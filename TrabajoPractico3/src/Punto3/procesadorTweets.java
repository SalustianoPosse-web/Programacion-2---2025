package Punto3;
public class procesadorTweets {

    public static void calcularCaracter(String tweet) {
        int recuento = tweet.length();
        if (recuento > 0 && recuento <= 280) {
            System.out.println("El tweet se encuentra dentro del límite");
        } else {
            System.out.println("El tweet se encuentra fuera del límite");
        }
    }

    public static String concatenar(String tweet, String hashtag) {
        return tweet + " #" + hashtag;
    }

    public static String encontrar(String tweet) {
        int indice = tweet.indexOf('@');

        if (indice == -1) {
            return "El usuario no fue encontrado";
        }

        int fin = tweet.indexOf(" ", indice);
        if (fin == -1) {
            return tweet.substring(indice);
        } else {
            return tweet.substring(indice, fin);
        }
    }

    public static String nuevoTweet(String parte1, String parte2, String parte3) {
        StringBuilder teclado = new StringBuilder();
        teclado.append(parte1);
        teclado.append(parte2);
        teclado.append(parte3);

        return teclado.toString();
    }
}
