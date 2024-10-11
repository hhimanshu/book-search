package com.h2.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    private String title;
    private BigDecimal rating;
    private String description;
    private String language;
    private String isbn;
    private String bookFormat;
    private String edition;
    private Integer pages;
    private String publisher;
    private Date publishDate;
    private Date firstPublishDate;
    private BigDecimal likedPercent;
    private BigDecimal price;

    @Column(name = "search_vector", columnDefinition = "tsvector")
    private String searchVector;

    public Long getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public BigDecimal getRating() {
        return rating;
    }

    public String getDescription() {
        return description;
    }

    public String getLanguage() {
        return language;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getBookFormat() {
        return bookFormat;
    }

    public String getEdition() {
        return edition;
    }

    public Integer getPages() {
        return pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public Date getFirstPublishDate() {
        return firstPublishDate;
    }

    public BigDecimal getLikedPercent() {
        return likedPercent;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getSearchVector() {
        return searchVector;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", rating=" + rating +
                ", description='" + description + '\'' +
                ", language='" + language + '\'' +
                ", isbn='" + isbn + '\'' +
                ", bookFormat='" + bookFormat + '\'' +
                ", edition='" + edition + '\'' +
                ", pages=" + pages +
                ", publisher='" + publisher + '\'' +
                ", publishDate=" + publishDate +
                ", firstPublishDate=" + firstPublishDate +
                ", likedPercent=" + likedPercent +
                ", price=" + price +
                '}';
    }
}
