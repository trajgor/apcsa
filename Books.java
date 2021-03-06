
/**
 * A program showcasing the concepts learned in Unit 2. 
 *
 * Tanisha R.
 * October 27, 2020
 */

import java.lang.Math;

public class Books
{
    //declaring instance variables of the Books class
    //instance variables define the atrributes of objects 
    //NOTE: "code" means the book's ISBN number
    private String title, author, genre, code;
    private int pages, chapters;
    private int ratingOne, ratingTwo, ratingThree;
    
    //constructor for objects for Books clas (contains all of the String type attriubutes)
    public Books(String itsTitle, String itsAuthor, String itsCode)
    {
        // initialize instance variables
        title = itsTitle;
        author = itsAuthor;
        code = itsCode;
        
    }
    
    //overloaded constructor for Books class
    public Books(String itsTitle, String itsAuthor, int itsPages, int itsChapters)
    {
        // initialize instance variables
        title = itsTitle;
        author = itsAuthor;
        pages = itsPages;
        chapters = itsChapters;
      
    }
    
    //a method to give the books ratings 
    public static void addRatings(Books one, Books two, Books three, Books four){
        
        //assigning and printing three random ratings for each book 
        
        System.out.println("\nRatings");
        
        //Book 1
        System.out.println("Book 1");
        
        //storing the ratings 
        int ratOneBookOne = (int)(Math.random() * 5 + 1);
        int ratTwoBookOne = (int)(Math.random() * 5 + 1);
        int ratThreeBookOne = (int)(Math.random() * 5 + 1);
        
        //printing the ratings
        System.out.println(" Rating 1: " + ratOneBookOne);
        System.out.println(" Rating 2: " + ratTwoBookOne);
        System.out.println(" Rating 3: " + ratThreeBookOne);
        
        //finding the average of the ratings
        int avgRatBookOne = (ratOneBookOne + ratTwoBookOne + ratThreeBookOne)/3;
    
        //Book 2 
        System.out.println("\nBook 2");
        
        //storing the ratings
        int ratOneBookTwo = (int)(Math.random() * 5 + 1);
        int ratTwoBookTwo = (int)(Math.random() * 5 + 1);
        int ratThreeBookTwo = (int)(Math.random() * 5 + 1);
        
        //printing the ratings
        System.out.println(" Rating 1: " + ratOneBookTwo);
        System.out.println(" Rating 2: " + ratTwoBookTwo);
        System.out.println(" Rating 3: " + ratThreeBookTwo);
        
        //finding the average of the ratings
        int avgRatBookTwo = (ratOneBookTwo + ratTwoBookTwo + ratThreeBookTwo)/3;
        
        //Book3
        System.out.println("\nBook 3");
        
        //storing the ratings
        int ratOneBookThree = (int)(Math.random() * 5 + 1);
        int ratTwoBookThree = (int)(Math.random() * 5 + 1);
        int ratThreeBookThree = (int)(Math.random() * 5 + 1);
        
        //printing the ratings
        System.out.println(" Rating 1: " + ratOneBookThree);
        System.out.println(" Rating 2: " + ratTwoBookThree);
        System.out.println(" Rating 3: " + ratThreeBookThree);
        
        //finding the average of the ratings
        int avgRatBookThree = (ratOneBookThree + ratTwoBookThree + ratThreeBookThree)/3;
       
        //NOTE: not all fields were give/applicable for everybook
        //only the ones given are the ones printed
        //(however the program does check to see if each book has something
        //in a given field)
        
        //printing out the total amount pages in the books 
        System.out.println("\nTotal Number of Pages: " + (one.pages + two.pages + three.pages + four.pages));
        
        //setting the books' titles' as variables for convience (and to prevent NullPointerException)
        String titleOne = one.title;
        String titleTwo = two.title;
        String titleThree = three.title;
        String titleFour = four.title;
        
        //same thing as above except for the length
        int lengthOne = titleOne.length();
        int lengthTwo = titleTwo.length();
        int lengthThree = titleThree.length();
        int lengthFour = titleFour.length();     
       
        //printing out the total amount of characters in the books' titles
        System.out.println("Total Amount of Characters in Titles: " + (lengthOne + lengthTwo + lengthThree + lengthFour));
        
        //printing out the first letter of every author's name     
        System.out.println("First Letter of Each Author: " + one.author.substring(0,1) + two.author.substring(0,1) + three.author.substring(0,1) + four.author.substring(0,1));
        
        //printing out the last letter of each book's title 
        System.out.println("Last Letter of Each Book Title " + titleOne.substring(lengthOne - 1) + titleTwo.substring(lengthTwo - 1) + titleThree.substring(lengthThree - 1) + titleFour.substring(lengthFour - 1));
        
        //printing out the average of the averages of the ratings for the books
        System.out.println("Total Average Rating of All Books: " + ((avgRatBookOne + avgRatBookTwo + avgRatBookThree)/3));
    
    }
    
    //this is my main method
    public static void main (String[] args) {
        
        /** Here we are creaing new objects for the Books class. Books is like the datatype,
         *  and bookOne is the name of the object. The first 2 objects are created using the 
         *  first constructor and the last 2 by the second constructor. 
         */ 
        Books bookOne = new Books("The Darkest Minds", "Alexandra Bracken", "978-1786540508");
        Books bookTwo = new Books("1984", "George Orwell", "978-443434973");
        Books bookThree = new Books("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 832, 35);
        Books bookFour = new Books("The Martian", "Andy Weir", 369, 26);
        
        //printing out the details for each book 
        System.out.println("Book 1");
        System.out.println(" Title: " + bookOne.title + " \n Author: " + bookOne.author + " \n ISBN: " + bookOne.code); 
        
        System.out.println("\nBook 2");
        System.out.println(" Title: " + bookTwo.title + " \n Author: " + bookTwo.author + " \n ISBN: " + bookTwo.code);
        
        System.out.println("\nBook 3");
        System.out.println(" Title: " + bookThree.title + "\n Author: " + bookThree.author + "\n Number of Pages: " + bookThree.pages + "\n Number of Chapters: " + bookThree.chapters);
        
        System.out.println("\nBook 4");
        System.out.println(" Title: " + bookFour.title + "\n Author: " + bookFour.author + "\n Number of Pages: " + bookFour.pages + "\n Number of Chapters: " + bookFour.chapters);
        
        //running the addRatings method
        addRatings(bookOne, bookTwo, bookThree, bookFour);
        
    }
        
        
    }
    
