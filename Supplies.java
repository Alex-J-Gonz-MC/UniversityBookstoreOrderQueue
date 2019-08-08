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
public class Supplies extends Item{
    private boolean electronic;     //datafield
    
    Supplies(String name, double cost, int quantity,boolean electronic) //constructor 
    {
        super.setName(name);
        super.setCost(cost);
        super.setQuantity(quantity);
        this.electronic = electronic;
    }
    Supplies()  //default constructor
    {
        this("",0.00,0,false);
    }
    void setIsElectronic(boolean electronic)      //mutator
    {
        this.electronic = electronic;
    }
    boolean IsElectronic()      //accessor
    {
        return electronic;
    }
    @Override
    public String getSender()
    {
        return "Amazon Inc. : 2 Empire Blvd, Moonachie, NJ 07074";
    }
    @Override
    public String toString()        //toString Override
    {
        String y_n;
        if(electronic)
            y_n = "Yes";
        else
            y_n = "No";
        return "Name: " + this.getName() +"\nElectronic: "+ y_n 
                + "\nCost: " + this.getCost()+ "\nQuantity: " + this.getQuantity();
    }
    
}
