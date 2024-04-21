/**
 * @author alexandre.gaia
 */

package br.com.alexandreG;

import br.com.alexandreG.DAO.ContractDAO;
import br.com.alexandreG.DAO.IContractDAO;
import br.com.alexandreG.Mocks.ContractDAOMock;
import br.com.alexandreG.Service.ContractService;
import br.com.alexandreG.Service.IContractService;
import org.junit.Assert;
import org.junit.Test;

public class ContractServiceTest {

    @Test
    public void saveTest(){
        IContractDAO dao = new ContractDAOMock();
        IContractService service = new ContractService(dao);
        String response = service.save();
        Assert.assertEquals("Success!", response);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void saveTest_expectedError(){
        IContractDAO dao = new ContractDAO();
        IContractService service = new ContractService(dao);
        String response = service.save();
        Assert.assertEquals("Success!", response);
    }

    @Test
    public void searchTest(){
        IContractDAO dao = new ContractDAOMock();
        IContractService service = new ContractService(dao);
        String response = service.search();
        Assert.assertEquals("Client found!", response);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void searchTest_expectedError(){
        IContractDAO dao = new ContractDAO();
        IContractService service = new ContractService(dao);
        String response = service.save();
        Assert.assertEquals("Client found!", response);
    }

    @Test
    public void deleteTest(){
        IContractDAO dao = new ContractDAOMock();
        IContractService service = new ContractService(dao);
        String response = service.delete();
        Assert.assertEquals("Client information deleted!", response);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void deleteTest_expectedError(){
        IContractDAO dao = new ContractDAO();
        IContractService service = new ContractService(dao);
        String response = service.delete();
        Assert.assertEquals("Client information deleted!", response);
    }

    @Test
    public void updateTest(){
        IContractDAO dao = new ContractDAOMock();
        IContractService service = new ContractService(dao);
        String response = service.update();
        Assert.assertEquals("Client information updated!", response);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void updateTest_expectedError(){
        IContractDAO dao = new ContractDAO();
        IContractService service = new ContractService(dao);
        String response = service.update();
        Assert.assertEquals("Client information updated!", response);
    }

}
