package javagame;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState{

		
	//CONSTRUCTOR
	public Menu(int state){
		
	}
	
	//initialize slick
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		
		
	}
	
	//draw things on screen
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		
		Image bg = new Image("res/menu_bg.jpg");
		g.drawImage(bg, 0, 0);
	}
	
	//update images on screen
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		
		Input    input     = gc.getInput();
		int      xPos      = Mouse.getX();
		int      yPos      = Mouse.getY();
		
		if((xPos > 550 && xPos < 650) && (yPos > 300 && yPos < 420)){
			if(input.isMouseButtonDown(0)){
				sbg.enterState(1);
			}
		}
	}
	
	//return state ID
	public int getID(){
		return 0;
	}
	
	
}
