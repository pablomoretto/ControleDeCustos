
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class UsuarioLista implements UsuarioInterface {

    private int qtdUsuarios=0;
    private Usuario head;
    private Usuario tail;
    
    
    @Override
    public void addUsuario(Usuario u) {
        Usuario aux = new Usuario();
        
        if(qtdUsuarios ==0){
            head=u;
            tail=u;
            qtdUsuarios++;
        }else{
            aux=tail;
            int i=0;
            while(i<qtdUsuarios){
                if(aux.getNext() != null)
                    aux=aux.getNext();
                i++;
            }            
            aux.setNext(u);
            tail=aux;
            qtdUsuarios++;            
        }        
    }

    @Override
    public void removeUsuario(Usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String toString(){
        Usuario aux = new Usuario();
        aux=head;
        int cont =0;
        String retorno = "";
        
        if(qtdUsuarios==0){
            JOptionPane.showMessageDialog(null, "Não existe usuários cadastrados!!");
        }
        retorno += "USUÁRIO" + " - " + "SENHA" + "\n";
        while (cont < qtdUsuarios) {
            retorno += aux.getNome() + " - " + aux.getSenha() + "\n";
            aux = aux.getNext();
            cont++;
        }            
        return retorno;
    }
    
}
