package StatePedido;

public class pedidoEstadoEntregue extends  PedidoEstado{
    private pedidoEstadoEntregue(){};
    private static pedidoEstadoEntregue instace=new pedidoEstadoEntregue();
    public static pedidoEstadoEntregue getInstance(){
        return instace;
    }
    public String getEstado(){
        return "Entregue";
    }
}

