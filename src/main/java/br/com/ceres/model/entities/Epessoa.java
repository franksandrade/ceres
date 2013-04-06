package br.com.ceres.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pes_pessoas")
public class Epessoa extends Epadrao{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column(name = "id_pessoa", nullable = false)
    private Integer id;
    
    @Column(name = "numr_telefone")
    private String telefone;
    
    @Column(name = "numr_celular")
    private String celular;
    
    @Column(name = "desc_email")
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
