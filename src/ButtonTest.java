// Figura 14.16: ButtonTest.java
// Testando Buttonframe.
import javax.swing.JFrame;

public class ButtonTest
{
    public static void main( String[] args)
    {
        ButtonFrame ButtonFrame = new ButtonFrame(); // cria ButtonFrame
        ButtonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        ButtonFrame.setSize(275,110); // configura o tamanho do frame
        ButtonFrame.setVisible(true); // exibe o frame
    } // fim de main
} // fim da classe ButtonTest
