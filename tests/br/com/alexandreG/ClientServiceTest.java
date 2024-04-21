/**
 * @author alexandre.gaia
 */

package br.com.alexandreG;

import br.com.alexandreG.DAO.ClientDAO;
import br.com.alexandreG.Mocks.ClientDAOMock;
import br.com.alexandreG.Service.ClientService;
import org.junit.Assert;
import org.junit.Test;

public class ClientServiceTest {

    @Test
    public void save_Test(){
        ClientDAOMock mock = new ClientDAOMock();
        ClientService service = new ClientService(mock);
        String response = service.save();
        Assert.assertEquals("Success!", response);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void saveTest_expectedError(){
        ClientDAO clientDAO = new ClientDAO();
        ClientService service = new ClientService(clientDAO);
        String response = service.save();
        Assert.assertEquals("Success!", response);
    }
}
