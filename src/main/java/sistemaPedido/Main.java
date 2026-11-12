package sistemaPedido;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import sistemaPedido.extension.NotificacionExtensionMail;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    private PedidoService pedidoService;


    @Inject
    private NotificacionExtensionMail notificacionExtensionMail;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {

        System.out.println("\nINICIO_EVALUACIÓN\n");

        Pedido pedido = new Pedido("P001", "Laptop", 1000.00, "VIP");
        Pedido pedido2 = new Pedido("P002", "Mouse", 100.00, "NORMAL");
        Pedido pedido3 = new Pedido("P003", "Teclado", 200.00, "TERCERA EDAD");
       
        pedidoService.enviarPedido(pedido, notificacionExtensionMail);
        pedidoService.enviarPedido(pedido2, notificacionExtensionMail);
        pedidoService.enviarPedido(pedido3, notificacionExtensionMail);

        System.out.println("FIN_EVALUACIÓN\n");

        System.out.println("172219-JS\n");
        return 0;
    }

}
