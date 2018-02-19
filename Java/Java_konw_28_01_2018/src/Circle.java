import java.awt.*;
import java.util.ArrayList;

public class Circle extends Figure implements DrawAble {
    private int x,y,r;
    public Circle (int x, int y, int r){
        this.x=x;
        this.y=y;
        this.r=r;
    }
    public Circle (int x, int y, int r, Color color){
        this(x,y,r);
        this.color=color;
    }

    @Override
    public void draw(Graphics g){
        g.setColor(color);
        g.drawOval(x-r,x-r,2*r,2*r);



    };
}

