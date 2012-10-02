package universidad.service;
import java.io.Serializable;
import java.util.List;

import universidad.domain.Grupo;
public interface GrupoManager extends Serializable{
   public List<Grupo> getGrupos();
}