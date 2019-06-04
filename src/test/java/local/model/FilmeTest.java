package local.model;

import local.exception.FilmeException;
import local.service.LocacaoService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.validation.Valid;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

public class FilmeTest {
    //TODO: Nome deve possuir entre 2 e 99 caracteres (inclusive)
    // Lança FilmeException - O nome do filme deve possuir entre 2 e 99 caracteres

@Test
@DisplayName("Nome do filme em tamanho correto")
        public void nomeDoFilmeOk (){

        //Cenário
        String nomeFilme = "ETBilu";
        Filme filme = new Filme();
        //Ação
        filme.setNome(nomeFilme);
        //Validação
        assertEquals(filme.getNome(), nomeFilme);
}
    //TODO: Estoque não pode ser negativo, e o máximo é 99 (inclusive)
    // Lança FilmeException - Valor de estoque inválido
    @Test
    @DisplayName("Estoque Superior a 99")
    public void nomedoFilmeSuperior () throws FilmeException{

        int estoqueQtd = 100;

        //Cenário estoque > 99
        Filme filme = new Filme();

        //Ação
        filme.setEstoque(estoqueQtd);

        //Validação
        FilmeException ex = assertThrows(FilmeException.class,()-> filme.setEstoque(estoqueQtd));
        assertThat(ex.getMessage(),is("Valor de estoque inválido"));
    }


    //TODO: O preço de Locacao deverá ser um número positivo entre R$ 1,00 e R$ 9,99 (inclusive)
    // Lança FilmeException - Valor locação inválido



}
