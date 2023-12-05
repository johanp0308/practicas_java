import javax.swing.JOptionPane;

public class Blabla {
    
    public static void main(String[] args) {
        
        String cuponId = JOptionPane.showInputDialog("Ingrese el token de su cupon");
        char pre = 'P';
        double descuentoCupon = 0;
        double valorCompra = 50000.23;
        if(cuponId.charAt(0)==pre){
            int numero = Integer.parseInt(cuponId.substring(3, 6));
            System.out.println(numero);
            switch (numero) {
                case 201:
                    descuentoCupon = (valorCompra>20000) ? (0.23*valorCompra) : valorCompra;
                    break;
                case 202:
                    descuentoCupon = (valorCompra>20000) ? (0.25*valorCompra) : valorCompra;
                    break;
                case 203:
                    descuentoCupon = (valorCompra>20000) ? (0.30*valorCompra) : valorCompra;
                    break;
                case 204:
                    descuentoCupon = (valorCompra>20000) ? (0.33*valorCompra) : valorCompra;
                    break;
                case 205:
                    descuentoCupon = (valorCompra>20000) ? (0.40*valorCompra) : valorCompra;
                    break;
                default:
                    System.out.println("Error en la operacion para evaluar el cupon");
                    break;
            }
            System.out.println("El valor del descuento del cupon por la compra:"+descuentoCupon);
        }else{
            System.out.println("No se te aplico descuento:"+valorCompra);
        }
    }
}
