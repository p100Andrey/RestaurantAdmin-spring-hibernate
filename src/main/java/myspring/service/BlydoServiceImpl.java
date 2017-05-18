package myspring.service;

import myspring.dao.BlydoDao;
import myspring.model.Blydo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BlydoServiceImpl implements BlydoService {
    private BlydoDao blydoDao;

    public void setBlydoDao(BlydoDao blydoDao) {
        this.blydoDao = blydoDao;
    }

    @Override
    @Transactional
    public void addBlydo(Blydo blydo) {
        this.blydoDao.addBlydo(blydo);
    }

    @Override
    @Transactional
    public void updateBlydo(Blydo blydo) {
        this.blydoDao.updateBlydo(blydo);
    }

    @Override
    @Transactional
    public void removeBlydo(int id) {
        this.blydoDao.removeBlydo(id);
    }

    @Override
    @Transactional
    public Blydo getBlydoById(int id) {
        return this.blydoDao.getBlydoById(id);
    }

    @Override
    @Transactional
    public List<Blydo> listBlyd() {
        return this.blydoDao.listBlyd();
    }
}
