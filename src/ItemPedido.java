
public class ItemPedido {

    private Produto produto;
    private int quantidade;


    public ItemPedido(Produto produto){
        this.produto = produto;
        this.quantidade = 1;

    }

    public ItemPedido(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;

    }

    public Produto getProduto(){
        return this.produto;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public double TotalPorItem(){

        return this.quantidade*this.produto.getValor();

    }


}
