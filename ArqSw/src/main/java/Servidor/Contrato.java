package Servidor;

import java.util.Objects;

public class Contrato {

	private int id;
	private int idAtivo;
	private int idUtilizador;
	private float preco;
	private float takeProfit;
	private float stopLoss;
	private int quantidade;
	private boolean compra;
	private boolean encerrado;


	public Contrato(int id, int idAtivo, int idUtilizador, float preco, float takeProfit, float stopLess, int quantidade, boolean compra,boolean encerrado) {
		this.id = id;
		this.idAtivo = idAtivo;
		this.idUtilizador = idUtilizador;
		this.preco = preco;
		this.takeProfit = takeProfit;
		this.stopLoss = stopLess;
		this.quantidade = quantidade;
		this.compra = compra;
		this.encerrado = encerrado;
	}

	public Contrato(Contrato p) {
		this.id = p.getId();
		this.idAtivo = p.getIdAtivo();
		this.idUtilizador=p.getIdUtilizador();
		this.preco=p.getPreco();
		this.takeProfit=p.getTakeProfit();
		this.stopLoss=p.getStopLoss();
		this.quantidade = p.getQuantidade();
		this.compra=p.isCompra();
		this.encerrado=p.isEncerrado();
	}

    public Contrato() {
		this.id = 0;
		this.idAtivo = 0;
		this.idUtilizador = 0;
		this.preco = 0;
		this.takeProfit = 0;
		this.stopLoss = 0;
		this.quantidade = 0;
		this.compra = false;
		this.encerrado = false;
    }


    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdAtivo() {
		return idAtivo;
	}

	public void setIdAtivo(int idAtivo) {
		this.idAtivo = idAtivo;
	}

	public int getIdUtilizador() {
		return idUtilizador;
	}

	public void setIdUtilizador(int idUtilizador) {
		this.idUtilizador = idUtilizador;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public float getTakeProfit() {
		return takeProfit;
	}

	public void setTakeProfit(float takeProfit) {
		this.takeProfit = takeProfit;
	}

	public float getStopLoss() {
		return stopLoss;
	}

	public void setStopLoss(float stopLess) {
		this.stopLoss = stopLess;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isCompra() {
		return compra;
	}

	public void setCompra(boolean compra) {
		this.compra = compra;
	}

	public boolean isEncerrado() {
		return encerrado;
	}

	public void setEncerrado(boolean encerrado) {
		this.encerrado = encerrado;
	}

	public Contrato clone(){
		return new Contrato(this);
	}

	@Override
	public String toString() {
		return "Contrato{" +
				"id=" + id +
				", idAtivo=" + idAtivo +
				", idUtilizador=" + idUtilizador +
				", preco=" + preco +
				", takeProfit=" + takeProfit +
				", stopLess=" + stopLoss +
				", quantidade=" + quantidade +
				", compra=" + compra +
				", encerrado=" + encerrado +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Contrato)) return false;
		Contrato contrato = (Contrato) o;
		return getId() == contrato.getId() &&
				getIdAtivo() == contrato.getIdAtivo() &&
				getIdUtilizador() == contrato.getIdUtilizador() &&
				Float.compare(contrato.getPreco(), getPreco()) == 0 &&
				Float.compare(contrato.getTakeProfit(), getTakeProfit()) == 0 &&
				Float.compare(contrato.getStopLoss(), getStopLoss()) == 0 &&
				getQuantidade() == contrato.getQuantidade() &&
				isCompra() == contrato.isCompra() &&
				isEncerrado() == contrato.isEncerrado();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId(), getIdAtivo(), getIdUtilizador(), getPreco(), getTakeProfit(), getStopLoss(), getQuantidade(), isCompra(), isEncerrado());
	}
}