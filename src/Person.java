import acm.graphics.GCompound;
import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.graphics.GOval;

public class Person extends GCompound {

    public Person(){
        GOval head = new GOval(25,25);
        add(head);

        GLine body = new GLine(head.getWidth()-head.getWidth()/2, head.getHeight(),head.getWidth()/2, head.getHeight()+50 );
        add(body);

        GLine leftleg = new GLine(head.getWidth()-head.getWidth()/2, head.getHeight()+50 , body.getWidth() -10,body.getHeight()+50);
        add(leftleg);

        GLine rightleg = new GLine(head.getWidth()-head.getWidth()/2, head.getHeight()+50 , body.getWidth() +30,body.getHeight()+50);
        add(rightleg);

        GLine leftarm = new GLine(head.getWidth()-head.getWidth()/2 , body.getHeight()/2+15, head.getWidth()-head.getWidth()/2 - 25,body.getHeight()/2 );
        add(leftarm);

        GLine rightarm = new GLine(head.getWidth()-head.getWidth()/2 , body.getHeight()/2+15, head.getWidth()-head.getWidth()/2 +25,body.getHeight()/2 );
        add(rightarm);
    }



    }


