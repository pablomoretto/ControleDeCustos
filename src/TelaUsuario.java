
import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class TelaUsuario extends Container{
    private Container containerUsuario = new Container();
    private Button b1=new Button("OK!");
    private Button b2=new Button("Cancel!");
    private Button bVoltar = new Button("Volta");
    
    
    public TelaUsuario() {        
          this.setLayout(new FlowLayout());
       this.setSize(400, 400);
       this.setVisible(true);
        
        this.add(b1);
        this.add(b2);
        this.add(bVoltar);
                
        
        this.setVisible(true);
        this.setSize(300, 300);
    }

    }        
