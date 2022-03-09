import acm.graphics.GCompound;
import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.graphics.GOval;

public class Person extends GCompound {

    public GOval head;
    public GLine body;
    public GLine leftleg;
    public GLine rightleg;
    public GLine rightarm;
    public GLine leftarm;


    public Person(){
        head = new GOval(25,25);

        body = new GLine(head.getWidth()-head.getWidth()/2, head.getHeight(),head.getWidth()/2, head.getHeight()+50 );

        leftleg = new GLine(head.getWidth()-head.getWidth()/2, head.getHeight()+50 , body.getWidth() -10,body.getHeight()+50);

        rightleg = new GLine(head.getWidth()-head.getWidth()/2, head.getHeight()+50 , body.getWidth() +30,body.getHeight()+50);


        leftarm = new GLine(head.getWidth()-head.getWidth()/2 , body.getHeight()/2+15, head.getWidth()-head.getWidth()/2 - 25,body.getHeight()/2 );

        rightarm = new GLine(head.getWidth()-head.getWidth()/2 , body.getHeight()/2+15, head.getWidth()-head.getWidth()/2 +25,body.getHeight()/2 );

    }

    public void guessedWrong( int n ){
        if(n == 1){
            add(head);
        }
        if(n == 2){
            add(body);
        }
        if(n == 3){
            add(leftleg);
        }
        if(n == 4){
            add(rightleg);
        }
        if(n == 5){
            add(leftarm);
        }
        if(n == 6){
            add(rightarm);
        }
    }


    }


