public class Ouvidoria {
    private static Ouvidoria instancia = new Ouvidoria();

    private Ouvidoria() {}

    public static Ouvidoria getInstancia() {
        return instancia;
    }

    public String receberElogioBanhoTosa(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "O Setor de Banho e Tosa responderá sua demanda conforme mensagem a seguir.\n" +
                ">>" + BanhoTosa.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoBanhoTosa(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "O Setor de Banho e Tosa responderá sua demanda conforme mensagem a seguir.\n" +
                ">>" + BanhoTosa.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoBanhoTosa(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "O Setor de Banho e Tosa responderá sua demanda conforme mensagem a seguir.\n" +
                ">>" + BanhoTosa.getInstancia().receberSugestao(mensagem);
    }

    public String receberElogioFarmacia(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "O Setor de Farmácia responderá sua demanda conforme mensagem a seguir.\n" +
                ">>" + Farmacia.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoFarmacia(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "O Setor de Farmácia responderá sua demanda conforme mensagem a seguir.\n" +
                ">>" + Farmacia.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoFarmacia(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "O Setor de Farmácia responderá sua demanda conforme mensagem a seguir.\n" +
                ">>" + Farmacia.getInstancia().receberSugestao(mensagem);
    }

    public String receberElogioVendas(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "O Setor de Vendas responderá sua demanda conforme mensagem a seguir.\n" +
                ">>" + Vendas.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoVendas(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "O Setor de Vendas responderá sua demanda conforme mensagem a seguir.\n" +
                ">>" + Vendas.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoVendas(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "O Setor de Vendas responderá sua demanda conforme mensagem a seguir.\n" +
                ">>" + Vendas.getInstancia().receberSugestao(mensagem);
    }
}
