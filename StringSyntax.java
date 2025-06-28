import java.util.*; 
           class StringSyntax{  
                  public static void main(String args[]){                                                                                                                                                                                                                 char arr[]=new char[]{};                                                                                                char arr1[][]=new char[][]{{'a','b','c'},{'d','e','f'}};                                                                System.out.println(arr1);//address                                                                                      System.out.println(arr1[0]);//abc :character array is internally is a string. when you print the object the String toString() method calls a                                            //nd return string made up of concatiing the all character

                Scanner sc=new Scanner(System.in);


                //Syntax 3 1] string litrals 2] string object 3]char array
                //SCP String constatn pool

                String str1="mangesh" ;//SCP
                System.out.println(System.identityHashCode(str1)); //1000

                String str2="rajesh" ;//SCP
                System.out.println(System.identityHashCode(str2)) ;//2000

                String str3="mangesh" ;//SCP
                System.out.println(System.identityHashCode(str3)); //1000

                String str31=str3 ;//SCP
                System.out.println(System.identityHashCode(str31)); //1000

 String str31=str3 ;//SCP
                System.out.println(System.identityHashCode(str31)); //1000

                String str4=new String("mangesh"); //heap //new
                System.out.println(System.identityHashCode(str4)); //5000

                /*String str5=str1+str2; //heap //opearation
                System.out.println(System.identityHashCode(str5)); //6000

                String str6=str4;//heap //str4 runtime la allocate hotoy
                System.out.println(System.identityHashCode(str6)); //5000

                System.out.println("enter name"); // heap //runtime
                String name =sc.next();
                System.out.println(System.identityHashCode(name)); //7000

                String name1 = name; //heap runtime
                System.out.println(System.identityHashCode(name1)); //7000
                */

                String str7=new String(str4); //heap //new
                System.out.println(System.identityHashCode(str7)); //8000




        }
}
                                              
