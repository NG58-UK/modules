package uk.ng85.modules.persistence.jpa.test;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.*;
import uk.ng85.modules.persistence.api.model.RepositoryException;
import uk.ng85.modules.persistence.jpa.DefaultGenericRepository;
import uk.ng85.modules.persistence.jpa.test.model.entity.Employee;

@DisplayName("GenericEntityRepository Tests...")
@TestMethodOrder(MethodOrderer.MethodName.class)
public class DefaultGenericRepositoryTest {

    private static final String PERSISTENCE_UNIT = "default";

    private static DefaultGenericRepository genericRepository;

    @BeforeAll
    public static void setUp() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        genericRepository = new DefaultGenericRepository(entityManagerFactory.createEntityManager());
    }

    @Test
    @DisplayName("Create entity test")
    void createEntityTest() throws RepositoryException {

        String firstName = "FirstName";
        String lastName = "LastName";

        genericRepository.getEntityManager().getTransaction().begin();
        Integer id = genericRepository.create(Employee.builder().firstName(firstName).lastName(lastName).build());
        genericRepository.getEntityManager().getTransaction().commit();
        Assertions.assertNotNull(id);
    }

}