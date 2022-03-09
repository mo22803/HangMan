import acm.graphics.GCompound;
import acm.graphics.GLine;
import acm.graphics.GRect;

    public class Stand extends GCompound {


        public Stand() {
            GRect stand = new GRect(100, 20);
            add(stand);




            double x1 = getWidth() / 2 - stand.getWidth() / 2 + stand.getWidth()/2;
            double y1 = getHeight() / 2 - stand.getHeight() / 2;

            double x2 = getWidth() / 2 - stand.getWidth() / 2 + stand.getWidth()/2;
            double y2 = -150;

            double x3 = getWidth() /2- stand.getWidth()/2;
            double y3 = -150;

            GLine line1 = new GLine(x1, y1, x2, y2);
            add(line1);

            GLine line2 = new GLine(x2,y2,x3,y3 );
            add(line2);
        }

    }
