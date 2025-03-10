package fr.ensai.library;

public abstract class Item {
    // Attribute
    protected String title;
    protected int year;
    protected int pageCount;

    // Constructor
    public Item(String title, int year, int pageCount){
        this.title = title;
        this.year = year;
        this.pageCount = pageCount;
    }
}
