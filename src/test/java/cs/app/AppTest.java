package cs.app;


import org.testng.Assert;
import org.testng.annotations.Test;

import static cs.app.App.*;

public class AppTest {
    @Test public void test01(){
        var agenteTest = Oliver.getInstance();

        Author autor = new Author("Somerville","1-1-1956");

        agenteTest.agregarLibro(1, "Software Engineering", "1990", autor.getNameA(), 1);
        agenteTest.agregarLibro(2, "Software Engineering", "2000", autor.getNameA(), 1);
        agenteTest.agregarLibro(3, "Software Engineering", "2021", autor.getNameA(), 1);

        agenteTest.agregarOferta(3, "primavera", "computer science");

        agenteTest.agregarEstudiante(1, "jose", 991295044);
        Assert.assertTrue(agenteTest.checkDisponibilidadLibro(1, 1));
        agenteTest.reducirCantidadLibro(1, 1);

    }
    }
}
