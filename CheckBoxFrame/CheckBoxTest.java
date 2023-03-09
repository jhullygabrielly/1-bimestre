// Figura 14.18: CheckBoxTest.java
// Testando CheckBoxFrame.
import javax.swing.JFrame;

public class CheckBoxTest
{
    public static void main(String[] args)
    {
        CheckBoxFrame CheckBoxFrame = new CheckBoxFrame();
        CheckBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CheckBoxFrame.setSize(275,100); // configura o tamanho do frame
        CheckBoxFrame.setVisible(true); // exibe o frame   
    } // fim de main
} // fim da classe CheckBoxTest