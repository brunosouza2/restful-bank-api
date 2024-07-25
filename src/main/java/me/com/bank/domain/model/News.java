package me.com.bank.domain.model;

import jakarta.persistence.Entity;

@Entity(name = "tab_news")
public class News extends BaseItem {

    public News() {
        super();
    }

    public News(Long id, String icon, String description) {
        super(id, icon, description);
    }

}
