
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class Login {
    
    private JFrame frameLogin=new JFrame();
    private JLabel lImagem = new JLabel();    
    private JLabel lLogin = new JLabel("Login:");
    private JLabel lSenha = new JLabel("Senha:");
    private JTextField fLogin = new JTextField(10);
    private JPasswordField fSenha = new JPasswordField(10);
    private JButton bOk = new JButton("OK");
    
    
    public Login() throws FileNotFoundException, IOException{
        lImagem.setIcon(new ImageIcon("C:\\Users\\Pablo\\Google Drive\\Facul\\ALPRO\\ControleDeCustos\\icon.jpg"));
        frameLogin.add(lImagem);
        
        frameLogin.add(lLogin);
        frameLogin.add(fLogin);
        frameLogin.add(lSenha);        
        frameLogin.add(fSenha);
        frameLogin.add(bOk);
        
        frameLogin.setTitle("Acesso ao sistema");
        frameLogin.setSize(800,600);
        frameLogin.setLayout(new FlowLayout());
        frameLogin.setVisible(true);
        frameLogin.setDefaultCloseOperation(frameLogin.EXIT_ON_CLOSE);
              
        
        bOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    boolean testa = validaLogin(fLogin.getText(), fSenha.getText());
                    if (testa == true) {
                        JOptionPane.showMessageDialog(null, "CERTO!");
                        TelaInicial tela = new TelaInicial();
                        frameLogin.setVisible(false);
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "ERRADO!");
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

    }
   
    public boolean validaLogin(String loginEntrada, String senhaEntrada) throws FileNotFoundException, IOException {

        FileReader reader = new FileReader("C:\\Users\\Pablo\\Google Drive\\Facul\\ALPRO\\ControleDeCustos\\CadastroLogin.txt");
        BufferedReader buff = new BufferedReader(reader);
        String usr;
        String pass;

        while (buff.ready()) {
            String line = buff.readLine();
            String[] parts = line.split(";");
            usr = parts[0];
            pass = parts[1];
            if ((loginEntrada.equals(usr)) && (senhaEntrada.equals(pass))) {
                return true;
            }
        }
        return false;
    }
}