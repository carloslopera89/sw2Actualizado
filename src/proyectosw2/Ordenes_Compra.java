/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosw2;

/**
 *
 * @author Administrator
 */
public class Ordenes_Compra {
    private int numero_orden;
    private String fechaSalida;
    private String fechaLLegada;
    private String horaSalida;
    private String horaLLegada;
    private String ciudadOrigen;
    private String ciudadDestino;
    private int cantidad;
    private String cliente;
    private String Nombre_producto;
    private String identificacion_cliente;
    private String subtotal;
    
    
            
            
        
    public void generar_orden(int numero_orden, String fechaSalida, String horaSalida , String fechaLLegada, 
            String horaLLegada, String ciudadOrigen, String ciudadDestino, int cantidad, String cliente, 
            String Nombre_producto,String identificacion_cliente, String subtotal ) {
        this.numero_orden = numero_orden;
        this.fechaSalida = fechaSalida;
        this.fechaLLegada = fechaLLegada;
        this.horaSalida = horaSalida;
        this.horaLLegada = horaLLegada;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.cantidad = cantidad;
        this.cliente = cliente;
        this.Nombre_producto = Nombre_producto;
        this.cliente = identificacion_cliente;
        this.Nombre_producto = subtotal;
        
        
        
    }

    public int getNumero_orden() {
        return numero_orden;
    }

    public void setNumero_orden(int numero_orden) {
        this.numero_orden = numero_orden;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaLLegada() {
        return fechaLLegada;
    }

    public void setFechaLLegada(String fechaLLegada) {
        this.fechaLLegada = fechaLLegada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLLegada() {
        return horaLLegada;
    }

    public void setHoraLLegada(String horaLLegada) {
        this.horaLLegada = horaLLegada;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNombre_producto() {
        return Nombre_producto;
    }

    public void setNombre_producto(String Nombre_producto) {
        this.Nombre_producto = Nombre_producto;
    }

    public String getIdentificacion_cliente() {
        return identificacion_cliente;
    }

    public void setIdentificacion_cliente(String identificacion_cliente) {
        this.identificacion_cliente = identificacion_cliente;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }
 
    
}
