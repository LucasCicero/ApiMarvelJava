package com.lucas.apimarvel.entity;

public class CharacterResultDTO {
    private Integer id;
    private String name;
    private String description;
    private String resourceURI;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public CharacterResultDTO() {
    }

    @Override
    public String toString() {
        return "CharacterResultDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", resourceURI='" + resourceURI + '\'' +
                '}';


    }
}
