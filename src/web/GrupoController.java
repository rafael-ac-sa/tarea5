package universidad.web;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import universidad.service.GrupoManager;

public class GrupoController implements Controller {
 protected final Log logger = LogFactory.getLog(getClass());
 private GrupoManager GrupoManager;

 public ModelAndView handleRequest(HttpServletRequest request, 
   HttpServletResponse response)
   throws ServletException, IOException {

   String now = (new java.util.Date()).toString();
   logger.info("returning grupo view with " + now);

   Map<String, Object> myModel = new HashMap<String, Object>();
   myModel.put("now", now);
   myModel.put("grupos", this.GrupoManager.getGrupos());

   return new ModelAndView("grupoView", "model", myModel);
 }

 public void setGrupoManager(GrupoManager GrupoManager) {
   this.GrupoManager = GrupoManager;
 }
}