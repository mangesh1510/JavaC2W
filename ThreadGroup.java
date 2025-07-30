import java.lang.Thread;
import java.lang.ThreadGroup;
class MyThreadGroup extends Thread{

        ThreadGroup tg;

        MyThreadGroup(ThreadGroup tg,String name){
                super(tg,name);
                this.tg=tg;

        }

        public void run(){

                System.out.println("in run :");

                System.out.println("in run currentThread :"+Thread.currentThread());

                System.out.println("in run paernt of ThreadGroup: "+tg.getParent().getName());

                System.out.println("ThreadGroup in run method: "+tg.getParent());


                System.out.println("in run active count of threads ThreadGroup: "+tg.activeCount());
                System.out.println("in run active count of threadm Group  ThreadGroup: "+tg.activeGroupCount());





        }



}


class Mangesh extends Thread{

      Mangesh(){
                                                
        Mangesh(ThreadGroup tg, String name){

                super(tg,name);
        }



        public void run(){

                System.out.println("In Mangesh run()");

                System.out.println("in Mangesh: "+Thread.currentThread());


        }
}




class Client{
        public static void main(String args[]){

                ThreadGroup tg=new ThreadGroup("LinkedIn");

                ThreadGroup subtg1=new ThreadGroup(tg,"Student");
                ThreadGroup subtg2=new ThreadGroup(tg,"Recuters");

                ThreadGroup subtg4=new ThreadGroup(subtg1,"Mangesh");

                ThreadGroup subtg5=new ThreadGroup(subtg1,"Adesh");

                ThreadGroup subtg6=new ThreadGroup(subtg2,"Shashi Bagal");

                ThreadGroup subtg7=new ThreadGroup(subtg2,"Sundar Pichai");

            

                MyThreadGroup mt=new MyThreadGroup(tg,"thread1");

                mt.start();

                Mangesh man =new Mangesh(subtg1,"mangesh-Thread");
                man.start();

                Mangesh man1 =new Mangesh();
                man1.start();


                System.out.println(tg.getParent().getName());
                System.out.println(Thread.currentThread().getName());







        }

}
                                   
