import processing.core.PApplet;

public class wellen2 extends PApplet
{

    public void settings()
    {
        size(600,600);
    }

    public void setup()
    {
        zeichneQuadrate();
    }

    int s = 50; //Seitenlaenge
    int a = 10; //Abstand zwischen großem und kleinen Rechteck
    int[] gruen = {28,175,56};
    int[] weiss = {255,255,255};

    int[] farbwechsel(int[] farbe){
        int[] neueFarbe; {
            if (farbe == gruen){
                neueFarbe = weiss; 
            } else {
                neueFarbe = gruen;
            }
        }
        return neueFarbe;   
    }

    public void zeichneQuadrat(int x,int y, int[] rahmenfarbe)
    {
        fill(rahmenfarbe[0],rahmenfarbe[1],rahmenfarbe[2]);
        noStroke();

        rect(x,y,s,s);//großes Quadrat

        fill(farbwechsel(rahmenfarbe)[0],farbwechsel(rahmenfarbe)[1],farbwechsel(rahmenfarbe)[2]);

        rect(x+a/2,y+a/2,s-a,s-a);//kleines Quadrat
    }

    public void zeichneQuadrate()
    {
        int[] farbe = gruen;//erste Rahmenfarbe
        int x = 0;//x fuer while-Schleife
        int y = 0;//y fuer while-Schleife
        
        while (y<600){//y-Richtung
            while (x<600){//x-Richtung
                zeichneQuadrat(x,y,farbe);
                farbe = farbwechsel(farbe);
                x = x+s;
            }
            farbe = farbwechsel(farbe);//Farbwechsel wegen neuer Reihe
            x = 0;
            y = y+s;
        }
    }

    public static void main(String _args[]){ 
        PApplet.main(new String[] {wellen2.class.getName() });
    }
}
