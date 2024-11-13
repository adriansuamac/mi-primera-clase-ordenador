public class Ordenador{
    private String nombre;
    private int precio;
    private boolean viejo;

    public Ordenador (String nombreDelOrdenador, int elPrecio){
        nombre = nombreDelOrdenador;
        precio = elPrecio;
        viejo = true;
    }

    public String getNombre(){
        return nombre;
    }

    public int getPrecio(){
        return precio;
    }

    public boolean getViejo(){
        return viejo;
    }

    public void setNombre(String nombreDelOrdenador){
        nombre = nombreDelOrdenador;
    }

    public void aumentarPrecio(int elPrecio){
        precio = elPrecio + precio;
    }

    public void cambiarViejo(){
        if(viejo = true){
            viejo = false;
        }
        else{
            viejo = true;
        }           
    }

    public void imprimirEstado(){
        String esViejo;
        if(viejo == true){
            esViejo = "No";  
        }
        else{
            esViejo = "Si";
        }
        System.out.println("El nombre del ordenador es: " + nombre);
        System.out.println("El precio del ordenador es de:  " + precio + " euros");
        System.out.println("¿Este ordenador es viejo?:  " + esViejo);
    }

    public String devolverEstado(){
        String esViejo;
        if(viejo == true){
            esViejo = "No";  
        }
        else{
            esViejo = "Si";
        }
        return "Marca del Ordenador es : " + nombre +  " El precio del ordenador es de : " + precio + "euros" +  " ¿Este ordenador es viejo? " + esViejo;
    }

 
    
}