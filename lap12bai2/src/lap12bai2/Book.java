/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap12bai2;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class Book implements Serializable {

    private static final long serialVersionUID = 1190476516911661470L;
    private String title;
    private String isbn;
    private double cost;

    public Book(String title, String isbn, double cost) {
        this.title = title;
        this.isbn = isbn;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "> " + this.title + " ($" + this.cost + ")";
    }

}
