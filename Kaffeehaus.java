//$PKGLINE
import processing.core.PApplet;

/**
 * Klasse ProcessingTmpl.
 * Beschreibung: Template einer Processing Klasse. Kopieren und "ProcessingTmpl" durch eigenen Namen erstezen.
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kaffeehaus extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(640,361);//Fenstergröße
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {

        background(255);//Hintergrund weiß
        parallelen();//Aufruf der Methode
        //*zeichneQuadrate();*////Aufruf der Methode
        zeichneAlleQuadrate();//Aufruf der Methode
    }
    
    int s =40;
    int[] abstaende={10,20,30,20,10,20,30,20,10};
    
    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {

    }

    public void parallelen(){
        stroke(150);//Farbe der Parallelen
        for (int i=0; i<=10*s; i=i+s){//Zählschleife
            line(0,i,640,i);//Parallelen
        }
    }

    public void zeichneQuadrate(){
        fill(0);
        for (int i=0; i<=7; i++){
        rect(10+2*i*s,0,s,s);
        }
        
        for (int i=0; i<=7; i++){
        rect(20+2*i*s,s,s,s);
        }
        
        for (int i=0; i<=7; i++){
        rect(30+2*i*s,2*s,s,s);
        }
    }
    
    public void zeichneAlleQuadrate(){
    for (int j=0; j<=8; j++){
    fill(0);
        for (int i=0; i<=7; i++){
        rect(abstaende[j]+2*i*s,j*s,s,s);
        }
    }
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */	
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Kaffeehaus.class.getName() });
    }

}
