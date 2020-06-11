
import processing.core.PApplet;
import processing.core.PFont;
import java.util.Random;

/**
 * Klasse uebung4.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class uebung4 extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(750,200);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        vorbereitung();
        noLoop();
    }

    int rot = 0;
    int grün = 0;
    int blau = 0;
    int rot_hintergrund;
    int grün_hintergrund;
    int blau_hintergrund;
    boolean Zehnerschritte = true;
    boolean verringern = false;

    public void vorbereitung(){
        Random farbe = new Random();//Zufallszahl erstellen

        //Zufallszahlszahlen generieren und auf Intergers runden 
        rot_hintergrund = farbe.nextInt(255);
        grün_hintergrund = farbe.nextInt(255);
        blau_hintergrund = farbe.nextInt(255);

        fill(rot_hintergrund,grün_hintergrund,blau_hintergrund);
        rect(20,20,160,160);

        fill(0);
        rect(60,60,80,80);
        text("Start mit Mausklick: Schrittweite 10",220,30);
        text("Umschalten der Schrittweite von 10 auf 1 (und umgekehrt) durch Mausklick",220,65);
        text("Verändern der Farbwerte durch Tastendruck: r - rot, g - grün, b - blau",220,100);
        text("Überprüfen mit Leertaste: Ausgabe in der Konsole",220,135);
        text("Modus, ob Farbwerte verringert oder erhöht werden sollen, umstellen: v drücken",220,170);
    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw(){
        noStroke();
        fill(rot,grün,blau);
        rect(60,60,80,80);
    }

    public void keyPressed(){
        //Schrittweite und -richtung (positiv oder negativ) aufrufen
        int f;
        if (verringern == false){
            if (Zehnerschritte == true){
                f = 10;
            } else {
                f = 1;   
            }
        } else {
            if (Zehnerschritte == true){
                f = -10;
            } else {
                f = -1;   
            }
        }

        //Schauen, welche Taste gedrückt wird
        if (key == 'v'){
            verringern = ! verringern; 
            println("Verringern der Zahlen ist nun: "+verringern);
        }

        if (key == 32){
            Überprüfen();
        }

        if (key == 'r'){
            if (-1<(rot + f)){
                if ((rot + f)<256){  //Zahlen bleiben durch die Bedingung zwischen 0 und 255
                    rot = (rot + f);
                }
            }
            println("Rot: "+rot);//aktuellen Wert anzeigen
        }

        if (key == 'g'){
            if (-1<(grün + f)){
                if ((grün + f)<256){
                    grün = (grün + f);
                }
            }
            println("Grün: "+grün);
        }

        if (key == 'b'){
            if (-1<(blau + f)){
                if ((grün + f)<256){
                    blau = (blau + f);
                }
            }
            println("Blau :"+blau);
        }
        
        redraw();
    }

    public void mousePressed(){
        Zehnerschritte = ! Zehnerschritte;
    }

    public void Überprüfen(){
        String text_rot;
        String text_grün;
        String text_blau;

        if (rot < rot_hintergrund){
            text_rot = "Du brauchst noch mehr Rot";
        } else if (rot > rot_hintergrund){
            text_rot = "Du brauchst weniger Rot";
        } else {
            text_rot = "Rot hat den richtigen Wert";
        }

        if (grün < grün_hintergrund){
            text_grün = "du brauchst noch mehr Grün";
        } else if (grün > grün_hintergrund){
            text_grün = "du brauchst weniger Grün";
        } else {
            text_grün = "Grün hat den richtigen Wert";
        }

        if (blau < blau_hintergrund){
            text_blau = "du brauchst noch mehr Blau";
        } else if (blau > blau_hintergrund){
            text_blau = "du brauchst weniger Blau";
        } else {
            text_blau = "Blau hat den richtigen Wert";
        }

        println(text_rot+", "+text_grün+" und "+text_blau+".");
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {uebung4.class.getName() });
    }

}
