
import java.util.Date;

public class Estudio {

    /* atributos */
    
	private int IdEducacion;

	private String Titulo;

	private boolean EsActual;

	private Date FechInicio;

	private Date FechFin;

	private String UniNombre;

	private String UniImgUrl;

	private String Descripcion;

	/* constructores */

    public Estudio() {
    }

    public Estudio(int IdEducacion, String Titulo, boolean EsActual, Date FechInicio, Date FechFin, String UniNombre, String UniImgUrl, String Descripcion) {
        this.IdEducacion = IdEducacion;
        this.Titulo = Titulo;
        this.EsActual = EsActual;
        this.FechInicio = FechInicio;
        this.FechFin = FechFin;
        this.UniNombre = UniNombre;
        this.UniImgUrl = UniImgUrl;
        this.Descripcion = Descripcion;
    }
        
    /* getters y setters */

    public int getIdEducacion() {
        return IdEducacion;
    }

    public void setIdEducacion(int IdEducacion) {
        this.IdEducacion = IdEducacion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
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

    public String getUniNombre() {
        return UniNombre;
    }

    public void setUniNombre(String UniNombre) {
        this.UniNombre = UniNombre;
    }

    public String getUniImgUrl() {
        return UniImgUrl;
    }

    public void setUniImgUrl(String UniImgUrl) {
        this.UniImgUrl = UniImgUrl;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    
    /* metodos propios */

	public boolean UpdateEducacion(int IdEducacion, String Titulo, boolean EsActual, Date FechInicio, Date FechFin, String UniNombre, String UniImgUrl, String Descripcion) {
		return false;
	}

	public boolean DeleteEducacion(int IdEducacion) {
		return false;
	}

}
