
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse uebung3.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class uebung3 extends PApplet
{       
    @Override
    public void settings()
    {
        size(720,720);
    }        

    int s = 30;//Seitenlaenge grosses Quadrat
    int k = 7;//Seitenlaenge kleines Quadrat
    int a = 3;//Abstand kleines Quadrat zum grossen Quadrat

    @Override
    public void setup()
    {
        zeichneQuadrateAussen();
        zeichneQuadrateMitte();
    }

    public void zeichneQuadrat(int x,int y,int farbe,boolean links)
    {
        noStroke();
        fill(farbe);
        rect(x,y,s,s);

        fill(255-farbe);
        if (links == true){//links ist true, wenn das obere Quadrat links ist

            rect(x+a,y+a,k,k);
            rect(x+s-a-k,y+s-a-k,k,k);

        } else {

            rect(x+s-a-k,y+a,k,k);
            rect(x+a,y+s-a-k,k,k);

        }
    }

    public void zeichneQuadrateAussen()
    {
        int farbe = 0;

        for (int j=0; j<24; j++){
            for (int i=0; i<24; i++){

                zeichneQuadrat(i*s,j*s,farbe,true);

                farbe = 255-farbe;

            }
            farbe = 255-farbe;
        }
    }

    public void zeichneQuadrateMitte()
    {
        int farbe = 0;

        for (int j=0; j<12; j++){
            for (int i=0; i<12; i++){

                fill(farbe);

                rect(6*s+i*s,6*s+j*s,s,s);

                farbe = 255-farbe;

            }
            farbe = 255-farbe;
        }

        for (int j=0; j<10; j++){
            for (int i=0; i<10; i++){

                zeichneQuadrat(7*s+i*s,7*s+j*s,farbe,false);

                farbe = 255-farbe;

            }
            farbe = 255-farbe;
        }
    }

    public static void main(String _args[]){ 
        PApplet.main(new String[] {uebung3.class.getName() });
    }

}
