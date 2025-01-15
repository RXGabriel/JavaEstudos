public class ServicoCancelamentoPedido {
    public void cancelar(Pedido pedido, TipoUsuario tipoUsuario){
        pedido.cancelar();

        if (TipoUsuario.CLIENTE.equals(tipoUsuario)){
            System.out.println("Notificando gerrente sobre cancelamento do pedido");
        }
    }
}
