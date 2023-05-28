package pe.edu.upc.huaycosos.services;
import pe.edu.upc.huaycosos.entities.BankAccount;

import java.util.List;
public interface IBankAccountService {
    public void insert(BankAccount bankAccount);
    List<BankAccount> list();
    public void delete(int idBankAccount);
    public BankAccount listId(int idBankAccount);
}
