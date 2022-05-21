package co.com.sofkau.epm.mantenimiento.almacen.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.epm.mantenimiento.almacen.values.AlmacenId;
import co.com.sofkau.epm.mantenimiento.almacen.values.Planilla;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Fecha;
import co.com.sofkau.epm.mantenimiento.almacen.values.Producto;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Estado;
import co.com.sofkau.epm.mantenimiento.valuesgenericos.Observaciones;

public class RealizarPedido extends Command {

    private AlmacenId almacenId;
    private Fecha fecha;
    private Estado estado;
    private Producto producto;
    private Observaciones observaciones;

    public RealizarPedido(AlmacenId almacenId, Fecha fecha, Estado estado, Producto producto, Observaciones observaciones) {
        this.almacenId = almacenId;
        this.fecha = fecha;
        this.estado = estado;
        this.producto = producto;
        this.observaciones = observaciones;
    }

    public AlmacenId getAlmacenId() {
        return almacenId;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public Producto getProducto() {
        return producto;
    }

    public Observaciones getObservaciones() {
        return observaciones;
    }
}
