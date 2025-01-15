public class Main {
    public static void main(String[] args) {
        ServicoCancelamentoPedido servicoCancelamentoPedido = new ServicoCancelamentoPedido();

        Pedido pedido = new Pedido();
        pedido.setNomeCliente("João da Silva");
        pedido.setValorTotal(90);

//        servicoCancelamentoPedido.cancelar(pedido,true);
        servicoCancelamentoPedido.cancelar(pedido,TipoUsuario.CLIENTE);
    }

}