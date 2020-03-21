//$PKGLINE
import processing.core.PApplet;

/**
 * Klasse ProcessingTmpl.
 * Beschreibung: Template einer Processing Klasse. Kopieren und "ProcessingTmpl" durch eigenen Namen erstezen.
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class hermann_gitter_1 extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500,500);

    }        

    int s=50;
    int a=10;

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(255);
        quadrate();
    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {

    }

    public void quadrate(){
        for (int j=0;j<=7;j++){
            for (int i=0;i<=7;i++){
                fill(0);rect(15+i*(a+s),15+j*(a+s),s,s);   
            }
        }
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */	
    public static void main(String _args[]){ 
        PApplet.main(new String[] {hermann_gitter_1.class.getName() });
    }

}
