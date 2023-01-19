
package jcoffe;


public class Item {
    private Cafe produto;
    private int qtd;

    public Cafe getCafe() {
        return produto;
    }

    public void setCafe(Cafe p) {
        this.produto = p;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
   public Item(){}
    public Item(Cafe prod, int qtd) {
        this.setCafe(prod);
        this.setQtd(qtd);
    }
    



    
}
