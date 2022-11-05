import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Reproductor extends JFrame {


    public Reproductor(){

        setContentPane(reproductor);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200,200);
        musicPanel.setVisible(false);
        onButton.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                musicPanel.setVisible(true);
            }
        });
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
        ArrayList<Cancion> cancionesOBG = controlSystem.getData();
        //Control point
        for(int i = 0;i<cancionesOBG.size();i++){
            System.out.println("\n========================");
            System.out.println("ID SONG: "+cancionesOBG.get(i).getID());
            System.out.println("TITLE: "+cancionesOBG.get(i).getTitle());
            System.out.println("ARTISTA: "+cancionesOBG.get(i).getArtist());
            System.out.println("ALBUM: "+cancionesOBG.get(i).getAlbum());
            System.out.println("DURATION: "+cancionesOBG.get(i).getDuration());
            System.out.println("========================");
        }
    }


    private JPanel reproductor;
    private JButton offButton;
    private JButton onButton;
    private JPanel musicPanel;
}
