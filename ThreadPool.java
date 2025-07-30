import java.util.concurrent.*;
class ThreadPoolDemo implements Runnable{

        int i;

        ThreadPoolDemo(int i){
                this.i=i;


        }


        ThreadPoolDemo(){

        }


        public void run(){

           System.out.println("Thread Number "+ i +Thread.currentThread().getName());



        }





}


class Client{

        public static void main(String[] args){

            ExecutorService threadpool = Executors.newCachedThreadPool();
                    ThreadPoolDemo obj=new ThreadPoolDemo(i);
                    threadpool.execute(obj);
            }

        threadpool.shutdown();

        }

}
                  
            for(int i=0;i<100;i++){

                                                          
