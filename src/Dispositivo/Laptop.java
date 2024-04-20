package Dispositivo;

import Dispositivo.Dispositivo;
public class Laptop extends Dispositivo implements Precio_Descrip{
    //atributos
    private String tGrafica;
    private int capAl;

    //metodos
    public void jugar(){
        System.out.println("Jugando Fornite");
    }
    public String mostrarDescripcion(String desc){
        return desc;
    }
    public double calcular_precio(int art, double precio){
        return precio*art;
    }

    //constructores
    public Laptop(){}
    public Laptop(String nombre, String modelo, String tGrafica, int capAl) {
        setNombre(nombre);
        setModelo(modelo);
        this.tGrafica = tGrafica;
        this.capAl = capAl;
    }

    //get y set

    public String getTGrafica() {
        return tGrafica;
    }

    public void setTGrafica(String tGrafica) {
        this.tGrafica = tGrafica;
    }

    public int getCapAl() {
        return capAl;
    }

    public void setCapAl(int capAl) {
        capAl = capAl;
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo pantalla laptop");

    }
}
