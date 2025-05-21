package StatePedido;

public abstract class PedidoEstado {
    public abstract String getEstado();

    public boolean preparar(Pedido pedido){
        return  false;

    }

    public boolean transito(Pedido pedido){
        return false;
    }

    public  boolean entregue(Pedido pedido){
        return  false;
    }


}
