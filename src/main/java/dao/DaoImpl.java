package dao;

public class DaoImpl implements IDao {
    @Override
    public double getValue() {
        System.out.println("DaoImpl");
        return 5;
    }
}
