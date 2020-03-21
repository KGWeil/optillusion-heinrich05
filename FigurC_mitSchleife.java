
import processing.core.PApplet;

/**
 * Klasse figurC_mitSchleife.
 * Beschreibung: 
 *
 * @author Simon Gebert 
 * @version 1.0 vom 05.02.2020
 */
public class FigurC_mitSchleife extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(100,200); // Festlegen der Fenstergröße
    }        

    void zeichneBildC() {
        // ***** hier kommen deine Anweisungen hin ************
        rect(10,10,80,80);
        for (int i=0; i<3; i++){
            ellipse(50,50,70-i*20,70-i*20);
        }

        ellipse(50,150,80,80);
        for (int i=0; i<3; i++){
            rect(25+i*10,125+i*10,50-i*20,50-i*20);
        }
        // ***** Ende der eigenen Anweisungen **********
    }

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        zeichneBildC(); // Aufruf deiner Methode
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {FigurC_mitSchleife.class.getName() });
    }

}
