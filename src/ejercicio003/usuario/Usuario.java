package ejercicio003.usuario;

public final class Usuario {
	private Integer codigo;
	private String nombre;
	private String apellido;
	private String direccion;
	private String usuario;
	private Integer password;
	
	public Usuario(Integer codigo, String nombre, String apellido, String direccion, String usuario, Integer password) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.usuario = usuario;
		this.password = password;
	}

	public Usuario(Integer codigo) {
		this.codigo = codigo;
	}

	public Usuario() {
	}
	
	private void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Integer getPassword() {
		return password;
	}

	public void setPassword(Integer password) {
		this.password = password;
	}

	public Integer getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion="
				+ direccion + ", usuario=" + usuario + ", password=" + password + "]";
	}
	
	
	
}
