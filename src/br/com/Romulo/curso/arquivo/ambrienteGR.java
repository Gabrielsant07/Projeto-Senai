package src.br.com.Romulo.curso.arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class ambrienteGR {
       private static final String CAMINHO_ARQUIVO = "ambientes.txt";
    private static Map<String, String> ambientes = new HashMap<>();

    public static void main(String[] args) {
        // Inicializa dados com dados do enunciado e carrega ficheiro existente
        carregarDoArquivo();
        if (ambientes.isEmpty()) {
            ambientes.put("F07", "Laboratório de Programação Java");
            ambientes.put("B03", "Sala de Aula Padrão");
            ambientes.put("G09", "Oficina de Laternagem e Pintura");
            salvarNoArquivo();
        }

        int opcao = -1;

        do {
            String menu = "=== DICIONÁRIO DE AMBIENTES ===\n"
                    + "1 - Cadastrar\n"
                    + "2 - Listar\n"
                    + "3 - Pesquisar\n"
                    + "4 - Alterar\n"
                    + "5 - Excluir\n"
                    + "0 - Sair\n\n"
                    + "Escolha uma opção:";

            String entrada = JOptionPane.showInputDialog(null, menu, "Menu Principal", JOptionPane.QUESTION_MESSAGE);

            if (entrada == null) {
                break; // Cancela e sai se o utilizador fechar a janela
            }

            try {
                opcao = Integer.parseInt(entrada);

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
                        alterar();
                        break;
                    case 5:
                        excluir();
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "A encerrar o sistema...");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida! Escolha entre 0 e 5.", "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, introduza um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } while (opcao != 0);
    }

    private static void cadastrar() {
        String chave = JOptionPane.showInputDialog("Introduza o código da chave (ex: F07):");
        if (chave == null || chave.trim().isEmpty()) return;

        if (ambientes.containsKey(chave.toUpperCase())) {
            JOptionPane.showMessageDialog(null, "Chave já existente! Utilize a opção de alteração.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String descricao = JOptionPane.showInputDialog("Introduza a descrição do ambiente:");
        if (descricao == null || descricao.trim().isEmpty()) return;

        ambientes.put(chave.toUpperCase(), descricao);
        salvarNoArquivo();
        JOptionPane.showMessageDialog(null, "Ambiente cadastrado com sucesso!");
    }

    private static void listar() {
        if (ambientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum ambiente cadastrado.");
            return;
        }

        StringBuilder sb = new StringBuilder("=== AMBIENTES CADASTRADOS ===\n\n");
        for (Map.Entry<String, String> entry : ambientes.entrySet()) {
            sb.append("Chave: ").append(entry.getKey())
              .append(" | Descrição: ").append(entry.getValue()).append("\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }

    private static void pesquisar() {
        String chave = JOptionPane.showInputDialog("Introduza a chave a pesquisar:");
        if (chave == null || chave.trim().isEmpty()) return;

        chave = chave.toUpperCase();
        if (ambientes.containsKey(chave)) {
            JOptionPane.showMessageDialog(null, "Chave: " + chave + "\nDescrição: " + ambientes.get(chave));
        } else {
            JOptionPane.showMessageDialog(null, "Ambiente não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void alterar() {
        String chave = JOptionPane.showInputDialog("Introduza a chave a alterar:");
        if (chave == null || chave.trim().isEmpty()) return;

        chave = chave.toUpperCase();
        if (!ambientes.containsKey(chave)) {
            JOptionPane.showMessageDialog(null, "Chave não encontrada!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String novaDescricao = JOptionPane.showInputDialog("Descrição atual: " + ambientes.get(chave) + "\nIntroduza a nova descrição:");
        if (novaDescricao == null || novaDescricao.trim().isEmpty()) return;

        ambientes.put(chave, novaDescricao);
        salvarNoArquivo();
        JOptionPane.showMessageDialog(null, "Ambiente alterado com sucesso!");
    }

    private static void excluir() {
        String chave = JOptionPane.showInputDialog("Introduza a chave a excluir:");
        if (chave == null || chave.trim().isEmpty()) return;

        chave = chave.toUpperCase();
        if (ambientes.remove(chave) != null) {
            salvarNoArquivo();
            JOptionPane.showMessageDialog(null, "Ambiente removido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Chave não encontrada!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void salvarNoArquivo() {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = agora.format(formatador);

        try (FileWriter writer = new FileWriter(CAMINHO_ARQUIVO)) {
            writer.write("# Atualizado em: " + dataFormatada + "\n");
            for (Map.Entry<String, String> entry : ambientes.entrySet()) {
                writer.write(entry.getKey() + ";" + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar no ficheiro: " + e.getMessage(), "Erro de I/O", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Bloco de execução garantida (usado tipicamente para auditoria ou encerramento manual)
            System.out.println("Operação de escrita terminada em: " + dataFormatada);
        }
    }

    private static void carregarDoArquivo() {
        try (BufferedReader reader = new BufferedReader(new FileReader(CAMINHO_ARQUIVO))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                if (linha.startsWith("#") || linha.trim().isEmpty()) continue;
                String[] partes = linha.split(";");
                if (partes.length == 2) {
                    ambientes.put(partes[0], partes[1]);
                }
            }
        } catch (IOException e) {
            // Ficheiro ainda não existe na primeira execução
        }
    }
}

