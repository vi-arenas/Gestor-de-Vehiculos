public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo(String marca, String modelo, int anio){
        setMarca(marca);
        setModelo(modelo);
        setAnio(anio);
    }

    // Setters
    public void setMarca(String marca){
        if(marca == null || marca.trim().isEmpty()){
            throw new IllegalArgumentException("Error: La marca no puede ser nula ni estar vacia");
        }
        this.marca = marca;
    }

    public void setModelo(String modelo){
        if(modelo == null || modelo.trim().isEmpty()){
            throw new IllegalArgumentException("Error: La marca no puede ser nula ni estar vacia");
        }
        this.modelo = modelo;
    }

    public void setAnio(int anio){
        if(anio < 1900 || anio > 2030){
            throw new IllegalArgumentException("Error: El año no puede ser menor a 1900 ni ser mayor a 2030");
        }
        this.anio = anio;
    }

    // Getters
    public String getMarca(){return marca;}

    public String getModelo(){return modelo;}

    public int getAnio(){return anio;}

    // Metodos
    public String mostrarDetalles(){
        return String.format("Marca: %s \n Modelo: %s \n año: %d\n",title(getMarca()),title(getModelo()),getAnio());
    }

    // Metodo title
    protected static String title(String texto){
        if(texto == null || texto.isBlank()){
            return texto;
        }

        String[] palabras = texto.trim().split("\\s+");
        StringBuilder resultado = new StringBuilder();

        for (String palabra : palabras){
            resultado.append(Character.toUpperCase(palabra.charAt(0)))
                    .append(palabra.substring(1).toLowerCase())
                    .append(" ");
        }
        return resultado.toString().trim();
    }
}
