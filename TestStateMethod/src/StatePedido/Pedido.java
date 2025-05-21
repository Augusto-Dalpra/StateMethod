package StatePedido;

public class Pedido {
    private String nome;
    private PedidoEstado estado;
    public Pedido() {
        this.estado = pedidoEstadoPreparando.getInstance();
    }
    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
    }
    public boolean preparando() {
        return estado.preparar(this);
    }
    public boolean transito(){
        return estado.transito(this);
    }
    public boolean entregue(){
        return estado.entregue(this);
    }
    public String getEstado() {
        return estado.getEstado();
    }



}
