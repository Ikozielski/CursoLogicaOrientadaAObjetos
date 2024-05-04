package ExibindoDadosDeUmPedidoEx03;

public class master {

	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		
		pedido.codigo = 1;
		pedido.subtotal = 50.0;
		pedido.desconto = 10.0;
		//pedido.total = 9.0;
		
		System.out.println("Código: " + pedido.getCodigo() + " Subtotal: " + pedido.getSubtotal() + " Desconto: " + pedido.getDesconto() + " Total: " + pedido.getTotal());
		

	}

}
