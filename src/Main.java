import java.util.Locale;

public class Main {
    public static void main(String[] args){
        Auto auto1 = new Auto("toyota", "yaris", 2006, 4);

        Moto moto1 = new Moto("hyosung", "650gt", 2017, 650);

        System.out.println(auto1.mostrarDetalles());

        System.out.println(moto1.mostrarDetalles());
    }


}
