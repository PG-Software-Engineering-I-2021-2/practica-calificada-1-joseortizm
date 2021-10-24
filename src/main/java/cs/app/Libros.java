package cs.app;

public class Libros {
    String name;
    int year;
    String  author;

    public Libros(String name,int year, String  author){
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public String getName(){
    return name;
    }

    public int getYear(){
        return year;
    }

    public String getAuthor(){
        return author;
    }


}
