import java.util.UUID;

public class Aluno {
    // Atributos privados
    private String endereco;
    private int idade;
    private String nome;
    private UUID uuid;

    // Construtor
    public Aluno(UUID uuid, String nome, int idade, String endereco) {
        this.uuid = uuid;
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    // Métodos getters
    public String getEndereco() {
        return endereco;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public UUID getUuid() {
        return uuid;
    }

    // Métodos setters
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
