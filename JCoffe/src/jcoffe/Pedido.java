package jcoffe;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Pedido {

    private String cliente;
    private ArrayList<Item> itens;
    private double total;
    private double troco;
    private static int comanda = 0;
    private String formaPagamento;

    public Pedido() {
        itens = new ArrayList<>();
        comanda += 1;
    }

    // get e sets
    public static int getComanda() {
        return comanda;
    }
    
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public double getTotal() {
        return total;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    // metodos
    public void calcularTotal() {
        this.getItens().forEach(i -> this.setTotal(this.getTotal() + (i.getCafe().getPreco() * i.getQtd())));
    }

    public boolean pagamento(double valor)
    {
        boolean resu;
        if (valor >= this.getTotal()) {
            JOptionPane.showMessageDialog(null, "Pago com sucesso", "Pagamento", 1);
            resu = true;

            if (this.getFormaPagamento() == "Dinheiro") {
                this.setTroco(valor - this.getTotal());
            }
            if (this.getFormaPagamento() == "Cartão") {
                this.setTroco(0);
            }

            //mostrar comprvante
        } else {
            JOptionPane.showMessageDialog(null, "Valor insuficiente", "Pagamento", 1);
            resu = false;
        }
        return resu;
    }

}
