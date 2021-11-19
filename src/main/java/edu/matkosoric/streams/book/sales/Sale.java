package edu.matkosoric.streams.book.sales;

import java.util.List;

public class Sale {

    private String customer;
    private List<Book> items;

    public Sale(String customer, List<Book> items) {
        this.customer = customer;
        this.items = items;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List<Book> getItems() {
        return items;
    }

    public void setItems(List<Book> items) {
        this.items = items;
    }


}

