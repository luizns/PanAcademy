package estaticos.metodos2;

public class Programa {
	
	public static void main(String[] args) {
		
		System.out.println(Produto.resultado(10, 50));
		
		Produto produto = new Produto();
		
		System.out.println(produto.mudeNomeProduto("John"));
		
		System.out.println(Produto.pegarCPF("199.222.333-11"));
	}
}
