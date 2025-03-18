package dao;

public class DaoImplV2 implements IDao {
    @Override
    public double getValue() {
        System.out.println("DaoImplV2");
        return 10;
    }
}
