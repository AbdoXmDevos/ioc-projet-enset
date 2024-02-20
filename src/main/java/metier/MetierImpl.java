package metier;

import dao.IDao;

public class MetierImpl implements IMetier{
    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    public MetierImpl() {
    }

    @Override
    public double calcul() {
        double data = dao.getData();
        double res = data * 23;
        return res;
    }

    public void setDao(IDao dao){
        this.dao = dao;
    }
}
