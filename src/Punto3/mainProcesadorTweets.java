package Punto3;
import java.util.Scanner;

public class mainProcesadorTweets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un tweet:");
        String tweet = scanner.nextLine();

        System.out.println("Ingrese un hashtag:");
        String hashtag = scanner.nextLine();
        String tweetConHashtag = procesadorTweets.concatenar(tweet, hashtag);
        System.out.println("Tweet con hashtag: " + tweetConHashtag);

        String usuario = procesadorTweets.encontrar(tweet);
        System.out.println("Usuario encontrado: " + usuario);

        String nuevo = procesadorTweets.nuevoTweet("Hola, ", "esto es un tweet generado ", "con varios fragmentos.");
        System.out.println("Nuevo tweet construido: " + nuevo);

        scanner.close();
    }
}
