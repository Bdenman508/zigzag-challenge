/**
 * 
 */

/**
 * @author Bryan Denman
 * @date: Oct 12, 2023
 * 
 */
public class Zigzag {

	/**
	 * @param args
	 */
    public static void main(String[] args) {
    	String arr[] = {"coderbyteline","6"};
       zigzag1(arr);
    }
    
    public static void zigzag1(String[] input) {
    	String inStr=input[0];
    	int rows = Integer.parseInt(input[1]);  
    	int origSep = 2*rows -2;
    	int sep1 = 0;
    	int sep2=0;
    	for(int i=1; i<=rows; i++) {
    		int nxtchar=i-1;
    		String sep="1";
    		for(int j=0; j< inStr.length(); j++) {
    			if(j==nxtchar) {
    				System.out.print(inStr.charAt(nxtchar));
    				if(i==1 || i==rows) {
    					sep1 = origSep;
    					nxtchar=nxtchar + sep1;
    				} else {
    					if(sep.equals("1")) {
    						nxtchar=nxtchar + sep1;
    						sep="2";
    					} else {
    						nxtchar=nxtchar + sep2;
    						sep="1";
    					}
    				}
    			} else {
    				System.out.print(" ");
    			}
    		}
    		sep1 = sep1 - 2;
    		sep2=sep2 + 2;
    		System.out.println();
    	}
    }
}