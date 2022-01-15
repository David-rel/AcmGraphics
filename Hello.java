import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class Hello extends GraphicsProgram {

    public void run(){
        GOval ovals = new GOval(50,50);
        ovals.setFilled(true);
        ovals.setColor(Color.RED);
        add(ovals);

    }
}
