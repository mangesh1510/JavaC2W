//methoiid hidding


class Parent {

        static float marks;
        int age =10;
        static float salary=34.45f;

        void run(){
                System.out.println("in non static run- Parent");
        }
        static void fun(){
                System.out.println("in static fun-parent");
        }
        final void gun(){
                System.out.println("in final gun-parent");
        }
        private void learn(){
                System.out.println("in private learn-parent");
        }
}
/*
 * 1]all methods are inherit but on Overriding there are some Condition.



*/

class Child extends Parent{


        void run(){
                age=11;
                salary=12;
                marks=13;
                System.out.println("age is "+age);
                System.out.println("salary is "+Parent.salary);
                System.out.println("marks is "+marks);

   System.out.println("in non static run-Child");
                salary=100;


        } //Overrids SucssesFullly

         void run1(){
                System.out.println(age);
        }


        /*
         *static method(Class Methods) overrides hot nahit.class purti marydit
          jr krycha try kel tr error yete:overriden method is static
         void fun(){
                System.out.println("In static fun-Child");
        }

        */

        static void fun(){
                marks=34;
                System.out.println("in static fun-child");
        }
        //does not overrides.fun method in parent is hides in child and this method is completly new for Child

        /*
         * final methods overrides hot nahit only inherit hotat.
        void gun(){
                System.out.println("in gun");
        }

        */


}

class Client{
        public static void main(String args[]){

                  Child obj=new Child();
                  obj.run();
                  obj.run1();
                  obj.fun();
                  obj.gun();




/*              Parent p=new Child();
                p.run();//non static method overide hote

                p.gun();//final inherit done but cant override.
                System.out.println(p.age);
                System.out.println(p.salary);

              //obj.learn();//can not find Symbol

                /*
                Parent p=new Parent();
                p.learn();//learn() has private access in parent.
               */
        }
}
                                                                                                                          2,1           Top
