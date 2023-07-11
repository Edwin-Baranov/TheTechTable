package com.edwinbaranov.thetechtable;

import androidx.annotation.NonNull;

public class Dish {
    final String title;
    final String description;
    final int price;

    Dish(String title, String description, int price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    @NonNull
    @Override
    public String toString() {
        return title;
    }
}
