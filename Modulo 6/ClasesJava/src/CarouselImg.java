public class CarouselImg {

    /* atributos */
	private int IdCarousel;

	private int IdProyecto;

	private String NombreArchivo;

	private String Ruta;

	/*constructores */

    public CarouselImg() {
    }

    public CarouselImg(int IdCarousel, int IdProyecto, String NombreArchivo, String Ruta) {
        this.IdCarousel = IdCarousel;
        this.IdProyecto = IdProyecto;
        this.NombreArchivo = NombreArchivo;
        this.Ruta = Ruta;
    }
    
    /* getters y setters */
    
    public int getIdCarousel() {
        return IdCarousel;
    }

    public void setIdCarousel(int IdCarousel) {
        this.IdCarousel = IdCarousel;
    }

    public int getIdProyecto() {
        return IdProyecto;
    }

    public void setIdProyecto(int IdProyecto) {
        this.IdProyecto = IdProyecto;
    }

    public String getNombreArchivo() {
        return NombreArchivo;
    }

    public void setNombreArchivo(String NombreArchivo) {
        this.NombreArchivo = NombreArchivo;
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }
        
    /* metodos propios */

	public boolean UpdateCarouselImg(int IdCarousel, int IdProyecto, String NombreArchivo, String Ruta) {
		return false;
	}

	public boolean DeleteCarouselImg(int IdCarousel) {
		return false;
	}

}
