public class Main {

    private static Motor motor;
    public static void main(String[] args) {

        //Motor comun.
        System.out.println("-------------------------------------------");
        motor = new MotorComun();
        motor.encender();
        motor.acelerar();
        motor.apagar();
        System.out.println("-------------------------------------------");
        //Motor Economico.
        motor = new MotorEconomico();
        motor.encender();
        motor.acelerar();
        motor.apagar();
        System.out.println("-------------------------------------------");
        //Motor Electrico.
        motor = new MotorElectricoAdapter();
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }
}