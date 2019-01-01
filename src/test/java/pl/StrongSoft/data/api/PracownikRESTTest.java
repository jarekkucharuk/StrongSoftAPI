package pl.StrongSoft.data.api;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import pl.StrongSoft.data.jpa.domain.Values;
import pl.StrongSoft.data.jpa.domain.entities.Pracownik;
import pl.StrongSoft.data.service.PracownikRepository;

import static org.mockito.Mockito.mock;

public class PracownikRESTTest {

    @InjectMocks
    private DBConnection dbConnection;
    @Mock
    private Pracownik pracownik;
    PracownikRepository pracownikRepository;
    PracownikREST pracownikREST;


    @Before
    public void setUp() {

        MockitoAnnotations.initMocks(this);

        pracownikRepository = mock(PracownikRepository.class);
//        pracownikREST = new PracownikREST(pracownikRepository);

    }

    @Test
    public void getPracownikList() throws Exception {
    }

    @Test
    public void getPracownik() throws Exception {
    }

    @Test
    public void getSum() throws Exception {

        PracownikREST pracownikREST = new PracownikREST();

        Values values = new Values();
        values.setValue1(3.412);
        values.setValue2(4.567);

        Assert.assertEquals(Double.valueOf(7.979), pracownikREST.getSum(values));
    }

    @Test
    public void savePracownik() throws Exception {
    }

}