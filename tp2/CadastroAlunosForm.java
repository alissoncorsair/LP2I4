import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CadastroAlunosForm extends JFrame {
    private List<Aluno> listaAlunos = new ArrayList<>();
    private JTextField nomeField, idadeField, enderecoField;
    private JLabel resultadoLabel;

    public CadastroAlunosForm() {
        setTitle("Cadastro de Alunos");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10)); // 3 rows, 2 columns, hgap=10, vgap=10

        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField();
        JLabel idadeLabel = new JLabel("Idade:");
        idadeField = new JTextField();
        JLabel enderecoLabel = new JLabel("Endereço:");
        enderecoField = new JTextField();

        inputPanel.add(nomeLabel);
        inputPanel.add(nomeField);
        inputPanel.add(idadeLabel);
        inputPanel.add(idadeField);
        inputPanel.add(enderecoLabel);
        inputPanel.add(enderecoField);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 4));
        JButton okButton = new JButton("Ok");
        JButton limparButton = new JButton("Limpar");
        JButton mostrarButton = new JButton("Mostrar");
        JButton sairButton = new JButton("Sair");
        resultadoLabel = new JLabel("");

        buttonPanel.add(okButton);
        buttonPanel.add(limparButton);
        buttonPanel.add(mostrarButton);
        buttonPanel.add(sairButton);

        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (nomeField.getText().isEmpty() || idadeField.getText().isEmpty()
                        || enderecoField.getText().isEmpty()) {
                    resultadoLabel.setText("Preencha todos os campos.");
                    return;
                }
                String nome = nomeField.getText();
                int idade = Integer.parseInt(idadeField.getText());
                String endereco = enderecoField.getText();
                UUID uuid = UUID.randomUUID();

                Aluno aluno = new Aluno(uuid, nome, idade, endereco);
                listaAlunos.add(aluno);

                nomeField.setText("");
                idadeField.setText("");
                enderecoField.setText("");

                resultadoLabel.setText("Aluno cadastrado com sucesso.");
            }
        });

        limparButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nomeField.setText("");
                idadeField.setText("");
                enderecoField.setText("");
                resultadoLabel.setText("");
            }
        });

        mostrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!listaAlunos.isEmpty()) {
                    StringBuilder message = new StringBuilder("Lista de Alunos:\n");
                    for (Aluno aluno : listaAlunos) {
                        message.append("UUID: ").append(aluno.getUuid()).append(", ");
                        message.append("Nome: ").append(aluno.getNome()).append(", ");
                        message.append("Idade: ").append(aluno.getIdade()).append(", ");
                        message.append("Endereço: ").append(aluno.getEndereco()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, message.toString(), "Lista de Alunos",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "A lista de alunos está vazia.", "Lista de Alunos",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        sairButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(inputPanel);
        mainPanel.add(buttonPanel);
        mainPanel.add(resultadoLabel);
        add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CadastroAlunosForm();
    }
}
