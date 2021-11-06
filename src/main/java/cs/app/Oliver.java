package cs.app;

import java.util.HashMap;
import java.util.Map;

import static cs.app.App.logger;

public class Oliver {
    private static Oliver instance;
    private Map<Integer, Libros> libros = new HashMap<>();
    private Map<Integer, Estudiantes> estudiantes  = new HashMap<>();
    private Map<Integer, Ofertas> ofertas = new HashMap<>();
    private Map<Integer, HashMap<Integer,Boolean>> ofertasEstudiantes = new HashMap<>();

    private Oliver(){

    }
    public void agregarEstudiante(Integer id, String email, Integer phone){
        estudiantes.put(id, new Estudiantes(email, phone));
    }

    public void agregarLibro(Integer id, String name,String year, String  author, Integer stock){
        libros.put(id, new Libros(name,year,author stock));
    }

    public void agregarOferta(Integer id, String period, String area){
        ofertas.put(id, new Ofertas(period,area));
    }

    public boolean ofertaActiva(Integer idOferta){
        String temporada = "primavera";
        return ofertas.get(idOferta).ofertaActiva(temporada);
    }

    public boolean agregarCantidadLibro(Integer idLibro, Integer idOferta, Integer cantidad){
        libros.get(idLibro).addStock(cantidad);
        var estudiantesOferta = ofertasEstudiantes.get(idOferta);
        for (Map.Entry<Integer, Boolean> entry : estudiantesOferta.entrySet()) {
            if(Boolean.TRUE.equals(entry.getValue())) estudiantes.get(entry.getKey()).notification();
        }
        return true;
    }

    public boolean checkDisponibilidadLibro(Integer idLibro, Integer cantidad){
        return libros.get(idLibro).checkStock(cantidad);
    }

    public void reducirCantidadLibro(Integer idLibro, Integer cantidad){
        libros.get(idLibro).reduceStock(cantidad);
    }

    public static Oliver getInstance(){
        if(instance == null){
            instance = new Oliver();
        }
        return instance;
    }

}












//terminar esta clase olvier.java
//actualizar los test