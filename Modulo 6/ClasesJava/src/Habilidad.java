public class Habilidad {

    /* atributos */
    
	private int IdHabilidad;

	private String Tipo;

	private String Nombre;

	private String Color;

	private int Valor;

	/* constructores */

    public Habilidad() {
    }

    public Habilidad(int IdHabilidad, String Tipo, String Nombre, String Color, int Valor) {
        this.IdHabilidad = IdHabilidad;
        this.Tipo = Tipo;
        this.Nombre = Nombre;
        this.Color = Color;
        this.Valor = Valor;
    }
        
    /* getters y setters */

    public int getIdHabilidad() {
        return IdHabilidad;
    }

    public void setIdHabilidad(int IdHabilidad) {
        this.IdHabilidad = IdHabilidad;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    /* metodos propios */

	public boolean UpdateHabilidad(int IdHabilidad, String Tipo, String Nombre, String Color, int Valor) {
		return false;
	}

	public boolean DeleteHabilidad(int idHabilidad) {
		return false;
	}

}
