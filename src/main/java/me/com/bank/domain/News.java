package me.com.bank.domain;

import java.util.Objects;

public class News {

    private Long id;
    private String icon;
    private String description;

    public News(Long id, String icon, String description) {
        this.id = id;
        this.icon = icon;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof News news)) return false;
        return Objects.equals(getId(), news.getId()) && Objects.equals(getIcon(), news.getIcon()) && Objects.equals(getDescription(), news.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getIcon(), getDescription());
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", icon='" + icon + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
