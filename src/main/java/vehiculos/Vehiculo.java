package vehiculos;

public class Vehiculo {
	private static int cantidadVehiculos = 0;
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		cantidadVehiculos += 1;
		this.fabricante.ventas += 1;
		this.fabricante.pais.ventas += 1;
	}
	
	public static void setCantidadVehiculos(int cantidad) {
		cantidadVehiculos = 0;
	}
	
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	
	public static String vehiculosPorTipo() {
		return "Automoviles: " + Automovil.cantidadAutomoviles + "\nCamionetas: " + Camioneta.cantidadCamionetas + "\nCamiones: " + Camion.cantidadCamiones ;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public int getPuertas() {
		return puertas;
	}
	
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setpeso(int peso) {
		this.peso = peso;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	
	public String getTraccion() {
		return traccion;
	}
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}
	
}
