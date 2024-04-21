/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Service;

import br.com.alexandreG.DAO.ClientDAO;
import br.com.alexandreG.DAO.IClientDAO;


public class ClientService {

    private IClientDAO clientDAO;

    public ClientService(IClientDAO clientDAO) {
        //clientDAO = new ClientDAO();
        this.clientDAO = clientDAO;
    }

    public String save(){
        clientDAO.save();
        return "Success!";
    }
}
