package model;


public class MaquinaDeCafe {

    public Producto producto;
    public Monedero monedero;
    public Display display;
    public AplicaccionMaquina aplicaccionMaquina;

    public MaquinaDeCafe() {
        super();
    }

    public void elaborarProd(String ad) {
       Display d = new Display();
        switch (ad) {

            case "a":
                Cafe p1 = new Cafe();
                System.out.println("Cafe elaborado.");
                d.imprimirCambio(p1.Precio);
                break;

            case "b":
                Te p2 = new Te();
                System.out.println("Te elaborado.");
                d.imprimirCambio(p2.Precio);
                break;

            case "c":
                Chocolate p3 = new Chocolate();
                System.out.println("Chocolate elaborado.");
                d.imprimirCambio(p3.Precio);
                break;

        }
        
    }

    public void devolverCambio(Double e) {
        System.out.println("El cambio ha sido devuelto");
    }

}
