
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

    int[] hellblau = {7,176,216};
    int[] dunkelblau = {6,69,144};
    int s = 40;//Seitenlaenge grosse Quadrate
    int k = 10;//Breite kleines Quadrat

    @Override
    public void setup()
    {
        background(255);
        schwarzeBalken();
        blaueBalken_mitRauten();
    }

    public void schwarzeBalken()
    {
        int x = 0;

        while (x<width){
            fill (0);
            rect (x+s/2,0,s,500);
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

    public void blaueBalken_mitRauten()
    {
        int x = 0;
        int y = s;
        int[] anfangsfarbe = dunkelblau;
        int[] farbe = anfangsfarbe;
        int rautenfarbe = 0;

        while (y<height){
            while (x<width){
                noStroke();

                fill (farbe[0],farbe[1],farbe[2]);
                rect (x,y,s,s);
                
                vier_rauten(x+s/2,y,rautenfarbe);//Rauten oben
                vier_rauten(x+s/2,y+s,255-rautenfarbe);//Rauten unten
                
                farbe = farbwechsel(farbe);
                rautenfarbe = 255-rautenfarbe;
                x = x+s;
            }
            x = 0;
            y = y+2*s+s/2;
            anfangsfarbe = farbwechsel(anfangsfarbe);
        }
    }

    public void viereck(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,int farbe)
    {
        fill(farbe);
        noStroke();

        quad(x1,y1,x2,y2,x3,y3,x4,y4);

    }

    public void vier_rauten(int x,int y,int farbe)
    {
        viereck(x-k,y,x-k/2,y-k/2,x,y,x-k/2,y+k/2,farbe);//links
        viereck(x-k/2,y-k/2,x,y-k,x+k/2,y-k/2,x,y,255-farbe);//oben
        viereck(x,y,x+k/2,y+k/2,x+k,y,x+k/2,y-k/2,farbe);//rechts
        viereck(x-k/2,y+k/2,x,y,x+k/2,y+k/2,x,y+k,255-farbe);//unten
    }   

    public static void main(String _args[]){ 
        PApplet.main(new String[] {uebung2.class.getName() });
    }

}
