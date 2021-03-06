import javax.faces.bean.ManagedBean;

@ManagedBean
public class EstadiaMB {
	private int horas;
	private int desconto;
	private TipoVeiculoEnum tipoVeiculo;

	public double getValorDesconto() {
		if (tipoVeiculo == TipoVeiculoEnum.Segurado) {
			return (getSubTotal() * desconto) / 100;
		} else {
			return 0;
		}

	}

	public double getSubTotal() {
		return 15 + 2 * (horas - 1);
	}

	public double getTotal() {
		return getSubTotal() - desconto;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}

	public TipoVeiculoEnum getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(TipoVeiculoEnum tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
}
