package accsessmodifier_package;

public class EBook extends Book {
    private String downloadLink;

    public EBook(String title, String author, String downloadLink,double price) {
        super(title, author,price);
        this.downloadLink = downloadLink;
    }

    public void displayEBookInfo() {
        System.out.println("EBook Details:");
        System.out.println("Title        : " + title);      
        System.out.println("Download Link: " + downloadLink);
        System.out.println("Author       : " + super.getAuthor()); 
    }
}

