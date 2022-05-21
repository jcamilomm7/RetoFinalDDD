package co.com.sofkau.epm.mantenimiento.almacen;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.epm.mantenimiento.almacen.events.AlmacenCreado;
import co.com.sofkau.epm.mantenimiento.almacen.events.InventarioAgregado;
import co.com.sofkau.epm.mantenimiento.almacen.events.PedidoRealizado;
import co.com.sofkau.epm.mantenimiento.almacen.events.ProveedorAgregado;
import co.com.sofkau.epm.mantenimiento.taller.events.TallerCreado;
import co.com.sofkau.epm.mantenimiento.zonaservicio.OrdenServicio;
import co.com.sofkau.epm.mantenimiento.zonaservicio.events.OrdenServicioAgregada;

import java.util.HashSet;
import java.util.Set;

public class AlmacenEventChange extends EventChange {

    public AlmacenEventChange(Almacen almacen) {

        apply((AlmacenCreado event) -> {
            almacen.pedido = new HashSet<>();
            almacen.proveedor = new HashSet<>();
            almacen.inventario = new HashSet<>();
            almacen.telefono = event.getTelefono();//Objeto valor
        });



        /*apply((InventarioAgregado event)->{
            var inventarioId = event.getInventarioId();
            var inventario =new Inventario(inventarioId, event.getObservaciones(),event.getPlanilla());
            almacen.inventario = (Set<Inventario>) inventario;
        });

        apply((ProveedorAgregado event)->{
            var proveedorId = event.getProveedorId();
            var proveedor =new Proveedor(proveedorId, event.getNombre(), event.getTelefono(), event.getDireccion());
            almacen.proveedor = (Set<Proveedor>) proveedor;
        });

        apply((PedidoRealizado event)->{
            var pedidoId = event.getPedidoId();
            var pedido =new Pedido(pedidoId, event.getFecha(),event.getEstado(),event.getProducto(),event.getObservaciones());
            almacen.pedido = (Set<Pedido>) pedido;
        });*/
    }
}
