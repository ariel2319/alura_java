import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota = 0;
        float notaEvaluaciones = 0;
        int totalEvaluaciones = 0;

       /* for (int i = 0; i < 3; i++) {
            System.out.printf("Evaluación Pelicula: ");
            nota = scanner.nextDouble();
            notaEvaluaciones += nota;
        }
        System.out.println(String.format("Media Evaluación => %.2f " , notaEvaluaciones/3));*/

        while (totalEvaluaciones <= 2) {
            System.out.printf("Evaluación Pelicula: ");
            nota = scanner.nextDouble();
            notaEvaluaciones += nota;
            totalEvaluaciones++;
        }
        System.out.println(String.format("Media Evaluación => %.2f " , notaEvaluaciones/3));
    }
}
