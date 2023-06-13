public class BanhoTosa implements Setor {
    private static BanhoTosa instancia = new BanhoTosa();

    private BanhoTosa() {}

    public static BanhoTosa getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "O Setor de Banho e Tosa vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "O Setor de Banho e Tosa agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "O Setor de Banho e Tosa vai analisar a sugestão: " + mensagem;
    }
}
