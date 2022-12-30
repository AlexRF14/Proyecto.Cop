public class Ropa extends Item{
	protected int talla;

	public Ropa(String nombre,  String marca, int precio, int talla){
		super(nombre, marca, precio);
		this.talla = talla;
	}
	public void setTalla(int talla){
		this.talla = talla;
	}
	public String toString(){
		return super.toString() + " Talla: " + talla;
	}
}
