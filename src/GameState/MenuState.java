package GameState;
import TileMap.Background;
import java.awt.*;
import java.awt.event.KeyEvent;
/**
 * Created by Шпакулева on 17.10.2016.
 */
public class MenuState extends GameState{

    public Background bg;

    private int currentChoice=0;

    private String[] options={
            "Start",
            "Rules",
            "Help",
            "Quit"
    };

    private Color titleColor;
    private Color colorMenu;
    private Font titleFont;

    private Font font;



    public MenuState(GameStateManager gsm){

        this.gsm = gsm;

        try{

            bg = new Background("/Backgrounds/menubg.png", 1);
            bg.setVector(-0.2, 0);

            titleColor = new Color(247, 255, 239);
            titleFont = new Font("Modern No. 20", Font.PLAIN, 28);

            font = new Font("Modern No. 20", Font.PLAIN, 12);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void init(){}
    public void update(){
        bg.update();
    }
    public void draw(java.awt.Graphics2D g){
        bg.draw(g);
        g.setColor(titleColor);
        g.setFont(titleFont);
        g.drawString("The Christmas adventure", 20, 33);


        g.setFont(font);
        for (int i = 0; i < options.length; i++){
            if (i== currentChoice){
                colorMenu = new Color(252, 255, 76);
                g.setColor(colorMenu);
            }
            else {
                colorMenu = new Color(255, 254, 197);
                g.setColor(colorMenu);
            }
            g.drawString(options[i], 145, 115 + i*15);
        }
    }

    private void select(){
        if (currentChoice==0) {
            //start
        }
        if (currentChoice==1) {
            //rules
        }
        if (currentChoice==2) {
            //help
        }
        if (currentChoice==3) {
            System.exit(0);
        }
    }

    public  void keyPressed(int k){
        if (k==KeyEvent.VK_ENTER){
            select();
        }
        if (k==KeyEvent.VK_UP){
            currentChoice--;
            if (currentChoice==-1){
                currentChoice=options.length-1;
            }
        }
        if (k==KeyEvent.VK_DOWN){
            currentChoice++;
            if (currentChoice==options.length){
                currentChoice=0;
            }
        }
    }
    public  void keyReleased(int k){}

}
