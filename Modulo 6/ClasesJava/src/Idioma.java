public class Idioma {

    /* atributos */
	private int IdIdioma;

	private int Nivel;

	private String Sobre;

	private String Nombre;

	
        /* constructores */

    public Idioma() {
    }

    public Idioma(int IdIdioma, int Nivel, String Sobre, String Nombre) {
        this.IdIdioma = IdIdioma;
        this.Nivel = Nivel;
        this.Sobre = Sobre;
        this.Nombre = Nombre;
    }
        
        /* getters y setters */

    public int getIdIdioma() {
        return IdIdioma;
    }

    public void setIdIdioma(int IdIdioma) {
        this.IdIdioma = IdIdioma;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }

    public String getSobre() {
        return Sobre;
    }

    public void setSobre(String Sobre) {
        this.Sobre = Sobre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    /* metodos propios */

	public boolean UpdateIdioma(int IdIdioma, int Nivel, String Sobre, String Nombre) {
		return false;
	}

	public boolean DeleteIdioma(int IdIdioma) {
		return false;
	}

}
