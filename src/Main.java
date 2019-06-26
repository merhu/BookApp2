import java.lang.Integer;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
//        ArrayList<Integer> books = new ArrayList<Integer> ();

        System.out.println ("");

        Book b1 = new Book ( "Java1001", "Head First Java", "Kathy Sierra and Bert Bates", "Easy to read Java workbook", 47.50, true );
        b1.setPrice ( 47.50 );
        b1.getDisplayText ();
        System.out.println ( "Price: " + "$" + b1.getPrice () );

        Book b2 = new Book ( "Java1002", "Thinking in Java", "Bruce Eckel", "Easy to read Java workbook", 20.00, true );

        b2.getDisplayText ();
        System.out.println ( "Price: " + "$" + b2.getPrice () );
        b2.setPrice ( 20.00 );

        Book b3 = new Book ( "Orcl1003", "OCP: Oracle Certified Professional Java SE", "Jeanne Boyarsky", "Everything you need to know in one place", 45.00, true );

        b3.setPrice ( 45.00 );
        b3.getDisplayText ();
        System.out.println ( "Price: " + "$" + b3.getPrice () );

        Book b4 = new Book ( "Python1004", "Automate the Boring Stuff with Python", "Al Sweigart", "Fun with Python", 10.50, true );

        b4.setPrice ( 10.50 );
        b4.getDisplayText ();
        System.out.println ( "Price: " + "$" + b4.getPrice () );

        Book b5 = new Book ( "Zombie1005", "Guide to the Zombie Apocalypse", "Simon Monk", "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 16.50, true );

        b5.setPrice ( 16.50 );
        b5.getDisplayText ();
        System.out.println ( "Price: " + "$" + b5.getPrice () );
        Book b6 = new Book ( "Rasp1006\t", "Raspberry Pi Projects for the Evil Genius", "Donald Norris", "A dozen fiendishly fun projects for the Raspberry Pi!", 14.75, true );

        b6.setPrice ( 14.75 );
        b6.getDisplayText ();
        System.out.println ( "Price: " + "$" + b6.getPrice () );


        int userInput = 0;
        String answer = "";
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "\n Enter the book Title from listed above: " );
        answer = sc.nextLine ();


        System.out.println ( "\n How many " + answer + " books would you like? \b" );
        userInput = sc.nextInt ();

        boolean InStock = true;
        String book = "";
        if (InStock && userInput < 150) {
            System.out.println ( "\n You're in luck! The book is in stock.\n" );
            //int Total = userInput * unitPrice;
            System.out.println ( "\n Your Total is: " + "$" );

        } else System.out.println ( "Sorry, The book you are looking for is out of stock!" );


    }


}

