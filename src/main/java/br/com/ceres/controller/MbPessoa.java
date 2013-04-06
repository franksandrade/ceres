package br.com.ceres.controller;

import br.com.ceres.model.dao.HibernateDAO;
import br.com.ceres.model.dao.InterfaceDAO;
import br.com.ceres.model.entities.Epadrao;
import br.com.ceres.model.entities.Epessoa;
import br.com.ceres.util.FacesContextUtil;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "mbPessoa")
@SessionScoped
public class MbPessoa extends Epadrao {

    private static final long serialVersionUID = 1L;
    private Epessoa epessoa = new Epessoa();

    private InterfaceDAO<Epessoa> epessoaDAO() {
        InterfaceDAO<Epessoa> epessoaDAO = new HibernateDAO<Epessoa>(Epessoa.class, FacesContextUtil.getRequestSession());
        return epessoaDAO;
    }

    public String limpPessoa() {
        epessoa = new Epessoa();
        return "/restrict/cadastrarpessoa.faces";
    }

    public String editPessoa() {
        return "/restrict/cadastrarpessoa.faces";
    }

    public String addPessoa() {
        if (epessoa.getId() == null || epessoa.getId() == 0) {
            insertPessoa();
        } else {
            updatePessoa();
        }
        limpPessoa();
        return null;
    }

    private void insertPessoa() {
        epessoaDAO().save(epessoa);
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Gravação Efeturada Com Sucesso", ""));
    }

    private void updatePessoa() {
        epessoaDAO().update(epessoa);
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Atualização Efeturada Com Sucesso", ""));
    }
    
    public void deletePessoa() {
        epessoaDAO().delete(epessoa);
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Excluido Com Sucesso", ""));
    }

    public Epessoa getEpessoa() {
        return epessoa;
    }

    public void setEpessoa(Epessoa epessoa) {
        this.epessoa = epessoa;
    }
    
    
}
