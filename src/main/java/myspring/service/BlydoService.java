package myspring.service;

import myspring.model.Blydo;

import java.util.List;

public interface BlydoService {
    public void addBlydo(Blydo blydo);

    public void updateBlydo(Blydo blydo);

    public void removeBlydo(int id);

    public Blydo getBlydoById(int id);

    public List<Blydo> listBlyd();
}
