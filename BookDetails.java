package Assignment2;

import java.util.ArrayList;

class book{
    int bookId;
    String bookName;
    String authorName;

    book(int newbookId, String newbookName, String newauthorName){
        this.bookId = newbookId;
        this.bookName = newbookName;
        this.authorName = newauthorName;

        }
    public String toString(){
        return "bookId: " + bookId+ "bookName: "+ bookName + "authorName: "+ authorName;

    }
}


public class BookDetails{
    public static void main(String[] args) {
        book obj = new book( 101 ," let us c ", " alok");
        book obj1 = new book(102 ," let us d ", " ak");

        ArrayList<book> list= new ArrayList<>();
        list.add(obj);
        list.add(obj1);

        for (book b :list ) {
            System.out.println(b);
        }
    }
}