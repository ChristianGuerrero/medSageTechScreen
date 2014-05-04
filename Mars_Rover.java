/*Author: Christian Guerrero
*FileName: Mars_Rover
*Note: if using an IDE (ex. Eclipse) use Scanner if not use System.console
**/
import java.util.Scanner;
public class Mars_Rover {
	

	
	public static void main(String[] args) {
		int counter = 0;
		Scanner scan = new Scanner (System.in);
		//used to make sure 
		boolean inputSatisfied = false;
		//skip next while statements to retry entering info
		//grids max values and start positions
		int maxX=10;
		int maxY=10;
		int startX = 0;
		int startY=0;
		char startO='N';
		//input string for console 
		Rover rover1 = new Rover();
		Rover rover2 = new Rover();
    String input = null;
    String inputV[];
    
    
    //------------------------------------------------------------------------------------------
    
    while(!inputSatisfied){
    System.out.println("Enter upper right coordinates:");
    System.out.println("Format:<int> <int>");
  
    //input = System.console().readLine();
    input = scan.nextLine();
    
  //ints are seperated by space
    inputV = input.split(" ");
    if(inputV.length!=2){
    	System.out.println("Wrong number of variables");
    	continue;
    }
    try{
    maxX = Integer.parseInt(inputV[0]);
    maxY = Integer.parseInt(inputV[1]);
    }catch(NumberFormatException e){
    	System.out.println("Numbers are not proper format");
    	continue;
    }
	inputSatisfied = true;
	}//end of first input while
    
    //------------------------------------------------------------------------------------------
    
    inputSatisfied = false;
    //while for rover1 coordinates
    while(!inputSatisfied){
        System.out.println("Enter first Rover coordinates:");
        System.out.println("Format:<int> <int> <N,E,S or W>");
      
        //input = System.console().readLine();
        input = scan.nextLine();
        
      //ints are seperated by space
        inputV = input.split(" ");
        if(inputV.length!=3){
        	System.out.println("Wrong number of variables");
        	continue;
        }
        try{
        startX = Integer.parseInt(inputV[0]);
        startY = Integer.parseInt(inputV[1]);
        startO = inputV[2].toUpperCase().charAt(0);
        
        if((startO!='N') && (startO!='W')&&(startO!='S')&&(startO!='E')){
        	System.out.println("Orientation isn't N,W,S or E");
        	continue;
        }
        }catch(NumberFormatException e){
        	System.out.println("Numbers are not proper format");
        	continue;
        }
        
    	inputSatisfied = true;
    	}//end of second input while
    
 
    //------------------------------------------------------------------------------------------
  
    
    //while for rover1 motion
    inputSatisfied = false;
    while(!inputSatisfied){
    	   rover1.set(startX, startY, maxX, maxY, startO);
        System.out.println("Enter first Rover motions: Left Right or Move.");
        System.out.println("Format:<L,R or M>xN");
      
        //input = System.console().readLine();
        input = scan.nextLine();
        
      //ints are seperated by space
        inputV = input.split(" ");
        if(inputV.length!=1){
        	System.out.println("Wrong number of variables");
        	continue;
        }
        inputSatisfied = true;
        for(counter = 0; counter<inputV[0].length();counter++){
        	
        	
        	if(inputV[0].charAt(counter)=='L'){
        		rover1.rotateLeft();
        	}
        	else if(inputV[0].charAt(counter)=='R'){
        		rover1.rotateRight();
        	}
        	else if(inputV[0].charAt(counter)=='M'){
        		rover1.move();
        	}
        	else{
        		inputSatisfied=false;
        	}
        }//end of for
        if(!inputSatisfied)
        System.out.println("String contained wrong format");
        
    	}//end of third input while
    
    //------------------------------------------------------------------------------------------
    
    
  //while for rover2 coordinates
    inputSatisfied = false;
    while(!inputSatisfied){
        System.out.println("Enter second Rover coordinates:");
        System.out.println("Format:<int> <int> <N,E,S or W>");
      
        //input = System.console().readLine();
        input = scan.nextLine();
        
      //ints are seperated by space
        inputV = input.split(" ");
        if(inputV.length!=3){
        	System.out.println("Wrong number of variables");
        	continue;
        }
        try{
        startX = Integer.parseInt(inputV[0]);
        startY = Integer.parseInt(inputV[1]);
        startO = inputV[2].toUpperCase().charAt(0);
        
        if((startO!='N') && (startO!='W')&&(startO!='S')&&(startO!='E')){
        	System.out.println("Orientation isn't N,W,S or E");
        	continue;
        }
        }catch(NumberFormatException e){
        	System.out.println("Numbers are not proper format");
        	continue;
        }
        
    	inputSatisfied = true;
    	}//end of fourth input while
    
 
    //------------------------------------------------------------------------------------------
   
    
    //while for rover2 motion
    inputSatisfied = false;
    while(!inputSatisfied){
    	   rover2.set(startX, startY, maxX, maxY, startO);
        System.out.println("Enter second Rover motions: Left Right or Move.");
        System.out.println("Format:<L,R or M>xN");
      
        //input = System.console().readLine();
        input = scan.nextLine();
        
      //ints are seperated by space
        inputV = input.split(" ");
        if(inputV.length!=1){
        	System.out.println("Wrong number of variables");
        	continue;
        }
        inputSatisfied = true;
        for(counter = 0; counter<inputV[0].length();counter++){
        	
        	
        	if(inputV[0].charAt(counter)=='L'){
        		rover2.rotateLeft();
        	}
        	else if(inputV[0].charAt(counter)=='R'){
        		rover2.rotateRight();
        	}
        	else if(inputV[0].charAt(counter)=='M'){
        		rover2.move();
        	}
        	else{
        		inputSatisfied=false;
        	}
        }//end of for
        if(!inputSatisfied)
        System.out.println("String contained wrong format");
        
    	}//end of fifth input while
    
    System.out.println("Rover1: " + rover1);
    System.out.println("Rover2: " + rover2);
    
}
}
