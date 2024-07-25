package me.com.bank.domain.model.dto;

import me.com.bank.domain.model.Account;
import me.com.bank.domain.model.Card;
import me.com.bank.domain.model.Feature;
import me.com.bank.domain.model.News;

import java.util.Set;

public class UserResponseDto {

    private Long id;
    private String name;
    private Account account;
    private Set<Feature> feature;
    private Card card;
    private Set<News> news;

    public UserResponseDto(Long id, String name, Account account, Set<Feature> feature, Card card, Set<News> news) {
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
}
