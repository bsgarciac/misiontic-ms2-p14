package com.misiontic.account_ms.models;
import java.util.Date;
import org.springframework.data.annotation.Id;

public class Account {
    @Id
    private String username;
    private Integer balance;
    private Date lastChange;

    public Account(String username, Integer balance, Date lastChange){
        this.username=username;
        this.balance = balance;
        this.lastChange = lastChange;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public Integer getBalance() {
        return balance;
    }
    public Date getLastChange() {
        return lastChange;
    }
    public void setBalance(Integer balance) {

        this.balance = balance;
    }
    public void setLastChange(Date lastChange) {
        this.lastChange = lastChange;
    }
}
