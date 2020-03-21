
import processing.core.PApplet;

/**
 * Klasse Figuren.
 * Beschreibung: 
 *
 * @author Simon Gebert 
 * @version 1.0 vom 05.02.2020
 */
public class Figuren extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(100, 200); // Festlegen der Fenstergröße
    }        

    void zeichneBildC() {
        // Zeichne dir zunächst eine Skizze auf ein Blatt Papier und überlege dir, welche
        // Werte du den Methoden rect(x,y,b,h) und ellipse(x,y,b,h) übergeben musst, 
        // dass Bild C gezeichnet wird

        // ***** hier kommen deine Anweisungen hin ************
        rect(10,10,80,80);
        ellipse(50,50,70,70);
        ellipse(50,50,50,50);
        ellipse(50,50,30,30);

        ellipse(50,150,80,80);
        rect(25,125,50,50);
        rect(35,135,30,30);
        rect(45,145,10,10);
        // ***** Ende der eigenen Anweisungen **********
    }

    //***** Zusatzaufgabe bzw. Hausaufgabe *************
    void zeichneBildA() {
        // ***** hier kommen deine Anweisungen hin ************
        ellipse(50,40,60,60);
        rect(20,70,60,60);
        triangle(20,190,80,190,50,130);
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
        //zeichneBildC(); // Aufruf deiner Methode
         zeichneBildA();
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Figuren.class.getName() });
    }

}
