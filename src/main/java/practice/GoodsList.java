package practice;

import java.util.List;

public abstract class GoodsList {
    private List<Goods> goodsList;
    public double pointsCalculateBorder;

    public GoodsList(List<Goods> goodsList, double pointsCalculateBorde) {
        this.goodsList = goodsList;
        this.pointsCalculateBorder = pointsCalculateBorde;
    }

    public double getGoodsListMoney() {
        return this.goodsList.stream().mapToDouble(Goods::getPayMoney).sum();
    }

    public abstract int calculateGoodsListPoints();
}
