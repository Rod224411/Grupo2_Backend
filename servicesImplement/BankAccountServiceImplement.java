package pe.edu.upc.semana9.servicesImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.semana9.entities.BankAccount;
import pe.edu.upc.semana9.repositories.IBankAccountRepository;
import pe.edu.upc.semana9.services.IBankAccountService;

import java.util.List;
@Service
public class BankAccountServiceImplement implements IBankAccountService {
    @Autowired
    private IBankAccountRepository bC;

    @Override
    public void insert(BankAccount bankAccount) {
        bC.save(bankAccount);
    }

    @Override
    public List<BankAccount> list() {
        return bC.findAll();
    }

    @Override
    public void delete(int idBankAccount) {
        bC.deleteById(idBankAccount);
    }

    @Override
    public BankAccount listId(int idBankAccount) {
        return bC.findById(idBankAccount).orElse(new BankAccount());
    }
}