public class Vendas implements Setor {
    private static Vendas instancia = new Vendas();

    private Vendas() {}

    public static Vendas getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "O Setor de Vendas vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "O Setor de Vendas agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "O Setor de Vendas vai analisar a sugestão: " + mensagem;
    }
}
