import processing.core.PApplet;

public class Beispiel1 extends PApplet
{

    public void settings()
    {
        size(600,600);
    }

    public void setup()
    {
        zeichneQuadrate(0,0,0);
    }

    int s = 50;
    int a = 20;
    //int hex = #1CAF38;

    int farbwechsel(int farbe){
        int neueFarbe; {
            if (farbe == 255){
                neueFarbe = 0;
            } else {
                neueFarbe = 255;
            }
        }
        return neueFarbe;   
    }

    public void zeichneQuadrate(int x, int y, int farbe){

        int aktuelleFarbe = farbe;

        for (int j=0; j<=11; j++){
            for (int i=0; i<=11; i++){
                fill(aktuelleFarbe);
                rect(x+2*i*s,y+j*s,s,s);
                aktuelleFarbe = farbwechsel(aktuelleFarbe);
                fill(aktuelleFarbe);
                rect(x+s+2*i*s,y+j*s,s,s);
                rect(x+2*i*s+a/2,y+j*s+a/2,s-a,s-a);
                aktuelleFarbe = farbwechsel(aktuelleFarbe);
                fill(aktuelleFarbe);
                rect(x+s+2*i*s+a/2,y+j*s+a/2,s-a,s-a);
            }
            aktuelleFarbe = farbwechsel(aktuelleFarbe);
        }
    }

    public static void main(String _args[]){ 
        PApplet.main(new String[] {Beispiel1.class.getName() });
    }
}
