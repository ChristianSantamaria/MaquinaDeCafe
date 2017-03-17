package model;


public class Display
{
	public Display(){
		super();
	}

	public void imprimirEstado(Double dinero) {
            System.out.println(dinero);
	}

	public void imprimirCambio(Double e) {
            MaquinaDeCafe n = new MaquinaDeCafe();
            System.out.println("El cambio es de " + e);
            n.devolverCambio(e);
	}
}

