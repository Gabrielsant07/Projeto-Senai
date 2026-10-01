package src.br.com.Romulo.curso.arquivo; //Define o pacote onde a classe está organizada.

import java.io.FileWriter; 
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class CadastroAmbientes {

    private static final String ARQUIVO = "ambientes.txt";

    private static Map<String, String> ambientes = new HashMap<>();

    private static final DateTimeFormatter FORMATO =
            DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public static void main(String[] args) {

        int opcao;


        do {

            String menu = """
                    ===== CADASTRO DE AMBIENTES =====

                    1 - Cadastrar
                    2 - Listar
                    3 - Pesquisar
                    4 - Excluir
                    5 - Alterar
                    6 - Sair

                    Escolha uma opção:
                    """;

            try {

                opcao = Integer.parseInt(
                        JOptionPane.showInputDialog(menu)
                );

                switch (opcao) {

                    case 1:
                        cadastrar();
                        break;

                    case 2:
                        listar();
                        break;

                    case 3:
                        pesquisar();
                        break;

                    case 4:
                        excluir();
                        break;

                    case 5:
                        alterar();
                        break;

                    case 6:
                        JOptionPane.showMessageDialog(
                                null,
                                "Programa encerrado!"
                        );
                        break;

                    default:
                        JOptionPane.showMessageDialog(
                                null,
                                "Opção inválida!"
                        );
                }

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(
                        null,
                        "Digite apenas números!"
                );

                opcao = 0;

            } catch (Exception e) {

                JOptionPane.showMessageDialog(
                        null,
                        "Ocorreu um erro: " + e.getMessage()
                );

                opcao = 0;

            } finally {

                System.out.println(
                        "Operação do menu finalizada."
                );
            }

        } while (opcao != 6);
    }

    private static void cadastrar() {

        String chave = JOptionPane.showInputDialog(
                "Digite a chave do ambiente:"
        );

        if (chave == null || chave.trim().isEmpty()) {
            return;
        }

        chave = chave.toUpperCase();

        // Verifica se a chave já existe
        if (ambientes.containsKey(chave)) {

            JOptionPane.showMessageDialog(
                    null,
                    "Essa chave já está cadastrada!"
            );

            return;
        }

        String descricao = JOptionPane.showInputDialog(
                "Digite a descrição do ambiente:"
        );

        if (descricao == null || descricao.trim().isEmpty()) {
            return;
        }

        // Adiciona no HashMap
        ambientes.put(chave, descricao);

        // Salva no arquivo
        salvarArquivo();

        JOptionPane.showMessageDialog(
                null,
                "Ambiente cadastrado com sucesso!"
        );
    }

    private static void listar() {

        if (ambientes.isEmpty()) {

            JOptionPane.showMessageDialog(
                    null,
                    "Nenhum ambiente cadastrado."
            );

            return;
        }

        StringBuilder lista = new StringBuilder();

        lista.append("===== AMBIENTES CADASTRADOS =====\n\n");

        for (Map.Entry<String, String> ambiente
                : ambientes.entrySet()) {

            lista.append("Chave: ")
                    .append(ambiente.getKey())
                    .append("\n");

            lista.append("Descrição: ")
                    .append(ambiente.getValue())
                    .append("\n\n");
        }

        JOptionPane.showMessageDialog(
                null,
                lista.toString()
        );
    }

    private static void pesquisar() {

        String chave = JOptionPane.showInputDialog(
                "Digite a chave que deseja pesquisar:"
        );

        if (chave == null || chave.trim().isEmpty()) {
            return;
        }

        chave = chave.toUpperCase();

        if (ambientes.containsKey(chave)) {

            String descricao = ambientes.get(chave);

            JOptionPane.showMessageDialog(
                    null,
                    "Ambiente encontrado!\n\n"
                            + "Chave: " + chave
                            + "\nDescrição: " + descricao
            );

        } else {

            JOptionPane.showMessageDialog(
                    null,
                    "Ambiente não encontrado."
            );
        }
    }

    // =========================================================
    // EXCLUIR
    // =========================================================

    private static void excluir() {

        String chave = JOptionPane.showInputDialog(
                "Digite a chave do ambiente que deseja excluir:"
        );

        if (chave == null || chave.trim().isEmpty()) {
            return;
        }

        chave = chave.toUpperCase();

        if (ambientes.containsKey(chave)) {

            ambientes.remove(chave);

            salvarArquivo();

            JOptionPane.showMessageDialog(
                    null,
                    "Ambiente excluído com sucesso!"
            );

        } else {

            JOptionPane.showMessageDialog(
                    null,
                    "Ambiente não encontrado."
            );
        }
    }

    // =========================================================
    // ALTERAR
    // =========================================================

    private static void alterar() {

        String chave = JOptionPane.showInputDialog(
                "Digite a chave do ambiente que deseja alterar:"
        );

        if (chave == null || chave.trim().isEmpty()) {
            return;
        }

        chave = chave.toUpperCase();

        if (ambientes.containsKey(chave)) {

            String descricaoAtual = ambientes.get(chave);

            String novaDescricao = JOptionPane.showInputDialog(
                    "Descrição atual:\n"
                            + descricaoAtual
                            + "\n\nDigite a nova descrição:"
            );

            if (novaDescricao == null
                    || novaDescricao.trim().isEmpty()) {

                return;
            }

            ambientes.put(chave, novaDescricao);

            salvarArquivo();

            JOptionPane.showMessageDialog(
                    null,
                    "Ambiente alterado com sucesso!"
            );

        } else {

            JOptionPane.showMessageDialog(
                    null,
                    "Ambiente não encontrado."
            );
        }
    }

    private static void salvarArquivo() {

        
        LocalDateTime agora = LocalDateTime.now();

        String dataHora = agora.format(FORMATO);

        try (FileWriter arquivo = new FileWriter(ARQUIVO)) {

            arquivo.write("CADASTRO DE AMBIENTES\n");
            arquivo.write("====================\n");
            arquivo.write("Atualizado em: " + dataHora + "\n\n");

            for (Map.Entry<String, String> ambiente
                    : ambientes.entrySet()) {

                arquivo.write(
                        ambiente.getKey()
                                + " - "
                                + ambiente.getValue()
                                + "\n"
                );
            }

        } catch (IOException e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao salvar o arquivo: "
                            + e.getMessage()
            );

        } finally {

            System.out.println(
                    "Processo de gravação finalizado."
            );
        }
    }
}
