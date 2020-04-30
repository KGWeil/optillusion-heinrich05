
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse uebung1.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class uebung1 extends PApplet
{       
    @Override
    public void settings()
    {
        size(500,500);
    }        

    int[] grau = {150,150,150};
    int[] blau = {63,113,196};
    int[] gruen = {84,185,102};
    int b = 50;//Breite graue Raute
    int h = 30;//Hoehe graue Raute

    @Override
    public void setup()
    {
        background(grau[0],grau[1],grau[2]);
        alleVierecke();
    }

    public void viereck(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,int[]farbe)
    {
        fill(farbe[0],farbe[1],farbe[2]);
        noStroke();

        quad(x1,y1,x2,y2,x3,y3,x4,y4);

    }

    public void alleVierecke()
    {
        int y = 0;
        int x = 0;
        int[] farbe = blau;
        boolean erstBlau = true;

        while (y<height){

            if (erstBlau == true){

                while(x<width){
                    
                    farbe = blau;
                    viereck(x,y,x+b/2,y+h/2,x+b/2,y+h+h/2,x,y+h,farbe);

                    farbe = gruen;
                    x = x+b/2;

                    viereck(x,y+h/2,x+b/2,y,x+b/2,y+h,x,y+h+h/2,farbe);

                    x = x+b/2;
                    farbe = blau;
                }

                erstBlau = false;
                x = 0;
                y = y+h+h/2;

            }
            else
            {
                while(x<width){
                    
                    farbe = gruen;
                    viereck(x,y+h/2,x+b/2,y,x+b/2,y+h,x,y+h+h/2,farbe);

                    farbe = blau;
                    x = x+b/2;

                    viereck(x,y,x+b/2,y+h/2,x+b/2,y+h+h/2,x,y+h,farbe);

                    x = x+b/2;
                    farbe = gruen;
                }

                erstBlau = true;
                x = 0;
                y = y+h+h/2;

            }
        }
    }

    public static void main(String _args[]){ 
        PApplet.main(new String[] {uebung1.class.getName() });
    }

}
