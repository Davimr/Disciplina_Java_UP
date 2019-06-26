package br.edu.noivos.entidade.copy.copy;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "SVC_ENT_NOIVO")
public class Noivo {

	@Id
	@NotNull
	@Column(name = "SCV_ENT_NOIVO_PK")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NUM_SEQ_NOIVO")
	@SequenceGenerator(name = "NUM_SEQ_NOIVO", sequenceName = "NUM_SEQ_NOIVO", allocationSize = 0)
	private Integer id;
	
	@Column(name = "SCV_ENT_NOIVO_NOIVOS")
	private String noivos;
	
	@Column(name = "SCV_ENT_NOIVO_LOCALEVENTO")
	private String localEvento;
	
	@Column(name = "SCV_ENT_NOIVO_LOCALCERIMONIA")
	private String localCerimonia;
	
	@Column(name = "SCV_ENT_NOIVO_DATA")
	private Date data;
	
	@Column(name = "SCV_ENT_NOIVO_TELEFONECONTATO")
	private String telefoneContato;
	
	@Column(name = "SCV_ENT_NOIVO_NCONVIDADOS")
	private String numeroConvidados;
	
	@Column(name = "SCV_ENT_NOIVO_TIPOCONTRATACAO")
	private String tipoContratacao;
	
	@Column(name = "SCV_ENT_NOIVO_VALORCONTRATO")
	private Double valorContrato;
	
	@Column(name = "SCV_ENT_NOIVO_PAGO")
	private Boolean pago;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNoivos() {
		return noivos;
	}

	public void setNoivos(String noivos) {
		this.noivos = noivos;
	}

	public String getLocalEvento() {
		return localEvento;
	}

	public void setLocalEvento(String localEvento) {
		this.localEvento = localEvento;
	}

	public String getLocalCerimonia() {
		return localCerimonia;
	}

	public void setLocalCerimonia(String localCerimonia) {
		this.localCerimonia = localCerimonia;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTelefoneContato() {
		return telefoneContato;
	}

	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}

	public String getNumeroConvidados() {
		return numeroConvidados;
	}

	public void setNumeroConvidados(String numeroConvidados) {
		this.numeroConvidados = numeroConvidados;
	}

	public String getTipoContratacao() {
		return tipoContratacao;
	}

	public void setTipoContratacao(String tipoContratacao) {
		this.tipoContratacao = tipoContratacao;
	}

	public Double getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(Double valorContrato) {
		this.valorContrato = valorContrato;
	}

	public Boolean getPago() {
		return pago;
	}

	public void setPago(Boolean pago) {
		this.pago = pago;
	}
	
	
	
}
