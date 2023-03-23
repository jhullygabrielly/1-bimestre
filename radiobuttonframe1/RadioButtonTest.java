package radiobuttonframe1;

// figura 14.20: RadioButtonTest.java
// testando RadioButtonFrame
import javax.swing.JFrame;

public class RadioButtonTest
{
    public static void main( String[]args)
    {
        RadioButtonFrame RadioButtonFrame = new RadioButtonFrame();
        RadioButtonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        RadioButtonFrame.setSize(300,100); // configurta o tamanho do frame
        RadioButtonFrame.setVisible( true); // exibe o frame   
    } // fim de main
} // fim da classe RadioButtonTest