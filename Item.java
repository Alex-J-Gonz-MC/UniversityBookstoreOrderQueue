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
public abstract class Item implements DeliverTo{        //implements DeliverTo to all subclasses
    private String name;        //data fields
    private double cost;
    private int quantity;
    Item(String name, double cost,int quantity)         //constructor
    {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }
    Item()      //default constructor
    {
        this("",0.00,0);
    }
    void setName(String name)       //mutators
    {
        this.name = name;
    }
    void setCost(double cost)
    {
        this.cost = cost;
    }
    void setQuantity( int quantity)
    {
        this.quantity = quantity;
    }
    String getName()        //accessors
    {
        return name;
    }
    double getCost()
    {
        return cost;
    }
    int getQuantity()
    {
        return quantity;
    }
    double totalCost()      //calculates total cost of Iem order
    {
        return quantity*cost;
    }
    @Override
    public String getAddress()
    {
        return this.ADDRESS;
    }
    @Override
    public abstract String toString();
    
}
