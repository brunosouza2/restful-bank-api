package me.com.bank.domain.model;

import java.util.Objects;
import java.util.Set;

public class User {

    private Long id;
    private String name;
    private Account account;
    private Set<Feature> feature;
    private Card card;
    private Set<News> news;

    public User(Long id, String name, Account account, Set<Feature> feature, Card card, Set<News> news) {
        this.id = id;
        this.name = name;
        this.account = account;
        this.feature = feature;
        this.card = card;
        this.news = news;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Set<Feature> getFeature() {
        return feature;
    }

    public void setFeature(Set<Feature> feature) {
        this.feature = feature;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Set<News> getNews() {
        return news;
    }

    public void setNews(Set<News> news) {
        this.news = news;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(getId(), user.getId()) && Objects.equals(getName(), user.getName()) && Objects.equals(getAccount(), user.getAccount()) && Objects.equals(getFeature(), user.getFeature()) && Objects.equals(getCard(), user.getCard()) && Objects.equals(getNews(), user.getNews());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAccount(), getFeature(), getCard(), getNews());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", account=" + account +
                ", feature=" + feature +
                ", card=" + card +
                ", news=" + news +
                '}';
    }
}
