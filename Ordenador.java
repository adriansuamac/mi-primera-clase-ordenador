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
    
    
    
    
    
    
    
    
}