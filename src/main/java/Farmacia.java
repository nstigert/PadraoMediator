public class Farmacia implements Setor {
    private static Farmacia instancia = new Farmacia();

    private Farmacia() {}

    public static Farmacia getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "O Setor de Farmácia vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "O Setor de Farmácia agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "O Setor de Farmácia vai analisar a sugestão: " + mensagem;
    }
}
