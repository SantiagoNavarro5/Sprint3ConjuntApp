
public class UsuarioAdmin {
    private String NombreUsuario;
    private String email;
    private String Contraseña;
    private String Codigo;
    
    public UsuarioAdmin(String NombreUsuario, String email, String Contraseña, String Codigo){
        this.NombreUsuario = NombreUsuario;
        this.email = email;
        this.Contraseña = Contraseña;
        this.Codigo = Codigo;
    }
    
    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }
    
    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    
}
