
import java.util.Date;

public class Experiencia {
    
    /* atributos */
    
	private int IdExperiencia;

	private String Posicion;

	private boolean EsActual;

	private Date FechInicio;

	private Date FechFin;

	private String EmprNombre;

	private String EmprImgUrl;

	private String Descripcion;

	/* constructores */

    public Experiencia() {
    }

    public Experiencia(int IdExperiencia, String Posicion, boolean EsActual, Date FechInicio, Date FechFin, String EmprNombre, String EmprImgUrl, String Descripcion) {
        this.IdExperiencia = IdExperiencia;
        this.Posicion = Posicion;
        this.EsActual = EsActual;
        this.FechInicio = FechInicio;
        this.FechFin = FechFin;
        this.EmprNombre = EmprNombre;
        this.EmprImgUrl = EmprImgUrl;
        this.Descripcion = Descripcion;
    }
        
        /* getters y setters */

    public int getIdExperiencia() {
        return IdExperiencia;
    }

    public void setIdExperiencia(int IdExperiencia) {
        this.IdExperiencia = IdExperiencia;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public boolean isEsActual() {
        return EsActual;
    }

    public void setEsActual(boolean EsActual) {
        this.EsActual = EsActual;
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

    public String getEmprNombre() {
        return EmprNombre;
    }

    public void setEmprNombre(String EmprNombre) {
        this.EmprNombre = EmprNombre;
    }

    public String getEmprImgUrl() {
        return EmprImgUrl;
    }

    public void setEmprImgUrl(String EmprImgUrl) {
        this.EmprImgUrl = EmprImgUrl;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    /* metodos propios */

	public boolean UpdateExperiencia(int IdExperiencia, String Posicion, boolean EsActual, Date FechInicio, Date FechFin, String EmprNombre, String EmprImgUrl, String Descripcion) {
		return false;
	}

	public boolean DeleteExperiencia(int IdExperiencia) {
		return false;
	}

}
