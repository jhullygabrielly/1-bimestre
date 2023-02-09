import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args){
            String a= JOptionPane.showInputDialog("Digite o primeiro número");
            String b= JOptionPane.showInputDialog("Digite o segundo número");
            
            double peso = Double.parseDouble(a);
            double altura = Double.parseDouble(b);
            double sum = peso/(altura*altura);
            
        JOptionPane.showMessageDialog (null, "O seu IMC é: "+ sum,"Calculadora IMC", JOptionPane.PLAIN_MESSAGE);
    }
}
