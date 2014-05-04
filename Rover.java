/*Author: Christian Guerrero
*FileName: Rover
*/
public class Rover {
	private int x;
	private int y;
	private int maxX;
	private int maxY;
	private char orientation;
	

	/**
	 * Initializes new Rover object with specified parameters
	 * @param newX 	x starting position
	 * @param newY 	y starting position
	 * @param newMaxX 	maximum x value
	 * @param newMaxY 	maximum y value
	 * @param newOrientation	starting orientation position 
	 */
	public Rover(int newX,int newY,int newMaxX,int newMaxY, char newOrientation){
		x = newX;
		y = newY;
		maxX = newMaxX;
		maxY = newMaxY;
		orientation = newOrientation;
	}
	/**
	 * Default constructor
	 */
	public Rover(){
		x = 0;
		y = 0;
		orientation = 'N';
	}
	/**
	 * Sets values for all of Rover parameters
	 * 
	 * @param newX 	x starting position
	 * @param newY 	y starting position
	 * @param newMaxX 	maximum x value
	 * @param newMaxY 	maximum y value
	 * @param newOrientation	starting orientation position 
	 */
	public void set(int newX,int newY,int newMaxX,int newMaxY, char newOrientation){
		x = newX;
		y = newY;
		maxX = newMaxX;
		maxY = newMaxY;
		orientation = newOrientation;
	}
	/**
	 *  Rotates rover 90 degrees left
	 * @return returns new orientation
	 */
	public char rotateLeft(){
		//rover is oriented north
		if(orientation=='N'){
			orientation = 'W';
		}
		//rover is oriented west
		else if(orientation=='W'){
			orientation ='S';
		}
		//rover is oriented south
		else if(orientation=='S'){
			orientation ='E';
		}
		else if(orientation=='E'){
			orientation ='N';
		}
		
		return orientation;
	}
	
	/**
	 * Rotates rover 90 degrees right
	 * @return returns new orientation
	 */
	public char rotateRight(){
		//rover is oriented north
				if(orientation=='N'){
					orientation = 'E';
				}
				//rover is oriented west
				else if(orientation=='W'){
					orientation ='N';
				}
				//rover is oriented south
				else if(orientation=='S'){
					orientation ='W';
				}
				else if(orientation=='E'){
					orientation ='S';
				}
				return orientation;
	}
	//function assumes that main function checks if move is valid
	/**
	 * Moves Rover as specified by orientation
	 */
	public void move(){
		if(orientation=='N' && y<maxY){
			y++;
		}
		//rover is oriented west
		else if(orientation=='W' && x > 0){
		  x--;
		}
		//rover is oriented south
		else if(orientation=='S' && y > 0){
			y--;
		}
		else if(orientation=='E' && x < maxX){
			x++;
		}
	}
	
	/**
	 * Get function for x coordinate
	 * @return return x coordinate
	 */
	public int getX(){
		return x;
	}
	
	/**
	 * Get function for y coordinate
	 * @return
	 */
	public int getY(){
		return y;
	}

	public String toString(){
		return (x + " " + y + " " + orientation);
	}
}
