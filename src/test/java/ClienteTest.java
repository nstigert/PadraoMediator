import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void deveElogiarBanhoTosa() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\n" +
                        "O Setor de Banho e Tosa responderá sua demanda conforme mensagem a seguir.\n" +
                        ">>O Setor de Banho e Tosa agradece a mensagem: Ótimo cuidado com a doguinha",
                cliente.elogiarBanhoTosa("Ótimo cuidado com a doguinha"));
    }

    @Test
    void deveReclamarBanhoTosa() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\n" +
                        "O Setor de Banho e Tosa responderá sua demanda conforme mensagem a seguir.\n" +
                        ">>O Setor de Banho e Tosa vai procurar melhorar o serviço da reclamação: Não tosou direito as patinha",
                cliente.reclamarBanhoTosa("Não tosou direito as patinha"));
    }

    @Test
    void deveSugerirBanhoTosa() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\n" +
                        "O Setor de Banho e Tosa responderá sua demanda conforme mensagem a seguir.\n" +
                        ">>O Setor de Banho e Tosa vai analisar a sugestão: Perguntar se quer ou não perfume",
                cliente.sugerirBanhoTosa("Perguntar se quer ou não perfume"));
    }
    @Test
    void deveElogiarFarmacia() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\n" +
                        "O Setor de Farmácia responderá sua demanda conforme mensagem a seguir.\n" +
                        ">>O Setor de Farmácia agradece a mensagem: Ótimo atendimento",
                cliente.elogiarFarmacia("Ótimo atendimento"));
    }

    @Test
    void deveReclamarFarmacia() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\n" +
                        "O Setor de Farmácia responderá sua demanda conforme mensagem a seguir.\n" +
                        ">>O Setor de Farmácia vai procurar melhorar o serviço da reclamação: Vendeu remédio vencido",
                cliente.reclamarFarmacia("Vendeu remédio vencido"));
    }

    @Test
    void deveSugerirFarmacia() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\n" +
                        "O Setor de Farmácia responderá sua demanda conforme mensagem a seguir.\n" +
                        ">>O Setor de Farmácia vai analisar a sugestão: Vender unidades de comprimidos",
                cliente.sugerirFarmacia("Vender unidades de comprimidos"));
    }
    @Test
    void deveElogiarVendas() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\n" +
                        "O Setor de Vendas responderá sua demanda conforme mensagem a seguir.\n" +
                        ">>O Setor de Vendas agradece a mensagem: Produtos de qualidade",
                cliente.elogiarVendas("Produtos de qualidade"));
    }

    @Test
    void deveReclamarVendas() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\n" +
                        "O Setor de Vendas responderá sua demanda conforme mensagem a seguir.\n" +
                        ">>O Setor de Vendas vai procurar melhorar o serviço da reclamação: Produto veio violado",
                cliente.reclamarVendas("Produto veio violado"));
    }

    @Test
    void deveSugerirVendas() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\n" +
                        "O Setor de Vendas responderá sua demanda conforme mensagem a seguir.\n" +
                        ">>O Setor de Vendas vai analisar a sugestão: Frete grátis para valores altos",
                cliente.sugerirVendas("Frete grátis para valores altos"));
    }

}