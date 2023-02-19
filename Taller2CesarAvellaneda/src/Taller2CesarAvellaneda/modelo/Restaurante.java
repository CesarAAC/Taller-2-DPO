package Taller2CesarAvellaneda.modelo;

import java.io.File;

import java.util.ArrayList;
import java.util.List;

public class Restaurante 
{
	//-- ATRIBUTOS --//
	
	//Nombre del restaurante//
	
	private String nombre;
	
	//Lista con los pedidos en curso, va a servir como una cola//
	
	private List<Pedido> pedidos;
	
	//Array list, con los nombres de los productos y la cantidad de existencias de este//
	
	private ArrayList<Ingrediente> ingredientes;
	
	//Array List, con los productos del menu//
	
	private ArrayList<ProductoMenu> menu;
	
	//Array list, con los combos del menu//
	
	private List<Combo> combos;
	
	
	//-- CONSTRUCTOR --//
	
	public Restaurante(String nombre)
	{ this.nombre= nombre;
		ingredientes= new ArrayList<Ingrediente>();
		pedidos= new ArrayList<Pedido>();
		menu= new ArrayList<ProductoMenu>();
		combos= new ArrayList<Combo>();}
	
	//-- GETTERS --//
	
	// Consultar el nombre del restaurante//
	
	public String nombreRestaurante()
	{
		return nombre;
	}
	
	//-- SETTERS--//
	
	public void iniciarPedido(String nombreCliente, String direccionCliente)
	{
		;
	}
	
	public void cerrarYGuardarPedido()
	{
		
	}
	
	public Pedido getPedidoEnCurso(Pedido pedido)
	{
		return pedido;
	}
	
	public ArrayList<ProductoMenu> getMenuBase()
	{
		return menu;
	}
	
	public ArrayList<Ingrediente> getIngrediente()
	{
		return ingredientes;
	}
	
	public void cargaInformacionRestaurante(File archivoIngredientes, File archivoMenu, File archivoCombos)
	{
		ingredientes=Ingrediente.cargarIngredientes(archivoIngredientes);
		menu=ProductoMenu.cargarMenu(archivoMenu);
		combos=Combo.cargarCombos(archivoCombos);
	}
	
	public void agregarCombo(Combo nuevoCombo)
	{
		combos.add(nuevoCombo);
	}
	
}
