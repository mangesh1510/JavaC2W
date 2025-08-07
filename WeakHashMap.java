import java.util.WeakHashMap;
import java.util.HashMap;

class Demo{

        int age;
        String name;

        Demo(int age,String name){
                this.age=age;
                this.name=name;
        }

        public String toString(){
                return "{ "+age+":"+name+" }";
        }

       public void finalize(){
               System.out.println("I ghatli re");
       }


}
class Client{
        public static void main(String args[])throws InterruptedException{

                HashMap hm =new HashMap();

                Demo d1=new Demo(11,"manegsh");
                Demo d2=new Demo(16,"Adesh");
                Demo d3=new Demo(17,"Kunal");

                hm.put(d1,"Demo1");
                hm.put(d2,"Demo2");
                hm.put(d3,"Demo3");

                System.out.println(hm);

                d1=null;
                d2=null;

                System.out.println(hm);

                WeakHashMap ihm = new WeakHashMap();

                System.out.println(hm);

                d1=null;
                d2=null;

                System.out.println(hm);

                WeakHashMap ihm = new WeakHashMap();


                Demo d4=new Demo(11,"manegsh");
                Demo d5=new Demo(16,"Adesh");
                Demo d6=new Demo(17,"Kunal");

                ihm.put(d4,"Demo1");
                ihm.put(d5,"Demo2");
                ihm.put(d6,"Demo3");

                System.out.println(ihm);

                d4=null;
                d5=null;

                System.gc();

                Thread.sleep(5000);
                System.out.println(ihm);




        }
}



                                                       
