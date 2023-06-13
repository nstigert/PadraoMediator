public class Pessoa {
    public String elogiarBanhoTosa(String mensagem) {
        return Ouvidoria.getInstancia().receberElogioBanhoTosa(mensagem);
    }

    public String reclamarBanhoTosa(String mensagem) {
        return Ouvidoria.getInstancia().receberReclamacaoBanhoTosa(mensagem);
    }

    public String sugerirBanhoTosa(String mensagem) {
        return Ouvidoria.getInstancia().receberSugestaoBanhoTosa(mensagem);
    }

    public String elogiarFarmacia(String mensagem) {
        return Ouvidoria.getInstancia().receberElogioFarmacia(mensagem);
    }

    public String reclamarFarmacia(String mensagem) {
        return Ouvidoria.getInstancia().receberReclamacaoFarmacia(mensagem);
    }

    public String sugerirFarmacia(String mensagem) {
        return Ouvidoria.getInstancia().receberSugestaoFarmacia(mensagem);
    }

    public String elogiarVendas(String mensagem) {
        return Ouvidoria.getInstancia().receberElogioVendas(mensagem);
    }

    public String reclamarVendas(String mensagem) {
        return Ouvidoria.getInstancia().receberReclamacaoVendas(mensagem);
    }

    public String sugerirVendas(String mensagem) {
        return Ouvidoria.getInstancia().receberSugestaoVendas(mensagem);
    }
}
