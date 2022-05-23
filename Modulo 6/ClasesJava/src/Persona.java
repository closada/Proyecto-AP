
import java.util.ArrayList;

public class Persona {
    
    /* atributos */

	private int IdPersona;

	private String Nombre;

	private String Posicion;

	private String Sobre;

	private String imgPerfilUrl;

	private String ImgBannerUrl;
        
        private ArrayList<Estudio> estudios;
        
        private ArrayList<Experiencia> experiencias;
        
        private ArrayList<Habilidad> habilidades;
        
        private ArrayList<Idioma> idiomas;
        
        private ArrayList<Logro> logros;
        
        private ArrayList<Proyecto> proyectos;
        
    /* constructores */

    public Persona(int IdPersona, String Nombre, String Posicion, String Sobre, String imgPerfilUrl, String ImgBannerUrl) {
        this.IdPersona = IdPersona;
        this.Nombre = Nombre;
        this.Posicion = Posicion;
        this.Sobre = Sobre;
        this.imgPerfilUrl = imgPerfilUrl;
        this.ImgBannerUrl = ImgBannerUrl;
        this.estudios = new ArrayList<>();
        this.experiencias = new ArrayList<>();
        this.habilidades = new ArrayList<>();
        this.idiomas = new ArrayList<>();
        this.logros = new ArrayList<>();
        this.proyectos = new ArrayList<>();
    }

    public Persona() {
    }
    
    /* setters y getters */

    public int getIdPersona() {
        return IdPersona;
    }

    public void setIdPersona(int IdPersona) {
        this.IdPersona = IdPersona;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public String getSobre() {
        return Sobre;
    }

    public void setSobre(String Sobre) {
        this.Sobre = Sobre;
    }

    public String getImgPerfilUrl() {
        return imgPerfilUrl;
    }

    public void setImgPerfilUrl(String imgPerfilUrl) {
        this.imgPerfilUrl = imgPerfilUrl;
    }

    public String getImgBannerUrl() {
        return ImgBannerUrl;
    }

    public void setImgBannerUrl(String ImgBannerUrl) {
        this.ImgBannerUrl = ImgBannerUrl;
    }

    public ArrayList<Estudio> getEstudios() {
        return estudios;
    }

    public void setEstudios(ArrayList<Estudio> estudios) {
        this.estudios = estudios;
    }

    public ArrayList<Experiencia> getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(ArrayList<Experiencia> experiencias) {
        this.experiencias = experiencias;
    }

    public ArrayList<Habilidad> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }

    public ArrayList<Idioma> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<Idioma> idiomas) {
        this.idiomas = idiomas;
    }

    public ArrayList<Logro> getLogros() {
        return logros;
    }

    public void setLogros(ArrayList<Logro> logros) {
        this.logros = logros;
    }

    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

/* metodo tostring */

    @Override
    public String toString() {
        return "Persona{" + "IdPersona=" + IdPersona + ", Nombre=" + Nombre + ", Posicion=" + Posicion + ", Sobre=" + Sobre + ", imgPerfilUrl=" + imgPerfilUrl + ", ImgBannerUrl=" + ImgBannerUrl + ", estudios=" + estudios + ", experiencias=" + experiencias + ", habilidades=" + habilidades + ", idiomas=" + idiomas + ", logros=" + logros + ", proyectos=" + proyectos + '}';
    }

    
        
/* metodos propios */	

	public boolean UpdatePersona(int IdPersona, String Nombre, String Posicion, String Sobre, String ImgPerfulUrl, String ImgBannerUrl) {
		return false;
	}

	public boolean DeletePersona(int IdPersona) {
		return false;
	}

}
