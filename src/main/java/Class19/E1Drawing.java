package Class19;


import javax.swing.*;
import java.awt.*;

public class E1Drawing {
    public static void main(String[] args) {

        JFrame j=new JFrame();
        MyCanvas c=new MyCanvas();
        j.setSize(2000,2000);
        j.add(c);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
    }
}

class MyCanvas extends Canvas{
    public void print(Graphics g){
        g.setColor(Color.BLUE);
        g.fillOval(200,200,500,500);

        g.setColor(Color.YELLOW);
    }
}

