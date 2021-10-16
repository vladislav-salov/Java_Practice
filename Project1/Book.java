public class Book
{
    private String title;
    private String author;
    public Book()
    {
        System.out.println("I am a notepad.");
    }
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public String toString()
    {
        return this.title + " author " + this.author;
    }

}
