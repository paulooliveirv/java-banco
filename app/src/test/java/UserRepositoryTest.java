
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import persistent.bank.User;
import persistent.bank.UserRepository;

public class UserRepositoryTest {
    @DisplayName("Teste de fumaça: Deve executar a inserção de uma usuario com sucesso")
    @Test void sucessfullInsert() {
        UserRepository repository = new UserRepository();
        
        User user = new User();
        user.setName("Garry");
        user.setEmail("garry@calindra.com");
        user.setPhone("332223354");

        User persistanteOperation = repository.save(user);
        Assertions.assertNotNull(persistanteOperation.getId());
        Assertions.assertEquals("Garry", persistanteOperation.getName());

    }
}
