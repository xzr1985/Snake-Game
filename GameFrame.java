/******************************************************************************
 * Project: Snake Game
 * Developer: Zafri Ahmed, Theodore Awa
 * Professor: Yulia Kumar
 * Kean University
 * Term: Spring 2022
 * ****************************************************************************
 * Description: In this game the player controls a snake by pressing arrow keys.
 * The objective is to eat as many apples as possible. Each apple is one point. 
 * Each time the snake eats an apple its body grows. The snake must avoid the 
 * walls and its own body to survive.
 *****************************************************************************/
package snakeGame;
import javax.swing.JFrame;

public class GameFrame extends JFrame{

	GameFrame(){
			
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
}