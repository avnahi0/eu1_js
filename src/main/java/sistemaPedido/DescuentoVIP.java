package sistemaPedido;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped
@Named("vip")
public class DescuentoVIP implements IDescuento {

    @Override
    public double calcularDescuento(Pedido pedido) {

        double descuetoVIP = 0.10;
        return pedido.getValorOriginal() - (pedido.getValorOriginal() * descuetoVIP);

    }

}
