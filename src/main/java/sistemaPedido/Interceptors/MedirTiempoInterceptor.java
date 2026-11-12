package sistemaPedido.Interceptors;

import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import sistemaPedido.Pedido;

@Interceptor
@MedirTiempo
public class MedirTiempoInterceptor {

    @AroundInvoke
    public Object Interceptar(InvocationContext context) throws Exception {

        Long inicio = System.currentTimeMillis();

        Object resultado = context.proceed();

        Long fin = System.currentTimeMillis() - inicio;

        Object[] valores = context.getParameters();
        Pedido pedido = (Pedido) valores[0];
        System.out.println("DURACIÓN: " + pedido.getCodigo() + " | " + "MS: " + fin);
        System.out.println("TIEMPO: " + pedido.getCodigo() + " | OK\n" );

        return resultado;
    }

}
