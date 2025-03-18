package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    public double calcule() {
        double value = dao.getValue();
        return value*6/6;
    }
}
