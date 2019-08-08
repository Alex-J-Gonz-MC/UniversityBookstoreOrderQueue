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
public interface DeliverTo {
    final String ADDRESS = "3900 Waldo Avenue, Bronx, NY 10463";    // all Item objects have the same delivery address
    public abstract String getAddress();        //returns delivery address
    public abstract String getSender();         //returns address of the place being ordered from
}
