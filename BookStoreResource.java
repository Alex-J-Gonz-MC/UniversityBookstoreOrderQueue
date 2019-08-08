/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstoreresource;
import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class BookStoreResource {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        OrderList queue = new OrderList();
        
        while(true)
        {
            System.out.println("---------------------------\nMain Menu\n-----------------------------\n");
            System.out.println("1.\tAdd order to the Queue");
            System.out.println("2.\tPop the first order ");
            System.out.println("3.\tPrint the order Queue");
            System.out.println("4.\tExit Program");
            System.out.print("Enter Choice: ");
            
            int choice = input.nextInt();
            switch(choice)
            {
                case 1: push(queue);break;
                case 2: queue.Dequeue();break;
                case 3: queue.printQueue();queue.totalQueueCost();break;
                case 4: System.out.println("Program closing...");System.exit(0);break;
            }
        }
    }
    public static void push(OrderList queue)        //pushes object of user-selected item onto queue
    {
        Scanner in = new Scanner(System.in);
        Item obj;
        int pick;
        System.out.print("Choose the type of item: 1-Clothing 2-Supplies 3-Book 4-Textbook: ");
        pick = in.nextInt();
        switch(pick)        //picks what type of object to do and creates the instances
        {
            case 1: obj = new Clothing(); cloth(obj);break;     
            case 2: obj = new Supplies();supl(obj);break;
            case 3: obj = new Books();book(obj);break;
            case 4: obj = new TextBook();textbook(obj);break;
            default: obj = new Supplies();supl(obj);
        }
        
        queue.add(obj);     //adds object to queue
    }
    
    public static void cloth(Item obj)      //instance of cloth assignment
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter name: ");
        String n = read.nextLine();
        System.out.print("Enter color: ");
        String x = read.nextLine();
        System.out.print("Enter size: ");
        String y = read.nextLine();
        System.out.print("Enter quantity: ");
        int g = read.nextInt();
        System.out.print("Enter cost for 1 unit: ");
        double z = read.nextDouble();
        
        if(obj instanceof Clothing)
        {
            ((Clothing) obj).setSize(y);
            ((Clothing) obj).setName(n);
            ((Clothing) obj).setColor(x);
            ((Clothing) obj).setCost(z);
            ((Clothing) obj).setQuantity(g);
        }
        
    }
    public static void supl(Item obj)    //instance of supplies assignment
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter name: ");
        String n = read.nextLine();
        System.out.print("Is Electronic?(y/n): ");
        boolean t;
        char T = read.nextLine().charAt(0);
        if(T == 'y')
            t=true;
        else
            t=false;
        System.out.print("Enter quantity: ");
        int g = read.nextInt();
        System.out.print("Enter cost for 1 unit: ");
        double z = read.nextDouble();
        
        if(obj instanceof Supplies)
        {
            ((Supplies) obj).setName(n);
            ((Supplies) obj).setIsElectronic(t);
            ((Supplies) obj).setCost(z);
            ((Supplies) obj).setQuantity(g);
        }
    }
    public static void book(Item obj)    //instance of book assignment
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter name: ");
        String n = read.nextLine();
        System.out.print("Enter Author: ");
        String j = read.nextLine();
        System.out.print("Enter Publisher: ");
        String p = read.nextLine();
        System.out.print("Enter Cover: ");
        String c = read.nextLine();
        System.out.print("Enter quantity: ");
        int g = read.nextInt();
        System.out.print("Enter cost for 1 unit: ");
        double z = read.nextDouble();
        
        if(obj instanceof Books)
        {
            ((Books) obj).setName(n);
            ((Books) obj).setAuthor(j);
            ((Books) obj).setPublisher(p);
            ((Books) obj).setCover(c);
            ((Books) obj).setCost(z);
            ((Books) obj).setQuantity(g);
        }
    }
    public static void textbook(Item obj)    //instance of textbook assignment
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter name: ");
        String n = read.nextLine();
        System.out.print("Enter Author: ");
        String j = read.nextLine();
        System.out.print("Enter Publisher: ");
        String p = read.nextLine();
        System.out.print("Enter Cover: ");
        String c = read.nextLine();
        System.out.print("Enter Course: ");
        String k = read.nextLine();
        System.out.print("Enter Professor: ");
        String pro = read.nextLine();
        System.out.print("Enter quantity: ");
        int g = read.nextInt();
        System.out.print("Enter cost for 1 unit: ");
        double z = read.nextDouble();
        
       if(obj instanceof TextBook)
        {
            ((TextBook) obj).setName(n);
            ((TextBook) obj).setAuthor(j);
            ((TextBook) obj).setPublisher(p);
            ((TextBook) obj).setCover(c);
            ((TextBook) obj).setCourse(k);
            ((TextBook) obj).setProfessor(pro);
            ((TextBook) obj).setCost(z);
            ((TextBook) obj).setQuantity(g);
        }
        
    }
    
}
