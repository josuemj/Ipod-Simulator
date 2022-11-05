public class IpodSimulator implements IIpode_simulator{

    /**
     * @param actual_state el estado actual del dispositivo
     * @return
     */
    @Override
    public boolean SwitchONOFF(boolean actual_state) {
        return false;
    }

    /**
     * @param actual_locked_state estado de bloqueo actual del dispositivo
     * @return
     */
    @Override
    public boolean LockUnlockDevice(boolean actual_locked_state) {
        return false;
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
        return 0;
    }

    /**
     * @param actual_index el indice actual
     * @return
     */
    @Override
    public int Next(int actual_index) {
        return 0;
    }

    /**
     * @return
     */
    @Override
    public int getActualIndex() {
        return 0;
    }

    /**
     * @param actual_index
     * @throws Exception
     */
    @Override
    public void setActualIndex(int actual_index) throws Exception {

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
    public ICancion[] getAllSongs() {
        return new ICancion[0];
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
    public boolean isValidIndex(int index) {
        return false;
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
    public void deleteSongFromList(int index) throws Exception {

    }

    /**
     * @param index
     * @throws Exception
     */
    @Override
    public void deleteSongFromTop10(int index) throws Exception {

    }
}
