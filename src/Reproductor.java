import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reproductor extends JFrame {


    public Reproductor(){

        IpodSimulator ipod = new IpodSimulator();
        int favoritesSongs =0;
        Cancion[] canciones = ipod.getAllSongs();
        ipod.setActualIndex(0);
        ipod.setActual_state(false);
        ipod.setActual_locked_state(false);
        ipod.CsetVolume(0);
        volumenStatus.setText("Volume: 0");

        //Control point
        //for(int cancion = 0;cancion<canciones.length;cancion++){
        //    System.out.println("Current index: "+cancion);
        //    System.out.println(canciones[cancion].getTitle());
        //}

        //Interface options
        setContentPane(reproductor);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        previousButton.setVisible(false);
        nextButton.setVisible(false);
        musicPanel.setVisible(false);
        favoritesPanel.setVisible(false);
        statusStatus.setText("Status: Unlocked");
        volumenStatus.setText("Volume: 0");

        /**
         * BUTTONS OPTIONS
         */

        //Showing music panel afters its turned on
        onButton.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!ipod.getActual_state()){

                    musicPanel.setVisible(true);
                    ipod.setActual_state(true);
                    activutyStatus.setText("Activity: ON");


                }else{

                    musicPanel.setVisible(false);
                    ipod.setActual_state(false);
                    activutyStatus.setText("Activity: OFF");

                }
            }
        });

        //Next button code
        nextButton.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = ipod.Next(ipod.getActualIndex());
                ipod.setActualIndex(index);
                System.out.println("CURRENT INDEX: ");
                System.out.println(index);
                songInCourse.setText(canciones[ipod.getActualIndex()].getTitle());
                albumLabel.setText("Album: "+canciones[ipod.getActualIndex()].getAlbum());
                artistLabel.setText("Artist: "+canciones[ipod.getActualIndex()].getArtist());
                songStatus.setText("Song: "+songInCourse.getText());
            }
        });

        //Play Button piece code
        playButton.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {

                previousButton.setVisible(true);
                nextButton.setVisible(true);
                favoritesPanel.setVisible(true);
                songInCourse.setText(canciones[ipod.getActualIndex()].getTitle());
                albumLabel.setText("Album: "+canciones[ipod.getActualIndex()].getAlbum());
                artistLabel.setText("Artist: "+canciones[ipod.getActualIndex()].getArtist());
                songStatus.setText("Song: "+canciones[ipod.getActualIndex()].getTitle());

            }
        });

        //Previous Button code
        previousButton.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {

                int index = ipod.Prev(ipod.getActualIndex());
                System.out.println("CURRENT INDEX: ");
                System.out.println(index);
                ipod.setActualIndex(index);

                songInCourse.setText(canciones[ipod.getActualIndex()].getTitle());
                albumLabel.setText("Album: "+canciones[ipod.getActualIndex()].getAlbum());
                artistLabel.setText("Artist: "+canciones[ipod.getActualIndex()].getArtist());
                songStatus.setText("Song: "+songInCourse.getText());


            }
        });
        lockUnlockButton.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {

                if (!ipod.LockUnlockDevice(ipod.getActual_locked_state())){

                    System.out.println("Blocking");
                    ipod.setActual_locked_state(true);
                    playButton.setEnabled(false);
                    previousButton.setEnabled(false);
                    nextButton.setEnabled(false);
                    volumenUp.setEnabled(false);
                    volumenDown.setEnabled(false);
                    statusStatus.setText("Status: Locked");

                }else{

                    System.out.println("Unlocking");
                    ipod.setActual_locked_state(false);
                    playButton.setEnabled(true);
                    previousButton.setEnabled(true);
                    nextButton.setEnabled(true);
                    volumenUp.setEnabled(true);
                    volumenDown.setEnabled(true);
                    statusStatus.setText("Status: Unlocked");

                }
                }{
            }
        });

        //Volume up button
        volumenUp.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {

                //First checking if it doesn't go far

                if (ipod.CgetVolume()== 10){
                    System.out.println("Max volume reahed");
                    adviceLabel.setText("Max volume reached :)");

                } else{
                    System.out.println("Turning volume up");
                    ipod.CsetVolume((float) (ipod.CgetVolume()+ 0.5));
                    System.out.println(ipod.CgetVolume());
                    volumenStatus.setText("Volume: "+ipod.CgetVolume());

                }

            }
        });
        volumenDown.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ipod.CgetVolume() == 0){
                    System.out.println("Min voumen has been reacherd");
                    adviceLabel.setText("Min volumen reached :)");
                } else{
                    System.out.println("Turning volume down");
                    ipod.CsetVolume((float) (ipod.CgetVolume()-0.5));
                    volumenStatus.setText("Volume: "+ipod.CgetVolume());

}
            }
                    });
                    addCurrentSongToButton.addActionListener(new ActionListener() {
/**
 * @param e the event to be processed
 */
@Override
public void actionPerformed(ActionEvent e){
        System.out.println("Current song info");
        System.out.println(canciones[ipod.getActualIndex()].getTitle());

        String Title = canciones[ipod.getActualIndex()].getTitle();
        String Artist = canciones[ipod.getActualIndex()].getArtist();
        String Album = canciones[ipod.getActualIndex()].getAlbum();
        String duration = canciones[ipod.getActualIndex()].getDuration();
        int _id = canciones[ipod.getActualIndex()].getID();
        Cancion newFavSong = new Cancion(Title,Artist,Album,duration,_id);

        }
        });
        }

public static void main(String[] args) {
        JFrame reproductor = new Reproductor();
        reproductor.setVisible(true);
        }
private JPanel reproductor;
private JButton onButton;
private JPanel musicPanel;
private JButton previousButton;
private JButton nextButton;
private JButton playButton;
private JButton addCurrentSongToButton;
private JComboBox favoriteSogsComboBox;
    private JButton playThisSongButton;
    private JLabel songInCourse;
    private JPanel favoritesPanel;
    private JLabel albumLabel;
    private JLabel artistLabel;
    private JButton volumenDown;
    private JButton volumenUp;
    private JPanel statusPanel;
    private JButton lockUnlockButton;
    private JLabel activutyStatus;
    private JLabel statusStatus;
    private JLabel songStatus;
    private JLabel volumenStatus;
    private JLabel adviceLabel;
}
