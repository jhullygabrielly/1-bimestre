// figura 14.24: ListTest.java
// selecionando as cores de uma JList
import javax.swing.JFrame;

public class ListTest
{
    public static void main( String[] args)
    {
        ListFrame ListFrame = new ListFrame(); // cria ListFrame
        ListFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        ListFrame.setSize(350,150); // configura o tamanho do frame
        ListFrame.setVisible(true); // exibe o frame
    } // fim de main       
} // fim da classe ListTest