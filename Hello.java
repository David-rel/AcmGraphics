import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class Hello extends GraphicsProgram {

    public void run(){
        GOval oval = new GOval(50,50);
        oval.setFilled(true);
        oval.setColor(Color.RED);
        add(oval);

    }
}
