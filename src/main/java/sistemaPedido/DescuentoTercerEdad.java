package sistemaPedido;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped
@Named("tercera_edad")
public class DescuentoTercerEdad implements IDescuento {

    @Override
    public double calcularDescuento(Pedido pedido) {

        double descuetoVIP = 0.15;
        return pedido.getValorOriginal() - (pedido.getValorOriginal() * descuetoVIP);

    }

}
