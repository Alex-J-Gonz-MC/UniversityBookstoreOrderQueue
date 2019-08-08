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
public class Clothing extends Item{
    private String color;           //data field
    private String size;
    
    Clothing(String name, double cost, int quantity, String size,String color)      //cosntructor
    {
        super.setName(name);
        super.setCost(cost);
        super.setQuantity(quantity);
        this.size = size;
        this.color = color;
    }
    Clothing()      //default constructor
    {
        this("",0.00,0,"","");
    }
    
    void setSize(String size)   //mutatos and accessors
    {
        this.size = size;
    }
    String getSize()
    {
        return size;
    }
    void setColor(String color)
    {
        this.color = color;
    }
    String getColor()
    {
        return color;
    }
    @Override
    public String getSender()
    {
        return "Under Armour Inc. : 651 Kapowski Rd, Space 1250, Elizabeth, NJ 07201";
    }
    @Override
    public String toString()        //toString Override
    {
        return "Name: " + this.getName() +"\nColor: "+this.getColor()
                + "\nCost: " + this.getCost() + "\nSize: "+ this.getSize()
                + "\nQuantity: " + this.getQuantity();
    }
}
