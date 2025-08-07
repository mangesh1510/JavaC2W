import java.util.Map;
import java.util.HashMap;
class HashMapDemo{
        public static void main(String args[]){

                Map mp = new HashMap();


                System.out.println(mp.put(11,"adesh"));
                System.out.println(mp.put(13,23));
                System.out.println(mp.put(13,23));
                mp.put(12,13);
                System.out.println(mp); //{11=adesh, 12=13, 13=23}


        /*
        System.out.println(mp.remove(11));

              System.out.println(mp); //{12=13, 13=23}

             System.out.println(mp.remove(23));

              System.out.println(mp); //{11=adesh, 12=13, 13=23}


             System.out.println(mp.get(11));
             System.out.println(mp.get(188));
*/


         System.out.println(mp.replace(11,"mangesh"));//adesh
         System.out.println(mp.replace(114,"mangesh"));//null
         System.out.println(mp.replace(11,"mangesh","adesh"));
         System.out.println(mp);

         System.out.println(mp.putIfAbsent(11,"kunal"));//kunal
         System.out.println(mp.putIfAbsent(18,"Virat"));//null
         System.out.println(mp);



         Map mp1 = new HashMap();
         Map mp2 = new HashMap();
         Map mp3 = new HashMap();

         Map mp1 = new HashMap();
         Map mp2 = new HashMap();
         Map mp3 = new HashMap();

         mp1.put(1,"Adesh");
         mp1.put(2,"Mangesh");
         mp2.put(2,"Mangesh");
         mp2.put(1,"Adesh");
         mp3.put(2,"Adesh");
         mp3.put(1,"Mangesh");

         System.out.println(mp1);
         System.out.println(mp2);
         System.out.println(mp3);

         System.out.println(mp1.equals(mp2));//true
         System.out.println(mp1.equals(mp3));//false
         //System.out.println(mp3);
          mp3.clear();


         System.out.println(mp3);





}








}
                                                  
                                                                                                                                                        1,1           Top
