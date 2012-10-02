package universidad.service;
import java.util.ArrayList;
import java.util.List;
import universidad.domain.Grupo;

public class SimpleGrupoManager implements GrupoManager {
 private List<Grupo> grupos;
 public List<Grupo> getGrupos() {
   return grupos;
 }
 public void setGrupos(List<Grupo> grupos) {
   this.grupos = grupos;
 }  
}