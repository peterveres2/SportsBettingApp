package Model.Builders;

import Model.Currency;
import Model.Player;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PlayerBuilder {
    String name;
    LocalDate birth;
    Currency currency;
    BigDecimal balance;
    String email;
    String password;

    public PlayerBuilder() {
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public PlayerBuilder setName(String name){
        this.name = name;
        return this;
    }

    public PlayerBuilder setBirthDate(LocalDate birth){
        this.birth = birth;
        return this;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public PlayerBuilder setCurrency(Currency currency){
        this.currency = currency;
        return this;
    }

    public PlayerBuilder setEmail(String email){
        this.email = email;
        return this;
    }

    public PlayerBuilder setPassword(String password){
        this.password = password;
        return this;
    }

    public PlayerBuilder setBalance(BigDecimal balance){
        this.balance = balance;
        return this;
    }

    public Player getPlayer(){
        return new Player(this);
    }
}