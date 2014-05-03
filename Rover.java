
public class Rover {
	private int x;
	private int y;
	private char orientation;
	
	//initialization of rover class puts rover in starting position
	public Rover(int newX,int newY, char newOrientation){
		x = newX;
		y = newY;
		orientation = newOrientation;
	}
	//default initialization
	public Rover(){
		x = 0;
		y = 0;
		orientation = 'N';
	}
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
	public void move(){
		if(orientation=='N'){
			y++;
		}
		//rover is oriented west
		else if(orientation=='W'){
		  x--;
		}
		//rover is oriented south
		else if(orientation=='S'){
			y--;
		}
		else if(orientation=='E'){
			x++;
		}
	}
	
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
}
