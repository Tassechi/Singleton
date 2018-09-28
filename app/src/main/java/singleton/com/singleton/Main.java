package singleton.com.singleton;

public class Main {
    public static void main(String[] args){

        Logger logger = Logger.getInstance();
        Logger logger1 = Logger.getInstance();

        logger.setValue("mensaje");
        System.out.println(logger1.getValue());


    }
}
