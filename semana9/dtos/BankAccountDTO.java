package pe.edu.upc.huaycosos.dtos;

import java.time.LocalDate;

public class BankAccountDTO {
    private int idBankAccount;
    private int number;
    private int cvv;
    private LocalDate expiration;

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
