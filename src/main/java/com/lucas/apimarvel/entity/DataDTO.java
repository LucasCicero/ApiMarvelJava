package com.lucas.apimarvel.entity;

public class DataDTO {
    private int total;
    private CharacterResultDTO[] results;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public CharacterResultDTO[] getResults() {
        return results;
    }

    public void setResults(CharacterResultDTO[] results) {
        this.results = results;
    }

    public DataDTO() {
    }

    @Override
    public String toString() {
        return "DataDTO{" +
                "total=" + total +
                '}';
    }
}
