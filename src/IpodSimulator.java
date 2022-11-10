import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class IpodSimulator implements IIpode_simulator{


    public IpodSimulator() {
        volume =0;
        this.actual_state = actual_state;
        this.actual_index = actual_index;
        this.favoritas = favoritas;
        Cancion[] favoritas  = new Cancion[10];
    }

    private float volume;
    private boolean actual_state;
    private int actual_index;

    public Cancion[] getFavoritas() {
        return favoritas;
    }

    public void setFavoritas(Cancion[] favoritas) {
        this.favoritas = favoritas;
    }

    private Cancion[] favoritas;

    private boolean actual_locked_state;

    public void CsetVolume(float volume){
        this.volume = volume;
    }

    public float CgetVolume(){
        return volume;
    }




    public boolean getActual_locked_state() {
        return actual_locked_state;
    }

    public void setActual_locked_state(boolean actual_locked_state) {
        this.actual_locked_state = actual_locked_state;
    }

    public boolean getActual_state() {
        return actual_state;
    }
    public void setActual_state(boolean actual_state) {
        this.actual_state = actual_state;
    }

    /**
     * @param actual_state el estado actual del dispositivo
     * @return
     */
    @Override
    public boolean SwitchONOFF(boolean actual_state) {
        return actual_state;
    }

    /**
     * @param actual_locked_state estado de bloqueo actual del dispositivo
     * @return
     */
    @Override
    public boolean LockUnlockDevice(boolean actual_locked_state) {
        return actual_locked_state;
    }

    /**
     * @return
     */
    @Override
    public float getVolume() {
        return 0;

    }

    /**
     * @param volume
     * @return
     */
    @Override
    public float setVolume(float volume) {
        return 0;
    }

    /**
     * @param actual_index el indice actual
     * @return
     */
    @Override
    public int Prev(int actual_index) {

        if (actual_index == 0){
            System.out.println("PREVIOUS");
            return 49;
        }
        return actual_index-1;
    }

    /**
     * @param actual_index el indice actual
     * @return
     */
    @Override
    public int Next(int actual_index) {
        if(actual_index == 49){
            System.out.println("NEXT");
            return 0;
        }
        return actual_index+1;
    }


    /**
     * @return
     */
    @Override
    public int getActualIndex() {
        return actual_index;
    }

    /**
     * @param actual_index
     * @throws Exception
     */
    @Override

    //For now, we will ignore the exception right into his method
    //public void setActualIndex(int actual_index) throws Exception {
    //        this.actual_index = actual_index;
    //    }
    public void setActualIndex(int actual_index){

        this.actual_index = actual_index;
    }

    /**
     * @param _song la cancion que se desea guardar
     * @throws Exception
     */
    @Override
    public void addToFavorite(ICancion _song) throws Exception {

    }

    /**
     * @param index el indice en el que se encuentra la cancion
     * @return
     * @throws Exception
     */
    @Override
    public ICancion selectSpecificSong(int index) throws Exception {
        return null;
    }

    /**
     * @param index el indice en el que se encuentra la cancion
     * @return
     * @throws Exception
     */
    @Override
    public ICancion selectSpecificFavoriteSong(int index) throws Exception {
        return null;
    }

    /**
     * @return
     */
    @Override
    public Cancion[] getAllSongs() {
        Cancion[] canciones = new Cancion[50];
        FileReader file;
        BufferedReader reader;
        try{
            file = new FileReader("src/canciones.csv");
            reader = new BufferedReader(file);
            String linea;
            int colum = 0;
            int songIndex = 0;

            while((linea = reader.readLine())!=null){

                //Control points prints the from csv
                //System.out.println(linea);
                String[] datos = linea.split(","); //Reading each data

                if(colum!=0){ //Jumping column line

                    int Id = Integer.parseInt(datos[0]);

                    //System.out.println("=====================");
                    String songName = datos[1];
                    //System.out.println("Song name: "+songName);
                    String artist = datos[2];
                    //System.out.println("Artist: "+artist);
                    String album = datos[3];
                    //System.out.println("Album: "+album);
                    String duration = datos[4];
                    //System.out.println("Duration: "+duration);
                    //System.out.println("Index in course: "+songIndex);
                    //System.out.println("Object is being created");
                    //System.out.println("=====================");
                    Cancion cancion = new Cancion(songName,artist,album,duration,Id);
                    canciones[songIndex] = cancion;
                    //System.out.println("Object created with index: "+songName);

                    //Control point
                    //System.out.println("Song index: "+songIndex);
                    //System.out.println(cancion);
                    songIndex++;
                }
                colum++;
            }
        } catch (Exception f) {
            System.out.println("Error found");
            System.out.println(f.getMessage());
        }

        //Control point
        //System.out.println("\nLIST CREATED");
        //System.out.println("SONGS");
        //System.out.println(canciones.length);

        //for(int cancion = 0;cancion<canciones.length;cancion++){
        //    System.out.println("Current index: "+cancion);
        //    System.out.println(canciones[cancion].getTitle());
        //}
        return canciones;
    }

    /**
     * @param _isON       valor logico que indica si esta encendido o apagado
     * @param _isLocked   valor logico que indica si esta bloqueado o desbloqueado
     * @param _isPlaying  valor logico que indica si esta sonando una cancion o no
     * @param _actualSong valor que indica que cancion esta sonando
     * @return
     */
    @Override
    public String getStatus(boolean _isON, boolean _isLocked, boolean _isPlaying, ICancion _actualSong) {
        return null;
    }

    /**
     * @param index el indice que se desea verificar
     * @return
     */
    @Override
    public boolean isValidIndex(int index){
        Cancion canciones[] = getAllSongs();
        try{
            Cancion cancion = canciones[index];
            return true;
        }catch(Exception e){
            return false;
        }
    }

    /**
     * @param _titulo
     * @param _artista
     * @param _album
     * @param _duracion
     * @param _id
     * @throws Exception
     */
    @Override
    public void addSongToList(String _titulo, String _artista, String _album, String _duracion, int _id) throws Exception {

    }

    /**
     * @param index
     * @throws Exception
     */
    @Override
    public void deleteSongFromList(int index){

    }

    /**
     * @param index
     * @throws Exception
     */
    @Override
    public void deleteSongFromTop10(int index) throws Exception {
    }

    public static void addFavSong(Cancion cancion){

    }
}
