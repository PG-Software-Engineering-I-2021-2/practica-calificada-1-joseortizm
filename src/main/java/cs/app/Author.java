package cs.app;

public class Author {
    private final String name;
     private final String birth;

    public Author(String name,String birth){
        this.name = name;
        this.birth = birth;
    }

    public String getNameA(){
        return name;
    }

    public String getBirthA(){
        return birth;
    }

}
