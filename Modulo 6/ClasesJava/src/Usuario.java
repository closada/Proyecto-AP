public class Usuario {

    /* atributos */
	private int IdUsuario;

	private String User;
        
        private String Password;
        
        private boolean loginStatus;
        
        private int IdPersona;
        
     /* constructores */

    public Usuario() {
    }

    public Usuario(int IdUsuario, String User, String Password, boolean loginStatus, int IdPersona) {
        this.IdUsuario = IdUsuario;
        this.User = User;
        this.Password = Password;
        this.loginStatus = loginStatus;
        this.IdPersona = IdPersona;
    }
        
    
    /* getters y setters */

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public boolean isLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }

    public int getIdPersona() {
        return IdPersona;
    }

    public void setIdPersona(int IdPersona) {
        this.IdPersona = IdPersona;
    }
    
    /* metodos propios */
    
    public boolean UpdateUsuario(int IdUsuario, String User, String Password, boolean loginStatus, int IdPersona) {
        return false;
    }
    
    public boolean DeleteUsuario (int IdUsuario){
        return false;
    }

}
