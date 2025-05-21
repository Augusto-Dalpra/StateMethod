package StatePedido;

public class pedidoEstadoTransito extends PedidoEstado {
    private pedidoEstadoTransito() {}

    private static final pedidoEstadoTransito instance = new pedidoEstadoTransito();

    public static pedidoEstadoTransito getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Em Transito";
    }


    @Override
    public boolean entregue(Pedido pedido) {
        pedido.setEstado(pedidoEstadoEntregue.getInstance());
        return true;
    }


    @Override
    public boolean preparar(Pedido pedido) {
        return false;
    }

    @Override
    public boolean transito(Pedido pedido) {
        return false;
    }
}
