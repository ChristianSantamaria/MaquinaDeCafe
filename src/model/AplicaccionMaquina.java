package model;
import javax.swing.JOptionPane;


public class AplicaccionMaquina
{

	public MaquinaDeCafe maquinaDeCafe;
	public AplicaccionMaquina(){
		super();
	}

	
	public static void main(String[] args) {
		
        Monedero m1 = new Monedero();
        AplicaccionMaquina n = new AplicaccionMaquina();
        
        
        
        m1.introducirDinero(Double.parseDouble(JOptionPane.showInputDialog("Cuanto dinero ingresa?")));
        n.menu();
            
	}
	
	public void menu() {
            boolean exit = false;
            String opcion = "";
            while(exit == false){
                System.out.println("Que bebida quiere tomar?");
                System.out.println("a. Cafe");
                System.out.println("b. Té");
                System.out.println("c. Chocolate");
                System.out.println("d. Salir");
                
                opcion = JOptionPane.showInputDialog(null, "Que bebida quiere tomar?");
                
                switch(opcion){
                    
                    case "a": case "b":  case "c":
                        Monedero m1 = new Monedero();
                        m1.elegirBebida(opcion);
                        break;
                        
                    case "d":
                        exit = true;
                        
                }
            }
            
	}

}

