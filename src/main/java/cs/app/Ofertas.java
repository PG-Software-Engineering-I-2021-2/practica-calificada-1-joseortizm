package cs.app;
import static cs.app.App.logger;

public class Ofertas{
    private final String period;
    private final String area;

    public Ofertas(String period, String area){
        this.period= period;
        this.area = area;
    }


    public Boolean ofertaActiva(String temporada){
        if(this.period == temporada){
            String respuesta = "Si esta en temporada";
            logger.info(respuesta);
            return true;
        }else{
            return false;
        }
    }

    public String getPeriod(){return period;}

    public String getArea(){return area;}

}


