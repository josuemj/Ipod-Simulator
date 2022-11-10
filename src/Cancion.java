public class Cancion implements ICancion{private String _title;
    private String _artist;
    private String _album;
    private String _duration;
    private int _id;




    public Cancion(String _title, String _artist, String _album, String _duration, int _id) {
        this._id = _id;
        this._artist = _artist;
        this._album = _album;
        this._duration = _duration;
        this._title = _title;
    }

    /**
     * Setter for title
     * @param _title
     */
    @Override
    public void setTitle(String _title) {
        this._title = _title;
    }

    /**
         * Getter for Tittle
         * @return _title
         */
        @Override
        public String getTitle() {
            return _title;
        }

        /**
         * Setter for artist
         * @param _artist
         */
        @Override
        public void setArtist(String _artist) {
            this._artist = _artist;
        }

        /**
         * Getter for artist
         * @return
         */
        @Override
        public String getArtist() {
            return _artist;
        }

        /**
         * Setter for album
         * @param _album
         */
        @Override
        public void setAlbum(String _album) {
            this._album = _album;
        }

        /**
         * Getter for album
         * @return
         */
        @Override
        public String getAlbum() {
            return _album;
        }

        /**
         * Setter for duration
         * @param _duration
         */
        @Override
        public void setDuration(String _duration) {
            this._duration = _duration;
        }

        /**
         * Getter for duration
         * @return
         */
        @Override
        public String getDuration() {
            return _duration;
        }

        /**
         * Setter for id
         * @param _id
         */
        @Override
        public void setID(int _id) {
            this._id = _id;
        }

        /**
         * Getter for id
         * @return
         */
        @Override
        public int getID() {
            return _id;
        }




    }
