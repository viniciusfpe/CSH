package br.com.csh.model.bean;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TipoTelefone")
public class TipoTelefoneBean extends GenericBean {
	private static final long serialVersionUID = 1L;

	@Column(nullable = false, length = 50)
	private String descricao;
	
	@OneToMany(mappedBy="tipoTelefone")
	private Collection<TelefoneBean> telefones;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Collection<TelefoneBean> getTelefones() {
		return telefones;
	}
	public void setTelefones(Collection<TelefoneBean> telefones) {
		this.telefones = telefones;
	}

	
	
}
