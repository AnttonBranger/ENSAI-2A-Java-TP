package fr.ensai.library;

public class Main {

    public static void main(String[] args) {

        Library mLibrary = new ;

        Book fellowshipOfTheRing = new Book(
                "978-0-618-26025-6",
                "The Fellowship of the Ring",
                tolkien,
                1954,
                423);

        System.out.println(fellowshipOfTheRing.toString());
    }
}