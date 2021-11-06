package cs.app;

import java.util.logging.Logger;

public class Estudiantes{
    private static Logger logger = Logger.getLogger(Estudiantes.class.getName());
    private final String email;
    private final Integer phone;

    public Estudiantes(String email, Integer phone){
        this.email = email;
        this.phone = phone;
    }

    public String getEmail(){ return email; }
    public Integer getPhone(){ return phone; }

    public void notification(){
        logger.info("Se le esta notificando por medio de su correo");
    }


}
