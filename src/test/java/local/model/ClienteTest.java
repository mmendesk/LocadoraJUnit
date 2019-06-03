package local.model;

import local.exception.ClienteException;
import local.exception.LocadoraException;
import local.service.LocacaoService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Fail.fail;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class ClienteTest extends Throwable {

    //TODO: O nome não pode ser nulo.
    // Lança ClienteException -  Nome é um campo obrigatório
    @Test
    @DisplayName("Nome não pode ser nulo!!")
    public void nomeNaoPodeSerNulo() throws ClienteException {
        String nome = null;

        if (nome == null){
            throw new ClienteException("Impossível usuário nulo");
        } else if(nome != null){
            throw new ClienteException("Sucesso!! Usuário não é nulo");
        }
    }

    //TODO: nome deve possuir entre 4 e 55 caracteres (inclusive).
    // Lança ClienteException - O nome do cliente deve possuir entre 4 e 55 caracteres

    //TODO: O nome do cadastro deve possuir pelo menos 2 nomes.
    // Lança ClienteException -  necessário adicionar um sobrenome (ex.: Angelo Luz)

    //TODO: Espaços no início e fim de nomes devem ser descartados

    //TODO: Nomes não devem possuir símbolos ou números.
    // Lança ClienteException - Números e símbolos não são permitidos



}
