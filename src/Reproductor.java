import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Reproductor extends JFrame {


    public Reproductor(){

        //Setting all songs into the comboBox
        ArrayList<Cancion> cancionesOBG = controlSystem.getData();
        String[] allSongs = controlSystem.getTitles(cancionesOBG);
        for(int a = 0;a<allSongs.length;a++){
            allSongsComboBox.addItem(allSongs[a]);
        }

        //Interface options
        setContentPane(reproductor);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200,200);
        musicPanel.setVisible(false);


        //Showing music panel afters its turned on
        onButton.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                musicPanel.setVisible(true);
            }
        });

        //Hides the music panel so it's off then.
        offButton.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                musicPanel.setVisible(false);

            }
        });
    }

    public static void main(String[] args) {
        JFrame reproductor = new Reproductor();
        reproductor.setVisible(true);
    }


    private JPanel reproductor;
    private JButton offButton;
    private JButton onButton;
    private JPanel musicPanel;
    private JButton previousButton;
    private JButton nextButton;
    private JButton playButton;
    private JComboBox allSongsComboBox;
    private JButton addCurrentSongToButton;
    private JComboBox favoriteSogsComboBox;
    private JButton playThisSongButton;
}
