package myspring.model;

import javax.persistence.*;

@Entity
@Table(name = "blydo")
public class Blydo {
    @Id
    @Column(name = "idblydo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idblydo;

    @Column(name = "nazvanie")
    private String nazvanie;

    @Column(name = "kategoriya")
    private String kategoriya;

    @Column(name = "stoimost")
    private double stoimost;

    @Column(name = "ves")
    private double ves;

    public int getIdblydo() {
        return idblydo;
    }

    public void setIdblydo(int idblydo) {
        this.idblydo = idblydo;
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    public String getKategoriya() {
        return kategoriya;
    }

    public void setKategoriya(String kategoriya) {
        this.kategoriya = kategoriya;
    }

    public double getStoimost() {
        return stoimost;
    }

    public void setStoimost(double stoimost) {
        this.stoimost = stoimost;
    }

    public double getVes() {
        return ves;
    }

    public void setVes(double ves) {
        this.ves = ves;
    }
}
