package myspring.dao;

import myspring.model.Blydo;

import java.util.List;

public interface BlydoDao {
    public void addBlydo(Blydo blydo);

    public void updateBlydo(Blydo blydo);

    public void removeBlydo(int id);

    public Blydo getBlydoById(int id);

    public List<Blydo> listBlyd();
}