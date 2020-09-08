package br.com.sis.beans;

import br.com.sis.beans.dao.UsuarioDao;
import br.com.sis.modell.Usuario;
import java.io.Serializable;
import javax.faces.component.behavior.FacesBehavior;
import javax.faces.context.FacesContext;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Named
@ViewScoped
public class UsuarioBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private Usuario usuario;

    public void logar() throws Exception {
        try {
            UsuarioDao userDao = new UsuarioDao();
            Usuario usuarioLogado = userDao.exibir(usuario);

            System.out.println(">>>>>>>>>>>>>>>>Senha: " + usuarioLogado.getSenha());
            //INICIA UMA SESSAO SE NAO HOUVER UMA ABERTA
            HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);

            session.setAttribute("usuarioLogado", usuario);

            FacesContext.getCurrentInstance().getExternalContext().redirect("/exemplo-jsf23/index.xhtml");
        } catch (Exception e) {
                throw  new Exception(e.getMessage());
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
