package br.com.sis.service;

import br.com.sis.modell.Usuario;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class CicloVidaBean implements PhaseListener {

    Usuario user = null;

    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }

    public void beforePhase(PhaseEvent event) {
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();

        String url = request.getRequestURL().toString();
        String uri = request.getRequestURI();

        if (!uri.contains("login.xhtml")) {
            HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
            
            if(session.getAttribute("usuarioLogado")!=null){
                user = (Usuario) session.getAttribute("usuarioLogado");
            }else{
                try {
                    FacesContext.getCurrentInstance().getExternalContext().redirect("/exemplo-jsf23/login.xhtml");
                } catch (IOException ex) {
                    Logger.getLogger(CicloVidaBean.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            
            if(user==null){
                try {
                    FacesContext.getCurrentInstance().getExternalContext().redirect("/exemplo-jsf23/login.xhtml");
                return;
                } catch (IOException ex) {
                    Logger.getLogger(CicloVidaBean.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

    }

    public void afterPhase(PhaseEvent event) {
        System.out.println("FINALIZANDO FASE: " + event.getPhaseId());
    }

}
