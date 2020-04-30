
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse uebung2.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class uebung2 extends PApplet
{       
    @Override
    public void settings()
    {
        size(500,500);
    }        

    int[] weiss = {255,255,255};
    int[] schwarz = {0,0,0};
    int[] hellblau = {7,176,216};
    int[] dunkelblau = {6,69,144};
    int s = 40;//Seitenlaenge grosse Quadrate
    int k = 10;//Seitenlange kleines Viereck

    @Override
    public void setup()
    {
        background(weiss[0],weiss[1],weiss[2]);
        schwarzeBalken();
        blaueBalken();
    }

    public void schwarzeBalken()
    {
        int x = 0;

        while (x<500){
            fill (schwarz[0],schwarz[1],schwarz[2]);
            rect (s/2+x,0,s,500);
            x = x+2*s;
        }
    }

    int[] farbwechsel(int[] farbe){
        int[] neueFarbe; {
            if (farbe == hellblau){
                neueFarbe = dunkelblau; 
            } else {
                neueFarbe = hellblau;
            }
        }
        return neueFarbe;   
    }

    public void blaueBalken()
    {
        int x = 0;
        int y = s;
        int[] farbe = dunkelblau;

        while (y<height){
            while (x<width){
                noStroke();

                fill (farbe[0],farbe[1],farbe[2]);
                rect (x,y,s,s);

                farbe = farbwechsel(farbe);
                x = x+s;

                fill (farbe[0],farbe[1],farbe[2]);
                rect (x,y,s,s);
                farbe = farbwechsel(farbe);
                x = x+s;
            }
            x = 0;
            y = y+2*s+s/2;
            farbe = farbwechsel(farbe);
        }
    }

    public void viereck(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,int[]farbe)
    {
        fill(farbe[0],farbe[1],farbe[2]);
        noStroke();

        quad(x1,y1,x2,y2,x3,y3,x4,y4);

    }

    public void vier_rauten(int x,int y,int[]farbe)
    {

    }   

    public static void main(String _args[]){ 
        PApplet.main(new String[] {uebung2.class.getName() });
    }

}
