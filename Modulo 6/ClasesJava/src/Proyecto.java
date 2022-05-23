
import java.util.Date;

public class Proyecto {

    /* atributos */
    
	private int IdProyecto;

	private String Titulo;

	private String UrlLink;

	private Date FechInicio;

	private Date FechFin;

	private String Sobre;

	/* constructores */

    public Proyecto() {
    }

    public Proyecto(int IdProyecto, String Titulo, String UrlLink, Date FechInicio, Date FechFin, String Sobre) {
        this.IdProyecto = IdProyecto;
        this.Titulo = Titulo;
        this.UrlLink = UrlLink;
        this.FechInicio = FechInicio;
        this.FechFin = FechFin;
        this.Sobre = Sobre;
    }
        
        
    /* getters y setters */

    public int getIdProyecto() {
        return IdProyecto;
    }

    public void setIdProyecto(int IdProyecto) {
        this.IdProyecto = IdProyecto;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getUrlLink() {
        return UrlLink;
    }

    public void setUrlLink(String UrlLink) {
        this.UrlLink = UrlLink;
    }

    public Date getFechInicio() {
        return FechInicio;
    }

    public void setFechInicio(Date FechInicio) {
        this.FechInicio = FechInicio;
    }

    public Date getFechFin() {
        return FechFin;
    }

    public void setFechFin(Date FechFin) {
        this.FechFin = FechFin;
    }

    public String getSobre() {
        return Sobre;
    }

    public void setSobre(String Sobre) {
        this.Sobre = Sobre;
    }
    
    
    /* metodos propios */

	public boolean UpdateProyecto(int IdProyecto, String Titulo, String UrlLink, Date FechInicio, Date FechFin, String Sobre) {
		return false;
	}

	public boolean DeleteProyecto(int IdProyecto) {
		return false;
	}

}
