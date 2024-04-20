package Dispositivo;

import Dispositivo.Dispositivo;

public class Celular extends Dispositivo implements Precio_Descrip{

    //atributos
    private int RAM;
    private String OS;

    //metodos
    public void llamar(){
        System.out.println("Llamando");
    }
    public String mostrarDescripcion(String desc){
        return desc;
    }
    public double calcular_precio(int art, double precio){
        return precio*art;
    }

    //contructores
    public Celular(){}
    public Celular(String nombre, String modelo, int RAM, String OS) {
        setNombre(nombre);
        setModelo(modelo);
        this.RAM = RAM;
        this.OS = OS;
    }

    //get y set
    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo pantalla celular");

    }
}
