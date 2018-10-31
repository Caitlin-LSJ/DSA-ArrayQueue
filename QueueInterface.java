
package Queue;


public interface QueueInterface {
    
    public void add (Object object);        //returns the element at the front of this queue
    public Object first();                  //removes and returns the element at the front of this queue
    public Object remove();                 //Returns the number of elements in this queue;
    public int size();                      //Returns true or false according to whether or not queue is empty
    public boolean isEmpty(); 
    
}
