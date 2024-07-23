package me.com.bank.domain;

import java.util.Objects;

public class Feature {

    private String icon;
    private String description;

    public Feature(String icon, String description) {
        this.icon = icon;
        this.description = description;
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
        return Objects.equals(getIcon(), feature.getIcon()) && Objects.equals(getDescription(), feature.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIcon(), getDescription());
    }

    @Override
    public String toString() {
        return "Feature{" +
                "icon='" + icon + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
