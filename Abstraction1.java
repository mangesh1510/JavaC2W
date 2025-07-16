abstract class Rbi{

        final void timeToOpen(){
                System.out.println("9am to 5pm" );
        }
        public abstract void rateOfIntrest();
        //public abstract static void rateOfIntrest(); // nahi chalalt bro

         static void bankName(){

         System.out.println("RBI");

         };
}
abstract class BOM extends Rbi{
public void rateOfIntrest(){
                System.out.println("3.4%");
        }
        void income(){
                System.out.println("2.3cr");
        }


}

//0% abstraction
abstract class Hdfc extends Rbi{
      public void rateOfIntrest(){
                System.out.println("5.6%");
        }
//Method Hidding
     static void bankName(){
              System.out.println("HDFC Jindgi ke Sath bhi Jindi ke Bad bhi");
      }

     void timeToOpen(){
             System.out.println("1 Am to 2 pm");
     }
class HdfcSub extends Hdfc{
        void empSalary(){
                System.out.println("$23.55");
        }
}




class Client{
        public static void main(String args[]){
                /*
                Rbi obj=new BOM();
                obj.rateOfIntrest();
                obj.timeToOpen();
                obj.income();//can not find Symbol
                */

                /*
                 * Hdfc hdfc = new Hdfc( );
                hdfc.rateOfIntrest();
                hdfc.timeToOpen();
                */

                HdfcSub hdfcsub= new HdfcSub();
                hdfcsub.empSalary();
                hdfcsub.rateOfIntrest();
                hdfcsub.timeToOpen();
                hdfcsub.bankName();




        }

}

                                                                                                                                          76,1-8        Bot
                                                                                                                                          4,2-16        Top
