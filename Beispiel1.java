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

    int s = 50; //Seitenlänge
    int a = 20; //Abstand zwischen großem und kleinen Rechteck

    int farbwechsel(int farbe){
        int neueFarbe; {
            if (farbe == 255){
                neueFarbe = 0; //eigentlich #228B22, BlueJ erkennt aber leider keinen Hex-Code
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
                rect(x+2*i*s,y+j*s,s,s);//erstes großes Quadrat
                aktuelleFarbe = farbwechsel(aktuelleFarbe);
                fill(aktuelleFarbe);
                rect(x+s+2*i*s,y+j*s,s,s);//zweites großes Quadrat
                rect(x+2*i*s+a/2,y+j*s+a/2,s-a,s-a);//erstes kleines Quadrat
                aktuelleFarbe = farbwechsel(aktuelleFarbe);
                fill(aktuelleFarbe);
                rect(x+s+2*i*s+a/2,y+j*s+a/2,s-a,s-a);//zweites kleines Quadrat
            }
            aktuelleFarbe = farbwechsel(aktuelleFarbe);//Verschiebung der Farben für die neue Reihe
        }
    }

    public static void main(String _args[]){ 
        PApplet.main(new String[] {Beispiel1.class.getName() });
    }
}
