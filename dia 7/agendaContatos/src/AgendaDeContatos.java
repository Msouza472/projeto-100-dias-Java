import java.util.ArrayList;
import java.util.List;

public class AgendaDeContatos {
    private List<Contato> contatos = new ArrayList<Contato>();
    
    public void adicionarContato(Contato contato){
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso!");

    }

    public void removerContato(String nome){
        Contato contatoParaRemover = null;

        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contatoParaRemover = contato;
                break;
            }
        }
        if (contatoParaRemover != null) {
            contatos.remove(contatoParaRemover);
            System.out.println("Contato removido com sucesso!");
        }else{
            System.out.println("Contato não encontrado!");
        }

    }

    public Contato buscarContato(String nome){
        for (Contato contato : contatos){
            if(contato.getNome().equalsIgnoreCase(nome)){
                return contato;
            }
        }
        return null;

    }

    public void listarContatos(){
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato encontrado");
            }else{
                for(Contato contato : contatos){
                System.out.println("Nome: " + contato.getNome() + " , Telefone: " + contato.getTelefone());
            }
        }
    }

}
