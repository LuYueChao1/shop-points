package practice;

import java.util.List;

public class BasicGoodsList extends GoodsList {
    private static final double moneyPointTransNum1 = 1.00;
    private static final double moneyPointTransNum2 = 0.05;

    public BasicGoodsList(List<Goods> goodsList, double pointsCalculateBorde) {
        super(goodsList, pointsCalculateBorde);
    }

    @Override
    public int calculateGoodsListPoints() {
        if (this.pointsCalculateBorder < 0) {
            return (int) Math.floor(getGoodsListMoney() * moneyPointTransNum2);
        }
        if (pointsCalculateBorder > getGoodsListMoney()) {
            return (int) Math.floor(getGoodsListMoney() * moneyPointTransNum1);
        }
        return (int) Math.floor(pointsCalculateBorder * moneyPointTransNum1 + (getGoodsListMoney() - pointsCalculateBorder) * moneyPointTransNum2);
    }
}
