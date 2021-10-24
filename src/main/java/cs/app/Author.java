package cs.app;

public class Author {
    String name;
    String birth;

    Author(String name,String birth){
        this.name = name;
        this.birth = birth;
    }

    String getNameA(){
        return name;
    }

    String getBirthA(){
        return birth;
    }

}
