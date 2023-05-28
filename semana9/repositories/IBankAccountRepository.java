package pe.edu.upc.huaycosos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.huaycosos.entities.BankAccount;

@Repository
public interface IBankAccountRepository extends JpaRepository<BankAccount,Integer> {
}
