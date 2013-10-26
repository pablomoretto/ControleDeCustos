
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class TelaInicial extends JFrame{
    Container container = new Container();
    JFrame fTelaInicial = new JFrame();
    JLabel iconeAddUsuarios = new JLabel();
    JLabel addUsuarios = new JLabel("Adicionar Usuários");
    JLabel iconeAddDespesa = new JLabel();
    JLabel addDespesa = new JLabel("Adicionar Despesa");
    JLabel iconeAddReceita = new JLabel();
    JLabel addReceita = new JLabel("Adicionar Receita");
    JMenuBar menuBar = new JMenuBar();
    JMenu menuArquivo = new JMenu("ARQUIVO");
    JMenu menuSobre = new JMenu("SOBRE");
    JMenuItem menuArquivoUsuarios = new JMenuItem("Usuários");
    JMenuItem menuArquivoDespesa = new JMenuItem("Despesas");
    JMenuItem menuArquivoReceita = new JMenuItem("Receitas");    
    
    public TelaInicial(){
        
        //IMAGENS A LABELS
        iconeAddUsuarios.setIcon(new ImageIcon("C:\\Users\\Pablo\\Google Drive\\Facul\\ALPRO\\ControleDeCustos\\iconeAddUsuario.png"));
        iconeAddDespesa.setIcon(new ImageIcon("C:\\Users\\Pablo\\Google Drive\\Facul\\ALPRO\\ControleDeCustos\\iconeAddDespesa.png"));
        iconeAddReceita.setIcon(new ImageIcon("C:\\Users\\Pablo\\Google Drive\\Facul\\ALPRO\\ControleDeCustos\\iconeAddReceita.png"));

        
        //BOTTUNS
        iconeAddUsuarios.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
               TelaUsuario telaUsuario = new TelaUsuario();                                             
               telaUsuario.setLayout(new FlowLayout());
               
               container.setVisible(false);
               fTelaInicial.add(telaUsuario);
                                             
               fTelaInicial.invalidate();
               fTelaInicial.validate();
            }
        });

        iconeAddDespesa.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               TelaDespesa telaDespesa = new TelaDespesa();                                             
               telaDespesa.setLayout(new FlowLayout());
               
               container.setVisible(false);
               fTelaInicial.add(telaDespesa);
                                             
               fTelaInicial.invalidate();
               fTelaInicial.validate();
            }
        });
        iconeAddReceita.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
               TelaReceita telaReceita = new TelaReceita();                                             
               telaReceita.setLayout(new FlowLayout());
               
               container.setVisible(false);
               fTelaInicial.add(telaReceita);
                                             
               fTelaInicial.invalidate();
               fTelaInicial.validate();
            }
        });        
        
        
        //CONTAINER 
        container.setLayout(new FlowLayout());
        container.add(iconeAddUsuarios);
        container.add(addUsuarios);
        container.add(iconeAddDespesa);
        container.add(addDespesa);
        container.add(iconeAddReceita);
        container.add(addReceita);      
                
        
        //MENU
        menuArquivo.add(menuArquivoUsuarios);
        menuArquivo.add(menuArquivoDespesa);
        menuArquivo.add(menuArquivoReceita);
        menuBar.add(menuArquivo);
        menuBar.add(menuSobre);
        
        //TELA INICIAL
        fTelaInicial.add(container);        
        fTelaInicial.setJMenuBar(menuBar);        
        fTelaInicial.setTitle("Sistema Financeiro Pessoal");
        fTelaInicial.setSize(800,600);
        fTelaInicial.setLayout(new FlowLayout());
        fTelaInicial.setVisible(true);
        fTelaInicial.setDefaultCloseOperation(fTelaInicial.EXIT_ON_CLOSE);
    }
    
    //Método altera telas.
    public void voltaTelaInicia(Container c){
        c.setVisible(false);
        container.setVisible(true);
    }
    
    
}
