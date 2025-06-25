import java.io.*;
import java.util.*;

class OneLineString{


	//1]String nextToken()
	//2]int countTokens()
	//3]obj nextElement
	//4]boolean hasMoreTokens() or boolean hasMoreElements()
	public static void main(String args[]) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter String");
               
		String name=br.readLine();
    
		StringTokenizer st=new StringTokenizer(name," #");
		
		/*System.out.println("Tokens  "+ st.countTokens()); 

                String playerName=st.nextToken();
		
		System.out.println("Tokens  "+ st.countTokens()); 
	        
		char country=st.nextToken().charAt(0);
		
		System.out.println("Tokens  "+ st.countTokens()); 

	        int jNumber=Integer.parseInt(st.nextToken());	
		
		System.out.println("Tokens  "+ st.countTokens()); 
		
		System.out.println("name is "+playerName);
		System.out.println("jersy number is "+country);
		System.out.println("salary is "+ jNumber);
		
		System.out.println("Tokens  "+ st.countTokens()); //countTokens() , nextToken() 

              */

 		/* String obj  = (String)st.nextElement();
                int i=Integer.parseInt(obj);
		System.out.println(i);

		int j=Integer.parseInt((String)st.nextElement());
		System.out.println(j);
		*/

		System.out.println("Enter character");
		//char A = (char)br.read();
		 char A=br.readLine().charAt(0);
		
		System.out.println("char is"+A);

	}
}

