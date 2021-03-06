package proyectodepoo1par;

//Declaracion de la clase

/**
 * Clase Rol
 * @author Araujo Steven
 * @author Banchon Melanie
 * @author Guerrero Darly
 * @version 02/12/17
 */
public abstract class Rol {
    /**
     * Metodo TipoMago: devuelve el tipo de mago 
     * @return tipo de mago
     *         o null en caso de que no se asigne ningun valor 
     */
    public abstract Object TipoMago();
    
    //Declaracion de atributos
    
    /**
     * variable privada: Almancenara  usuario
     */
    private String usuario;
    
    
    /**
     * variable privada: Almancenara la contraseña del usuario
     */
    private String contraseña;
    
   
    /**
     * variable privada: Almancenara el nombre del usuario
     */
    private String nombre;
    
    /**
     * variable privada: Almancenara el apellido del usuario
     */
    private String apellido;
    
    /**
     * variable privada: Almancenara el rol del usuario ya sea  Estudiante o 
     * Hechicero Planificador
     */
    private String rol; 

    
    //Declaracion de contructores
    
    /**
     * Constructor Rol
     * @param usuario almacena el  usuario
     * @param contraseña almacena la contraseña del usuario
     * @param nombre almacena el nombre del usuario
     * @param apellido almacena el apellido del usuario
     * @param rol almacena el rol del usuario
     */
    public Rol(String usuario, String contraseña, String nombre, String apellido, String rol) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
    }

    /**
     * Constructor Rol
     * @param nombre almacena el nombre del usuario
     * @param apellido almacena el apellido del usuario
     */
    public Rol(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    /**
     * Constructor Rol
     * @param usuario almacena el  usuario
     */
    public Rol(String usuario) {
        this.usuario = usuario;
        
    }
    
    
    //Declaracion de metodos
   
    /**
     * Metodo getUsuario: devuelve el usuario
     * @return usuario 
     */
    public String getUsuario() {
        return usuario;
    }

     /**
     * Metodo setUsuario: establece el usuario a la variable del contructor
     * @param usuario almacena el  usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Metodo getContraseña: devuelve la contraseña
     * @return contraseña 
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Metodo setContraseña: establece la contraseña del usuario a la variable 
     * del contructor
     * @param contraseña almacena la contraseña del usuario
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * Metodo getNombre: devuelve el nombre del usuario
     * @return nombre 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo setNombre: establece el nombre del usuario a la variable del 
     * contructor
     * @param nombre almacena el nombre del usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo getApellido: devuelve el apellido del usuario
     * @return apellido 
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Metodo setApellido: establece el apellido del usuario a la variable del 
     * contructor
     * @param apellido almacena el apellido del usuario
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Metodo getRol: devuelve el rol del usuario
     * @return rol 
     */
    public String getRol() {
        return rol;
    }

    /**
     * Metodo setRol: establece el rol del usuario a la variable del 
     * contructor
     * @param rol almacena el rol del usuario
     */
    public void setRol(String rol) {
        this.rol = rol;
    }
}
