import java.util.LinkedList;
import java.util.List;

public class Pedido {

        private List<ItemPedido> itens = new LinkedList<ItemPedido>();


        public void addProduto(Produto produto){

            this.itens.add(new ItemPedido(produto));

        }

        public void addProduto(Produto produto, int quant){

            if(quant <= 0 ){
                throw new RuntimeException("a quantidade deve ser maior que zero");
            }

            for(int i = 0; i < quant; ++i){

                this.itens.add(new ItemPedido(produto));
            }

        }

        public int quantProdutos(){

            return itens.size();

        }

        public List<ItemPedido> getItens(){
            return itens;
        }

        public double getTotal(){

            double soma = 0;
            for(ItemPedido item: this.itens){
                double pedido = item.TotalPorItem();
                soma += pedido;
            }
            return soma;
        }
}
