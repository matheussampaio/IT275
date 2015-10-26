package edu.ilstu.it275.lab04.msanto2;

/**
 * The Class Book.
 */
public class Book {

    /** The sale tax constant. */
    final double SALE_TAX = 1.07;

    /** The book title. */
    String bookTitle;

    /** The book price. */
    double bookPrice;

    /**
     * Instantiates a new book.
     *
     * @param title the title of the book
     * @param price the price of the book
     */
    public Book(String title, double price) {
        bookTitle = title;
        bookPrice = price;
    }

    /**
     * Increase price of the book.
     *
     * @param percentage the percentage to be increased
     */
    void increasePrice(double percentage) {
        bookPrice *= 1 + percentage;
    }

    /**
     * Calculate total sales.
     *
     * @param booksSold the books sold
     * @return the sales amount
     */
    double calculateSales(int booksSold) {
        return bookPrice * booksSold;
    }

    /**
     * Gets the book title.
     *
     * @return the book title
     */
    public String getBookTitle() {
        return bookTitle;
    }

    /**
     * Sets the book title.
     *
     * @param bookTitle the new book title
     */
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    /**
     * Gets the book price.
     *
     * @return the book price
     */
    public double getBookPrice() {
        return bookPrice;
    }

    /**
     * Sets the book price.
     *
     * @param bookPrice the new book price
     */
    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    /**
     * Gets the sale tax.
     *
     * @return the sale tax
     */
    public double getSaleTaX() {
        return SALE_TAX;
    }

}
