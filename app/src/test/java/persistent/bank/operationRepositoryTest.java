package persistent.bank;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class operationRepositoryTest {

    @DisplayName("Teste de fumaça: Deve executar a inserção de uma operação com sucesso")
    @Test void sucessfullInsert() {
        OperationRepository repository = new OperationRepository();
        Operation persistanteOperation = repository.save(new Operation());
        Assertions.assertNotNull(persistanteOperation.getId());

    }
}
