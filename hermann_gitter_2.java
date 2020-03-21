//$PKGLINE
import processing.core.PApplet;
public class hermann_gitter_2 extends PApplet
{       
    @Override
    public void settings()
    {
        size(500,500);
    }        

    @Override
    public void setup(){
        background(30,144,255);
        zeichneQuadrate();
        zeichneKreise();
    }

    int s=50;
    int a=15;
    int Beginn=30;

    public void zeichneQuadrate(){
        fill(0);
        for(int j=0; j<=6; j++){
            for (int i=0; i<=6; i++){
                rect(Beginn+i*(a+s),Beginn+j*(a+s),s,s);
            }
        }
    }

    public void zeichneKreise(){
        fill(255);
        noStroke();
        for (int j=0; j<=5; j++){
        for (int i=0; i<=5; i++){
        ellipse(Beginn+s+(a/2)+i*(a+s),Beginn+s+(a/2)+j*(a+s),a+2,a+2);
        }
        }

    }

    public static void main(String _args[]){ 
        PApplet.main(new String[] {hermann_gitter_2.class.getName() });
    }

}
