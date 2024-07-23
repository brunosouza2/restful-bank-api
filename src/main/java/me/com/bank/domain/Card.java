package me.com.bank.domain;

import java.math.BigDecimal;
import java.util.Objects;

public class Card {

    private String number;
    private BigDecimal limit;

    public Card(String number, BigDecimal limit) {
        this.number = number;
        this.limit = limit;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card card)) return false;
        return Objects.equals(getNumber(), card.getNumber()) && Objects.equals(getLimit(), card.getLimit());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber(), getLimit());
    }

    @Override
    public String toString() {
        return "Card{" +
                "number='" + number + '\'' +
                ", limit=" + limit +
                '}';
    }
}
