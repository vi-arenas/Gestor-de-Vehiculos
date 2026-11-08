public class Moto extends Vehiculo{
    private int cilindrada;

    public Moto(String marca, String modelo, int anio, int cilindrada){
        super(marca, modelo, anio);
        setCilindrada(cilindrada);
    }

    // Setters
    public void setCilindrada(int cilindrada){
        if(cilindrada < 10 || cilindrada > 2500){
            throw new IllegalArgumentException("Error: La cilindrada debe ser mayor o igual a 10 y menor o igual a 2500");
        }
        this.cilindrada = cilindrada;
    }

    // Getters
    public int getCilindrada(){
        return cilindrada;
    }

    // Metodo sobreescrito
    @Override
    public String mostrarDetalles(){
        return String.format("Marca: %s \nModelo: %s \nAño: %d \nCilindrada: %dcc",title(getMarca()),title(getModelo()),getAnio(),getCilindrada());
    }
}
