package Taller2CesarAvellaneda.modelo;

public class Ingrediente 
{
	// ATRIBUTOS//
	
	private String nombre;
	
	private int costoAdicional;
	
	//-- CONSTRUCTOR --//
	
	public Ingrediente (String nombre, int costoAdicional)
	{
		this.nombre=nombre;
		this.costoAdicional=costoAdicional;
	}
	
	//-- METODOS --//
	
	public String nombreIngrediente()
	{
		return nombre;
	}
	
	public int costoIngrediente()
	{
		return costoAdicional;
	}
	
}
