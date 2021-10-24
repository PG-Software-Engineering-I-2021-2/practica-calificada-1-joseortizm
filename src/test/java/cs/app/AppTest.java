package cs.app;


import org.testng.Assert;
import org.testng.annotations.Test;

import static cs.app.App.*;

public class AppTest {
    @Test
    public void test01(){
        Libros libroa = new Libros("El quijote", "1980", "Miguel de cervantes");
        //logger.info(libroa.getName());
        Assert.assertEquals(libroa.getName(),"El quijote");

    }

    @Test
    public void test02(){
        Libros librob = new Libros("Mio Cid", "1500", "Anonimo");

        //logger.info(librob.getName());
        Assert.assertEquals(librob.getName(),"Mio Cid");
    }

    @Test
    public void test03(){
        Libros libroc = new Libros("Tres reyes", "1300", "Miguel angel");
        //logger.info(libroc.getName());
        Assert.assertEquals(libroc.getName(),"Tres reyes");
    }

    @Test
    public void test04(){
        Libros librod = new Libros("Divina comedia", "1800", "Ruben dario");
        //logger.info(librod.getYear());
       Assert.assertEquals(librod.getYear(),"1800");
    }

}
