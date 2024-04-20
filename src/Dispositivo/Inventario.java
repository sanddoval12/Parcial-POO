package Dispositivo;

import java.util.ArrayList;

class Inventario {
    private ArrayList<Dispositivo> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Dispositivo producto) {
        productos.add(producto);
    }

    public void actualizarPrecio(String nombreProducto, String nuevoModelo) {
        for (Dispositivo producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                producto.setModelo(nuevoModelo);
                System.out.println("Modelo actualizado");
                return;
            }
        }
        System.out.println("El dispositivo no se encontró en el inventario");
    }
}