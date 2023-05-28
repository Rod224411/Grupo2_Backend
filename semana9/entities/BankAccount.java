package pe.edu.upc.huaycosos.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "bankaccounts")
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBankAccount;
    @Column(name = "number",length = 50,nullable = false)
    private int number;
    @Column(name = "cvv",length = 50,nullable = false)
    private int cvv;
    @Column(name = "expiration",nullable = false)
    private LocalDate expiration;

    public BankAccount() {
    }

    public BankAccount(int idBankAccount, int number, int cvv, LocalDate expiration) {
        this.idBankAccount = idBankAccount;
        this.number = number;
        this.cvv = cvv;
        this.expiration = expiration;
    }

    public int getIdBankAccount() {
        return idBankAccount;
    }

    public void setIdBankAccount(int idBankAccount) {
        this.idBankAccount = idBankAccount;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public LocalDate getExpiration() {
        return expiration;
    }

    public void setExpiration(LocalDate expiration) {
        this.expiration = expiration;
    }
}
