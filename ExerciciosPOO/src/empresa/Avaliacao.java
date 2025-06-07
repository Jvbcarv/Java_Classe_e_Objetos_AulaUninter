package empresa;

//Declaração das classes e atributos
public class Avaliacao { 
    private double nota1; //nota1 é um Atributo privado que armazenará os valores reais das notas, e por isso usei double (números reais).
    private double nota2;
    private double nota3;

// Construtor da classe
//Um construtor é usado para criar um objeto da classe e inicializar as notas com os valores passados
    public Avaliacao(double nota1, double nota2, double nota3) {
        this.nota1 = nota1; //O this.nota1 se refere ao atributo da classe, enquanto o nota1 sem this é o parâmetro recebido
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
// Método para calcular a média aritmética
    public double calcularMediaAritmetica() {
        return (nota1 + nota2 + nota3) / 3;
    }

// Método para calcular a média ponderada com pesos 2, 3 e 4 solicitados no exercício
    public double calcularMediaPonderada() {
        return (nota1 * 2 + nota2 * 3 + nota3 * 4) / (2 + 3 + 4); //Multipliquei cada nota pelo seu peso, somei tudo, e dividi pela soma dos pesos (9).
    }

// Método principal (main) para testar a classe
    public static void main(String[] args) {
        Avaliacao avaliacao = new Avaliacao(7.5, 8, 9); //Criei um objeto da classe Avaliacao com três notas: 7.5, 8, e 9
        //saída de dados no console:
        System.out.println("Média Aritmética: " + avaliacao.calcularMediaAritmetica());
        System.out.println("Média Ponderada: " + avaliacao.calcularMediaPonderada());
    }
}
