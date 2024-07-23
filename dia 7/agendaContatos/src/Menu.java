import java.util.Scanner;
/**
 * Programa Agenda de contatos
 * nesse programa é possível adicionar novos contatos, buscar, remover e listar todos os contatos
 * @author Msouza472
 * @version 1.0
 */

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgendaDeContatos agenda = new AgendaDeContatos();
        
        int opcao = 0;

        while (opcao != 5) {
            
        System.out.println("Olá Usuário escolha uma das opções abaixo!");
        System.out.println("1- Adicionar Contato");
        System.out.println("2- Remover Contato");
        System.out.println("3- Buscar Contatos");
        System.out.println("4- Listar Contatos");
        System.out.println("5- Sair");

        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                Contato novoContato = new Contato();
                System.out.println("Digite o nome");
                novoContato.setNome(scanner.nextLine());
                System.out.println("Digite o telefone");
                novoContato.setTelefone(scanner.nextLine());
                agenda.adicionarContato(novoContato);       
                break;
            
            case 2:
                System.out.println("Digite o nome do contato a ser removido");
                String nomeRemover = scanner.nextLine();
                agenda.removerContato(nomeRemover);
                break;
            case 3:
                System.out.println("Digite o nome do contato a ser buscado");
                String nomeBuscar = scanner.nextLine();
                Contato contatoEncontrado = agenda.buscarContato(nomeBuscar);
                if (contatoEncontrado != null) {
                    System.out.println("Contato encontrado, nome: " + contatoEncontrado.getNome() + " Telefone: " + contatoEncontrado.getTelefone());            
                }else{
                    System.out.println("Contato não encontrado!");
                }
                break;
            case 4:
                agenda.listarContatos();
                break;
            case 5:
                System.out.println("Saindo.....");
                break;
            default:
                System.out.println("Opção inválido, tente novamente");
        }
    }
    scanner.close();
}
}
