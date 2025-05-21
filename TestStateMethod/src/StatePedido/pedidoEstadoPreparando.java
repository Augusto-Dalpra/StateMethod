package StatePedido;

public class pedidoEstadoPreparando extends PedidoEstado {
    private  pedidoEstadoPreparando(){};
    private static pedidoEstadoPreparando instance = new pedidoEstadoPreparando();
    public  static pedidoEstadoPreparando getInstance(){
        return instance;
    }
    public  String getEstado(){
        return "Preparando";
    }
    public boolean transito(Pedido pedido){
        pedido.setEstado(pedidoEstadoTransito.getInstance());
        return true;
    }
    public boolean entregue(Pedido pedido){
        pedido.setEstado(pedidoEstadoEntregue.getInstance());
        return true;

    }

}
