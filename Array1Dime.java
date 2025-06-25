class Array1Dim{



	 static class Student{

	       String name;
	       int rollNumber;
	       float marks;

	       Student(String name,int rollNumber,float marks){

		       this.name=name;
		       this.rollNumber=rollNumber;
		       this.marks=marks;
	       }
	     public String toString(){
		       return "name: "+name+" rollNumber: "+rollNumber+ "marks: "+marks;
	       }
	}
	public static void main(String args[]){

		//syntax 
	
		int arrInt[]=new int[3]; 
	        char[] arrChar=new char[3];
		short [] arrShort=new short[3];
		float []arrFloat=new float[3];

		String arrString[]={"mangesh","adesh"};
                double arrDouble[]=new double[]{1.2,3.4,24.2};

		//dataTypes used for makin Array
		//1]primitive
		//2]Non-Primitive
		//3]user_defined
		

		//primitive
		byte arrByte[]=new byte[3];

		//non-primitve
		String arrString1[]=new String[3];

		//User Defined 

		Student arrStudent[]=new Student[3];
		Student s1=new Student("mangesh",11,23.44f);
		Student s2=new Student("adesh",12,33.22f);
		arrStudent[0]=s1;
		arrStudent[1]=s2;

		System.out.println(arrStudent[1]);
		/*the above statement calls String toString() method which return memeory refrence if String toString() is not override.*/
	
                                               


               


           /*
		//Wrong Format
		
		[]int arryInt=new int[];
		int arrInt[]=new int[]; Error:array dimension missing 
		int arrInt[]=new int[3]{11,22,33};
            
	    
	    
	    
	   
                System.out.println(arrString[1]);
                System.out.println(arrDouble[1]);
                System.out.println(arrString[1]);
	      
*/

	}


}

