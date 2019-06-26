//A book database class will contain a method to return a book object.
// We haven't exactly learned how to create a database or read/write to files yet.
// We're going to use the knowledge we already have to create a class.
// Our class will simulate a database and return a populated book object.
// We'll simulate a database by simply using if or switch
// statements to look up a book based on SKU. Later,
// we'll create a database using Oracle that also returns a book object.
//Our book database will contain several book titles and the SKU code to look one up.
public class Book {
    private String SKU = "";
    private String title = "";
    private String author = "";
    private String description = "";
    private double price = 0;
    private boolean isInStock = false;



    public Book(String SKU, String title, String author, String description, double price, boolean isInStock){
        this.SKU = SKU;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;

    }
    public  void setSKU(String SKU){
        this.SKU = SKU;
    }
    public String getSKU(){
       return this.SKU;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public void setIsInStock(boolean isInStock){
        this.isInStock = isInStock;
    }

    public boolean getIsInStock(){
        return this.isInStock;
    }

    public void getDisplayText(){
        System.out.println("SKU: " + this.SKU + " , Author: " + this.author + " , Title: " + this.title + " , Description: " + this.description);
    }

}