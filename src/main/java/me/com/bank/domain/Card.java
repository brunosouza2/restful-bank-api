package me.com.bank.domain;

import java.math.BigDecimal;
import java.util.Objects;

public class Card {

    private Long id;
    private String number;
    private BigDecimal limit;

    public Card(Long id, String number, BigDecimal limit) {
        this.id = id;
        this.number = number;
        this.limit = limit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return Objects.equals(getId(), card.getId()) && Objects.equals(getNumber(), card.getNumber()) && Objects.equals(getLimit(), card.getLimit());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNumber(), getLimit());
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", limit=" + limit +
                '}';
    }
}
