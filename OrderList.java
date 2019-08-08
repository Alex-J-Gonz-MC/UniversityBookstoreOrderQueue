/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstoreresource;
import java.util.List;
/**
 *
 * @author Alex
 */
public class OrderList {
    private Item[] order;
    private int size;
    
    OrderList()     //default constructor
    {
        order = null;
        size = 0;
    }
    
    void add(Item obj)      //push item into the queue from the back
    {
        if(size == 0 || order == null)      //it queue is empty, create new Item
        {
            order = new Item[1];
            order[0] = obj;
            size++;
        }
        else        //push onto and copy queue over to bigger array
        {
            Item[] temp = new Item[size+1];
            for(int i = 0;i < size;i++)
            {
                temp[i] = order[i];
            }
            temp[size] = obj;
            order = temp;
            size++;
            
        }
    }
    
    Item Dequeue()      //dequeue the queue from the front
    {
        if(size == 0 || order == null)  //if queue is empty exit function
        {
            System.out.println("Queue is empty...");
            System.exit(0);
        }
        if(size == 1)   // if queue is 1, point order to null and return last item
        {
            Item temp = order[0];
            order = null;
            size--;
            return temp;
        }
        else        //creates new smaller array and copy rest elements to it from old array
        {
            Item[] temp = new Item[size-1];
            for(int x = 1;x < size;x++)
            {
                temp[x-1] = order[x];
            }
            Item popper = order[0];
            order = temp;
            size--;
            return popper;
        }
    }
    void printQueue()       //prints out Order queue
    {
        System.out.println("-----------------------------\nSystem Order Queue\n-------------------------------------");
        for(int v = 0;v < size;v++)
        {
            System.out.println("----------------");
            System.out.println(order[v].toString());
            System.out.println("Ordered from: " + order[v].getSender());
            System.out.println("Deliver to :" + order[v].getAddress());
        }
    }
    void totalQueueCost()       //calculates total cost of queue
    {
        double total = 0;
        for(int i = 0;i < size;i++)
        {
            total += order[i].totalCost();
        }
        System.out.println("----------------");
        System.out.println("TOTAL QUEUE COST: " + total);
        System.out.println("----------------");
    }
    
}
