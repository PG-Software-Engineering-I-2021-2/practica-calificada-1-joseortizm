package cs.app;

public class Libros {
    private final String name;
    private final String year;
    private final String  author;
    private Integer stock;

    public Libros(String name,String year, String  author, Integer stock){
        this.name = name;
        this.year = year;
        this.author = author;
        this.stock = stock;
    }

    public String getName(){
    return name;
    }

    public String getYear(){
        return year;
    }

    public String getAuthor(){
        return author;
    }

    public Integer getStock() {return stock;}

    public Integer addStock(Integer stock){
        this.stock = this.stock + stock;
        return this.stock;
    }

    public Integer reduceStock(Integer stock){
        this.stock = this.stock - stock; //ver si es posible agregar if
        return this.stock;
    }

    public Boolean checkStock(Integer stock){
        int status;
        status = this.stock - stock;
        if(status >= 0){
            return true;
        }else{
            return false;
        }
    }


}









