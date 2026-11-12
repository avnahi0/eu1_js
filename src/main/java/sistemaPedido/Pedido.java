package sistemaPedido;


public class Pedido {

    private String codigo;
    private String producto;
    private double valorOriginal;
    private String tipoDescuento;

    public Pedido() {
    }

    public Pedido(String codigo, String producto, double valorOriginal, String tipoDescuento) {
        this.codigo = codigo;
        this.producto = producto;
        this.valorOriginal = valorOriginal;
        this.tipoDescuento = tipoDescuento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getValorOriginal() {
        return valorOriginal;
    }

    public void setValorOriginal(double valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    public String getTipoDescuento() {
        return tipoDescuento;
    }

    public void setTipoDescuento(String tipoDescuento) {
        this.tipoDescuento = tipoDescuento;
    }

}
