
import java.util.Date;

public class Logro {

    /* atributos */
	private int IdLogro;

	private String Titulo;

	private Date Anio;

	private String Lugar;

	private String Sobre;

	/* constructores */

    public Logro() {
    }

    public Logro(int IdLogro, String Titulo, Date Anio, String Lugar, String Sobre) {
        this.IdLogro = IdLogro;
        this.Titulo = Titulo;
        this.Anio = Anio;
        this.Lugar = Lugar;
        this.Sobre = Sobre;
    }
        
        
    /* getters y setters */

    public int getIdLogro() {
        return IdLogro;
    }

    public void setIdLogro(int IdLogro) {
        this.IdLogro = IdLogro;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public Date getAnio() {
        return Anio;
    }

    public void setAnio(Date Anio) {
        this.Anio = Anio;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public String getSobre() {
        return Sobre;
    }

    public void setSobre(String Sobre) {
        this.Sobre = Sobre;
    }
    
    
    /* metodos propios */

	public boolean UpdateLogro(int IdLogro, String Titulo, Date Anio, String Lugar, String Sobre) {
		return false;
	}

	public boolean DeleteLogro(int IdLogro) {
		return false;
	}

}
