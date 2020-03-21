//$PKGLINE
import processing.core.PApplet;
public class wellen1 extends PApplet
{       
    @Override
    public void settings()
    {
        size(600,400);
    }        

    @Override
    public void setup(){
        background(255,165,0);
        zeichneQuadrat(20,60,255,true);
        zeichneLinien(10,60);
    }

    int s = 70;
    int a = 4;

    int farbwechsel(int aktuelleFarbe){
        int farbwechsel; {
            if (aktuelleFarbe == 255){
                farbwechsel = 0;   
            }  else {
                farbwechsel = 255;
            }
        }
        return farbwechsel;
    }

    public void zeichneQuadrat(int x,int y, int farbe, boolean links){

        int aktuelleFarbe = farbe;

        for (int j = 0; j<=3; j++){
            for (int i = 0; i<=7; i++){
                if (aktuelleFarbe == 255){
                    fill (aktuelleFarbe);
                    rect(x+i*s,y+j*s,s,s);
                    aktuelleFarbe = farbwechsel(aktuelleFarbe);
                }  else  {
                    fill (aktuelleFarbe);
                    rect(x+i*s,y+j*s,s,s);
                    aktuelleFarbe = farbwechsel(aktuelleFarbe);
                }

                if (links == true){
                    fill(aktuelleFarbe);
                    ellipseMode(CORNERS);
                    noStroke();
                    ellipse(x+a+i*s,y+a+j*s,x+a+i*s+s/4,y+a+j*s+s/4);
                    ellipse(x+a+i*s,y+j*s+s-s/4-a,x+a+i*s+s/4,y+(j+1)*s-a);
                }  else  {
                    fill(aktuelleFarbe);
                    ellipseMode(CORNERS);
                    noStroke();
                    ellipse(x+i*s+s-s/4-a,y+j*s+a,x+i*s+s-a,y+j*s+s/4+a);
                    ellipse(x+i*s+s-s/4-a,y+j*s+s-s/4-a,x+i*s+s-a,y+(j+1)*s-a);
                }
            }
            if (links == true){
                links = false;
            }  else  {
                links = true;
            }
            aktuelleFarbe = farbwechsel(aktuelleFarbe);
        }

    }

    public void zeichneLinien(int x, int y){
        for (int i = 1; i<=3; i++)
        {
            stroke(0,250,154);
            strokeWeight(4);
            line(x,y+i*s,x*3+8*s,y+i*s);
        }   
    }

    public static void main(String _args[]){ 
        PApplet.main(new String[] {wellen1.class.getName() });
    }

}
