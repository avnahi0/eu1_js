package sistemaPedido;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import sistemaPedido.Interceptors.MedirTiempo;
import sistemaPedido.extension.NotificacionExtension;

@ApplicationScoped
public class PedidoService {

    @Inject
    private DescuentoVIP descuentoVIP;

    @Inject
    private DescuentoTercerEdad descuentoPremium;

    @Inject
    private DescuentoNormal descuentoNormal;

    @MedirTiempo
    public void enviarPedido(Pedido pedido, NotificacionExtension notificacionExtension) {

        if (pedido.getTipoDescuento().equalsIgnoreCase("TERCERA EDAD")) {

            System.out.println("TIPO DE DESCUENTO: " + pedido.getTipoDescuento());
            System.out.println("PEDIDO: " + pedido.getCodigo() + " | " + "TOTAL: " + descuentoPremium.calcularDescuento(pedido));

        }

        if (pedido.getTipoDescuento().equalsIgnoreCase("VIP")) {
            System.out.println("Tipo de descuento: " + pedido.getTipoDescuento());
            System.out.println("Pedido: " + pedido.getCodigo() + " | " + "TOTAL: " + descuentoVIP.calcularDescuento(pedido));

        }

        if (pedido.getTipoDescuento().equalsIgnoreCase("NORMAL")) {
            System.out.println("Tipo de descuento: " + pedido.getTipoDescuento());
            System.out.println("Pedido: " + pedido.getCodigo() + " | " + "TOTAL: " + descuentoNormal.calcularDescuento(pedido));
        }
    }

}
