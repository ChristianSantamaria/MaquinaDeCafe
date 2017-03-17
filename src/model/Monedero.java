package model;


public class Monedero {

    public double cantidad;
    public double precioBebida;
    public MaquinaDeCafe maquinaDeCafe;
    public Producto producto;

    public Monedero() {
        super();
    }

    public void introducirDinero(double dinero) {
        cantidad = dinero;
        Display dis = new Display();
        dis.imprimirEstado(cantidad);
    }

    public void verificarDinero() {
        if (cantidad > precioBebida) {
            MaquinaDeCafe m = new MaquinaDeCafe();

        } else {
            System.out.println("No hay suficiente dinero para la bebida, falta: " + (precioBebida - cantidad));
        }

    }

    public void elegirBebida(String d) {
        MaquinaDeCafe pro = new MaquinaDeCafe();
        switch (d) {
            case "a":
                Cafe a = new Cafe();
                precioBebida = a.Precio;
                pro.elaborarProd(d);

                break;

            case "b":
                Te b = new Te();
                precioBebida = b.Precio;
                pro.elaborarProd(d);

                break;

            case "c":
                Chocolate c = new Chocolate();
                precioBebida = c.Precio;
                pro.elaborarProd(d);

                break;

        }
    }

}
