package universidad.service;
import java.util.ArrayList;
import java.util.List;
import universidad.domain.Profesor;

public class SimpleProfesorManager implements ProfesorManager {
 private List<Profesor> profesores;
 public List<Profesor> getProfesores() {
   return profesores;
 }
 public void setProfesores(List<Profesor> profesores) {
   this.profesores = profesores;
 }  
}