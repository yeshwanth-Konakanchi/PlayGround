package com.crmindz.bcjmay2017.flowcontrol.lab11;

/**
 * @author Yeshwanth Konakanchi
 *This class will print the checker board using repetition statements.
 */
public class CheckerBoard{
	
	public static void main(String[] args) {
		
		for(int i=0; i<4; i++){
			
			for(int j=0; j<8; j++){
				System.out.print( "* " );
			}
			
			System.out.println();
			System.out.print( " " );
			
			for(int j=0; j<8; j++){
				System.out.print( "* " );	
			}
			
			System.out.println();
		}
	}

}
