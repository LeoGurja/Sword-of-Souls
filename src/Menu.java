import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import java.awt.Font;

class Menu extends BasicGameState{

    private Button name;
    private Button play;

    Menu(int state){
    }

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
        name  = new Button(Game.gamename, Game.width/2, (int) (Game.height *0.1), new Fonte("Tahoma", Font.PLAIN, 50, 204, 0, 0, 255));
        play = new Button("play", Game.width /2, Game.height /2, new Fonte("Verdana", Font.PLAIN, 35, 204, 153, 0, 255));
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.drawImage(new Image("img/bg.jpg"),0,0);
<<<<<<< HEAD
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {

        if (In.mouseIsPressed(1)) {
            sbg.enterState(1);
        }
=======
        Fonte.ShadowFont(name);
        Fonte.ShadowFont(play);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{

        if(In.mouseIsOver(play.area())){
            play.setColor(200, 150, 0, 100);
            if (In.mouseIsPressed(In.LMB)){
                sbg.enterState(1);
            }
        } else play.setColor(204, 0, 0, 255);
>>>>>>> master
    }


    //retorna o ID do estado do jogo
    @Override
    public int getID() {
        return 0;
    }
}
