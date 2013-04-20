package br.com.ceres.model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "pes_pessoafisica")
@ForeignKey(name = "id_pessoa")
public class EpessoaFisica implements Serializable{
        
        @Id
        @Column(name = "id_pesoa", nullable = false)
	private Integer id;
    
        @Column(name = "desc_nome")
	private String nome;

	@Column(name = "desc_sobrenome")
	private String sobrenome;

	@Column(name = "desc_sexo")
	private String sexo;

	@Column(name = "numr_cpf")
	private String cpf;

	@Column(name = "numr_rg")
	private String rg;

	@Column(name = "desc_orgaoemissor")
	private String orgaoEmissor;

        @Column(name = "data_nascimento")
        @Temporal(TemporalType.TIMESTAMP)
	private Date dataNascimneto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public Date getDataNascimneto() {
        return dataNascimneto;
    }

    public void setDataNascimneto(Date dataNascimneto) {
        this.dataNascimneto = dataNascimneto;
    }
    
    
    
}
