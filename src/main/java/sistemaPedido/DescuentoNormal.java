package sistemaPedido;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped
@Named("normal")
public class DescuentoNormal implements IDescuento {

    @Override
    public double calcularDescuento(Pedido pedido) {

        return pedido.getValorOriginal();

    }
}
