package me.com.bank.domain.model;

import java.util.Objects;

public class Feature {

    private Long id;
    private String icon;
    private String description;

    public Feature(Long id, String icon, String description) {
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
        if (!(o instanceof Feature feature)) return false;
        return Objects.equals(id, feature.id) && Objects.equals(getIcon(), feature.getIcon()) && Objects.equals(getDescription(), feature.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getIcon(), getDescription());
    }

    @Override
    public String toString() {
        return "Feature{" +
                "id=" + id +
                ", icon='" + icon + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
