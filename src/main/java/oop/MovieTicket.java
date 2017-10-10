package oop;

import java.util.Date;

public class MovieTicket extends AbstractTicket {

    private Integer cinemaHall;
    private String movieName;
    private Integer row;
    private Date movieDate;
    private Date dateOfSale;
    private String salesManager;

    public MovieTicket(int i, String s, int i1, String s1, Date parse, Date date, double v, String s2, String zaharchenko) {
    }

    public MovieTicket(Integer cinemaHall, String movieName, Integer row, Date movieDate, Date dateOfSale, String salesManager) {
        this.cinemaHall = cinemaHall;
        this.movieName = movieName;
        this.row = row;
        this.movieDate = movieDate;
        this.dateOfSale = dateOfSale;
        this.salesManager = salesManager;
    }

    public Integer getCinemaHall() {
        return cinemaHall;
    }

    public void setCinemaHall(Integer cinemaHall) {
        this.cinemaHall = cinemaHall;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Date getMovieDate() {
        return movieDate;
    }

    public void setMovieDate(Date movieDate) {
        this.movieDate = movieDate;
    }

    public Date getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(Date dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public String getSalesManager() {
        return salesManager;
    }

    public void setSalesManager(String salesManager) {
        this.salesManager = salesManager;
    }

    @Override
    public String toString() {
        return "MovieTicket{" +
                "cinemaHall=" + cinemaHall +
                ", movieName='" + movieName + '\'' +
                ", row=" + row +
                ", movieDate=" + movieDate +
                ", dateOfSale=" + dateOfSale +
                ", salesManager='" + salesManager + '\'' +
                ", price=" + price +
                ", number='" + number + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println(toString());
    }
}
