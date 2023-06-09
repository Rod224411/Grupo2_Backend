package pe.edu.upc.semana9.services;

import pe.edu.upc.semana9.entities.BankAccount;
import java.util.List;
public interface IBankAccountService {
    public void insert(BankAccount bankAccount);
    List<BankAccount> list();
    public void delete(int idBankAccount);
    public BankAccount listId(int idBankAccount);
}