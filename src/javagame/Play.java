package javagame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Play extends BasicGameState{

	//CONSTRUCTOR
	public Play(int state){
		
	}
	
	//initialize slick
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		
	}
	
	//draw things on screen
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		
		g.drawString("Play State", 500, 300);
	}
	
	//update images on screen
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		
	}
	
	//return state ID
	public int getID(){
		return 1;
	}
	
	
}
