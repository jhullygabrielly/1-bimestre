package javaapplication5;

// Figura 14.22: ComboBoxTest.java
// Testando ComboBoxFrame.
import javax.swing.JFrame;

public class ComboBoxTest
{
    public static void main( String[] args)
    {
        ComboBoxFrame ComboBoxFrame = new ComboBoxFrame();
        ComboBoxFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        ComboBoxFrame.setSize(350,150); // configura o tamanho do frame
        ComboBoxFrame.setVisible(true); // exibe o frame
    } // fim de main
} // fim da classe ComboBoxTest