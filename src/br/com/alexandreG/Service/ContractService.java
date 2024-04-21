/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Service;

import br.com.alexandreG.DAO.IContractDAO;

public class ContractService implements IContractService{

    private IContractDAO contractDAO;

    public ContractService(IContractDAO dao) {
        this.contractDAO = dao;
    }

    public String save(){
        contractDAO.save();
        return "Success!";
    }

    @Override
    public String search() {
        contractDAO.search();
        return "Client found!";
    }

    @Override
    public String delete() {
        contractDAO.delete();
        return "Client information deleted!";
    }

    @Override
    public String update() {
        contractDAO.update();
        return "Client information updated!";
    }
}
