package radiobuttonframe1;

// figura 14.19: RadioButtonFrame.java
// criando botões de opção utilizando ButtonGroup e JRadioButton
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class RadioButtonFrame extends JFrame
{
    private JTextField textField; //utilizado para exibir alteraççoes de fonte
    private Font plainFont; // fonte para texto simples
    private Font boldFont; // fonte para texto em negrito
    private Font italicFont; // fonte para texto em itálico
    private Font boldItalicFont; // fonte para texto em negrito e itálico
    private JRadioButton plainJRadioButton; // seleciona texto simples
    private JRadioButton boldJRadioButton; // seleciona texto em negrito
    private JRadioButton italicJRadioButton; // seleciona texto em itálico
    private JRadioButton boldItalicJRadioButton; // negrito e itálico
    private ButtonGroup radioGroup; // buttongroup para armazenar botões de opção
    
    //construtor RadioButtonFrame adiciona JRadioButtons ao JFrame
    public RadioButtonFrame()
    {
        super("RadioButton Test");
        setLayout(new FlowLayout()); // configura o layout de frame
        
        textField = new JTextField("Watch the font style change",25);
        add(textField); // adiciona textField ao jframe
        
        // cria botões de opção
        plainJRadioButton = new JRadioButton("Plain", true);
        boldJRadioButton = new JRadioButton("Bold",false);
        italicJRadioButton = new JRadioButton("Italic",false);
        boldItalicJRadioButton = new JRadioButton("Bold/Italic",false);
        add( plainJRadioButton); // adiciona botão no estilo simples ao JFrame
        add( boldJRadioButton); // adiciona botão de negrito ao JFrame
        add( italicJRadioButton); // adiciona botão de itálico ao Jframe
        add( boldItalicJRadioButton); // adiciona botão de negrito e itálico
        
        // cria relacionamento lógico entre JRadioButtons
        radioGroup = new ButtonGroup(); // cria ButtonGroup
        radioGroup.add( plainJRadioButton); // adiciona simples ao grupo
        radioGroup.add( boldJRadioButton); // adiciona negrito ao grupo
        radioGroup.add( italicJRadioButton); // adiciona itálico ao grupo
        radioGroup.add( boldItalicJRadioButton); // adiciona negrito e itálico
        
        // cria fonte objetos
        plainFont = new Font("Serif", Font.PLAIN, 14);
        boldFont = new Font("Serif", Font.BOLD,14);
        italicFont = new Font("Serif", Font.ITALIC, 14);
        boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC,14);
        textField.setFont( plainFont); // configura a fonte inicial como simples
        
        // registra eventos para jRadioButtons
        plainJRadioButton.addItemListener(
                new RadioButtonHandler(plainFont));
        boldJRadioButton.addItemListener(
                new RadioButtonHandler( boldFont));
        italicJRadioButton.addItemListener(
                new RadioButtonHandler(italicFont));
        boldItalicJRadioButton.addItemListener(
                new RadioButtonHandler( boldItalicFont));            
    }
    
    // classe interna private para tratar eventos de botão de opção
    private class RadioButtonHandler implements ItemListener
    {
        private Font font; // fonte associada com esse listener
        
        public RadioButtonHandler(Font f)
        {
            font = f; //configura a fonte desse listener
        } // fim do construtor radioButtonHandler
        
        // trata eventos de botão de opção
        public void itemStateChanged(ItemEvent event)
        {
            textField.setFont( font); // configura fonte de textField
        } // fim do metódo itemStateChanged
    } // fim da classe RadiobuttonHandler interna private
} // fim da classe RadioButtonFrame 