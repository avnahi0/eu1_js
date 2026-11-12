package sistemaPedido.extension;

import jakarta.enterprise.context.ApplicationScoped;
import sistemaPedido.Pedido;

@ApplicationScoped
public class NotificacionExtensionMail implements NotificacionExtension{

    @Override
    public void enviarNotificacion(Pedido pedido) {
        System.out.println("NOTIFICACIÓN DE PEDIDO: " + pedido.getCodigo());
    }

}
