// Figura 14.23: listFrame.java
// JList que exibe uma lista de cores.
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;

public class ListFrame extends JFrame
{
    private JList colorJList; // lista para exibir cores
    private static final String[] colorNames = {"Black", "Blue", "Cyan", "Dark gray", "gray", "Green", "light Gray", "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};
    private static final Color[] colors = { Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW};
    
    // construtor ListFrame adiciona JScrollPane que contém JList ao JFrame
    public ListFrame()
    {
        super("List Test");
        setLayout( new FlowLayout()); // configura o layout de frame
        
        colorJList = new JList(colorNames); // cria com colorNames
        colorJList.setVisibleRowCount(5); // exibe cinco linhas de uma vez
        
        // não permite múltiplas seleçoes
        colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        // adiciona um JSrollPane que contém Jlist ao frame
        add( new JScrollPane(colorJList));
        colorJList.addListSelectionListener(
        new ListSelectionListener()// classe interna anonima
        {
            // trata eventos de seleção de lista
            public void valueChanged(ListSelectionEvent event)
            {
                getContentPane().setBackground(
                    colors[colorJList.getSelectedIndex()]);
            } // fim do método valueChanged
        } // fim da classe interna anonima
        ); // fim da chamada para addLisSelectionListener
    } // fim do construtor ListFrame
} // fim da classe ListFrame
