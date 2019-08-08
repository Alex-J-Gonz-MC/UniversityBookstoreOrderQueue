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
public class TextBook extends Books {
    private String course;      //data fields
    private String professor;
    
    TextBook(String name, double cost, int quantity,String author,String publisher,String cover,String course,String professor)     //constructor
    {
        super.setName(name);
        super.setCost(cost);
        super.setQuantity(quantity);
        super.setAuthor(author);
        super.setPublisher( publisher);
        super.setCover(cover);
        this.course = course;
        this.professor = professor;
    }
    TextBook()      //default constructor
    {
        this("",0.00,0,"","","","","");
    }
    void setCourse(String course)   //mutators and accessors
    {
        this.course = course;
    }
    void setProfessor(String professor)
    {
        this.professor = professor;
    }
    String getCourse()
    {
        return course;
    }
    String getProfessor()
    {
        return professor;
    }
    
    @Override
    public String toString()        //toString Override
    {
        return "Name: " + this.getName() +"\nAuthor: "+this.getAuthor()
                + "\nPublisher: " + this.getPublisher() +"\nCover: " + this.getCover()
                + "\nCourse: " + this.getCourse() + "\nProfessor: " + this.getProfessor() + 
                "\nCost: " + this.getCost()+ "\nQuantity: " + this.getQuantity();
    }
    
}
