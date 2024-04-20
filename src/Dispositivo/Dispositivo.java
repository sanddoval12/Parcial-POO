package Dispositivo;

public abstract class Dispositivo {
    //atributos
    private String nombre;
    private String modelo;

    //metodos Abstractos
    public abstract void encender();

    //get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


}
