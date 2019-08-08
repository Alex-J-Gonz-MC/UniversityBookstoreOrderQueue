/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstoreresource;

/**
 *
 * @author Alex
 */
public class Books extends Item{
    private String author;
    private String publisher;   //data fields
    private String cover;
    
    Books(String name, double cost, int quantity,String author,String publisher,String cover)   // constructor
    {
        super.setName(name);
        super.setCost(cost);
        super.setQuantity(quantity);
        this.author = author;
        this.publisher = publisher;
        this.cover = cover;
    }
    Books()             //default constructor
    {
        this("",0.00,0,"","","");
    }
    void setAuthor(String author)       //mutators
    {
        this.author = author;
    }
    void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }
    void setCover(String cover)
    {
        this.cover = cover;
    }
    String getAuthor()      //accessors
    {
        return author;
    }
    String getPublisher()
    {
        return publisher;
    }
    String getCover()
    {
        return cover;
    }
    @Override
    public String getSender()
    {
        return "Barnes & Noble Co. : 1 Barnes and Noble Way, Monroe Township, NJ 08831";
    }
    @Override
    public String toString()        //toString Override
    {
        return "Name: " + this.getName() +"\nAuthor: "+this.getAuthor()
                + "\nPublisher: " + this.getPublisher() +"\nCover: " + this.getCover()
                + "\nCost: " + this.getCost()+ "\nQuantity: " + this.getQuantity();
    }
}
