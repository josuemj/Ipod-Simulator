import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class controlSystem {

    /**
     * Methos takes a CSV to create 50 random "Cancion" objects so GUI can interact with them,
     * @return ArrayList with songs as objects
     */
     public static ArrayList<Cancion> getData(){

        ArrayList<Cancion> cancionesOB = new ArrayList<>();
        FileReader file;
        BufferedReader reader;

        try{
            file = new FileReader("src/canciones.csv");
            reader = new BufferedReader(file);
            String linea;
            int colum = 0;

            while((linea = reader.readLine())!=null){

                System.out.println(linea);
                String[] datos = linea.split(","); //Reading each data

                if(colum!=0){ //Jumping column line
                    int Id = Integer.parseInt(datos[0]);
                    String songName = datos[1];
                    String artist = datos[2];
                    String album = datos[3];
                    String duration = datos[4];
                    Cancion cancion = new Cancion(songName,artist,album,duration,Id);
                    cancionesOB.add(cancion);
                }
                colum++;
            }
        } catch (Exception f) {
            System.out.println("Error found");
            System.out.println(f.getMessage());
        }
        return cancionesOB;
    }

}
