package cs.app;

import java.util.logging.Logger;


public class App {
    static final Logger logger = Logger.getLogger(App.class.getName());
    static double combustibleConsumoVehiculo = 0.9;
    static double combustibleConsumoCamion = 1.6;
    static double tanqueCapacidad = 100;


    public static void main(String[] args){
        logger.info("Bienvenido a la App");
    }
}
