public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int anio, int cantidadPuertas){
        super(marca, modelo, anio);
        setCantidadPuertas(cantidadPuertas);
    }

    // Setters
    public void setCantidadPuertas(int cantidadPuertas){
        if(cantidadPuertas < 2 || cantidadPuertas > 4){
            throw new IllegalArgumentException("Error: La cantidad de puertas debe ser mayor a cero y no superior a 4");
        }
        this.cantidadPuertas = cantidadPuertas;
    }

    // Getters
    public int getCantidadPuertas(){
        return cantidadPuertas;
    }

    // Metodo sobreescrito
    @Override
    public String mostrarDetalles(){
        return String.format("Marca: %s \nModelo: %s\nAño: %d \nCantidad de Puertas: %d\n",title(getMarca()),title(getModelo()),getAnio(),getCantidadPuertas());
    }
}
