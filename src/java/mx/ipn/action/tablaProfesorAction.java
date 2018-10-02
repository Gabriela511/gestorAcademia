/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.action;

import com.ipn.service.ProfesorService;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.ipn.bean.Profesor;
import org.apache.log4j.Logger;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author gabrielaalejandraperez
 */
public class tablaProfesorAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "tablaProfesores";
    private static final Logger logger = Logger.getLogger(tablaProfesorAction.class);

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
            ProfesorService srv = new ProfesorService();
            List<Profesor> profesores = srv.list();

                if(profesores != null){
                    logger.info("Existen Profesores");
                    System.out.println("si");
                    request.setAttribute("profesorRequest", profesores);
                }else{
                    System.out.println("no");
                    logger.info("NO existen profesores");
                }   
        
        return mapping.findForward(SUCCESS);
    }
}
