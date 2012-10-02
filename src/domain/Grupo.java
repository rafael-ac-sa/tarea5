package universidad.domain;
import java.io.Serializable;

public class Grupo implements Serializable {
	private String numGrup;
	private String idGrup;
	private String siglaGrup;
	private String nombGrup;

	public String getNombGrup() {return nombGrup;}
	public void setNombGrup(String n) {nombGrup=n;}
	
	public String getIdGrup() {return idGrup;}
	public void setIdGrup(String id) {idGrup=id;}
	
	public String getSiglaGrup() {return siglaGrup;}
	public void setSiglaGrup(String sig)  {siglaGrup = sig;}
	
	public String getNumGrup() {return numGrup;}
	public void setNumGrup(String num)  {numGrup = num;}
}