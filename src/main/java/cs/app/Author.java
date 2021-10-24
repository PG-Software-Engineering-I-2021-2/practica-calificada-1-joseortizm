package cs.app;

public class Author {
    String name;
    int birth;

    Author(String name,int birth){
        this.name = name;
        this.birth = birth;
    }

    String getNameA(){
        return name;
    }

    int getBirthA(){
        return birth;
    }

}
