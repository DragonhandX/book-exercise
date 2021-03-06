/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = true;
    }

    // Add the methods here ...
    public void setRefNumber(String ref) // setting the reference number and being picky about it
    {
        refNumber = ref;
        if(refNumber.length() < 3){
            System.out.println("Error: Needs to be at least 3 characters.");
            refNumber = "";
        }
    }
    
    public String getRefNumber() // making sure the reference number is working
    {
        return refNumber;
    }
    
    public void borrow() // action to borrow the book
    {
        borrowed = borrowed + 1;
    }
    
    public int getBorrowed() // returning the current borrowed value
    {
        return borrowed;
    }
    
    public String getAuthor() // seeing the author
    {
        return author;
    }    
    
    public String getTitle() // seeing the title
    {
        return title;
    }
    
    public int getPages() // seeing the page number
    {
        return pages;
    }
    
    public void printAuthor() // printing out the author
    {
        System.out.println(author);
    }
    
    public void printTitle() // printing out the title
    {
        System.out.println(title);
    }
    
    public boolean isCourseText() // returning the preset value
    {
        return courseText;
    }
    
    public void printDetails() // printing out EVERYTHING
    {
        System.out.println("Title:\t" + title + "\nAuthor:\t" + author + "\nPages:\t" + pages);
        if(refNumber.length() < 1)
            System.out.println("ZZZ");
        else
            System.out.println(refNumber);
        System.out.println("This book has been borrowed " + borrowed + " times.");
    }
}
