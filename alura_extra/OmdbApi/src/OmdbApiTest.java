import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class OmdbApiTest {

    public static void main(String[] args) {
        // declarar la Api Key
        String apiKey = "c087a67b";
        // declaración de scanner para ingresar el nombre de la peli
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Ingrese el nombre de la peli para ver su info => ");
        String peliBuscada = teclado.nextLine();

        System.out.println(peliBuscada);
        // declaramos peli de ejemplo
        /* String peli = "The Shawshank Redemption"; */

        try {
            // crear la URL de la solicitud
            String urlString = "http://www.omdbapi.com/?t=" + peliBuscada.replace(" ", "%20") + "&apikey=" + apiKey;

            URL url = new URL(urlString);

            // Abrir conexión para hacer la consulta
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            // determinar el tipo de consulta a realizar en la conexión
            connection.setRequestMethod("GET");

            // leer la respuesta del server
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer contenido = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                contenido.append(inputLine);
            }

            // cerrando la conexión
            in.close();
            connection.disconnect();

           /*  //Pasear la respuesta JSON
            JSONObject  jsonResponse = */

            // mostrar la respuesta
            System.out.println(contenido.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
