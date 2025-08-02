import java.util.Collection;
import java.util.Iterator;
class CollectionDemo{
        public static void main(String args[]){

                ArrayList ar = new ArrayList();

                ar.add("mangesh");
                ar.add(new String("mangesh"));
                ar.add(10);
                ar.add("Adesh");
                ar.add(new Integer(10));
                ar.add(10);
                ar.add("Adesh");

                //Iterator

                //1] boolean hasNext();

                Iterator cursor =ar.iterator();

                // cursor.remove(); java.lang.IllegalStateException;

                while(cursor.hasNext()){
                        System.out.println(cursor.next());
                        ///cursor.remove();
                        //cursor.remove(); java.lang.IllegalStateException
                }
                /* Collection
                 * 1]boolean add(E) //wraping is done internally
                 * 3]Object remove(object); ( by index collection kde nahi) // wrapping not supporting
                 * 4]boolean Contains(object)//wrapping supporting
                 * 5]int size()
                 * 6]boolean isEmpty()
                 * 7]void clear()
                 * 8]Itertor iterator()
                 *
                 * //more than one
                 * 9]boolean addAll(Collection obj)
                 * 10]boolean removeAll(Colletion obj)   System.out.println("In Collection");

                System.out.println("size of ArrayList is - "+ar.size());

                System.out.println("Empty true or false - "+ar.isEmpty());
                System.out.println("ArrayList contains Mangesh - "+ar.contains("Mangesh"));
                System.out.println("ArrayList contains mangesh - "+ar.contains("mangesh"));
                System.out.println("ArrayList contains 10 - "+ar.contains(10));


                System.out.println("ArrayList Adding an Element - "+ar.add(100));
                System.out.println("ArrayList removing an Element by object  - "+ar.remove(new Integer(100)));
                // System.out.println("ArrayList removing an Element by index  - "+ar.remove(int index));


                //more than one

                ArrayList ar1 = new ArrayList();

                ar1.add(10);
                ar1.add("Adesh");


                //ar.add(ar1);//[11,mangesh,343,[10,Adesh]]
                //ar.addAll(ar1);//[11,mangesh,342,10,Adesh]


                System.out.println("ar contains ar1 "+ar.containsAll(ar1));

                System.out.println(ar.removeAll(ar1));






                                                              

                System.out.println(ar);


        }
}
                
