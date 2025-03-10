package fr.ensai.library;

public class Magazine extends Item{
    
    // Attribute
    private String issn;
    private String issueNumber;

    // Constructor
    public Magazine(String issn, String title, String issueNumber, int year, int pageCount){
        super(title, year, pageCount);
        this.issn = issn;
        this.issueNumber = issueNumber;
    }

    // Methods 
    public String toString(){
        return "Book " + title + " is the " + issueNumber.toString();
    } 
}
