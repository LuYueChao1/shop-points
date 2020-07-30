package practice;

import java.math.BigDecimal;
import java.util.List;

public class PromotionGoodsList extends GoodsList {
    private static final double moneyPointTransNum1 = 2.00;
    private static final double moneyPointTransNum2 = 1.00;

    public PromotionGoodsList(List<Goods> goodsList, double pointsCalculateBorde) {
        super(goodsList, pointsCalculateBorde);
    }

    @Override
    public int calculateGoodsListPoints() {
        if (this.getGoodsListMoney() > this.pointsCalculateBorder) {
            return (int)Math.floor(pointsCalculateBorder * moneyPointTransNum1)+ (int) Math.floor((this.getGoodsListMoney() - pointsCalculateBorder)*moneyPointTransNum2);
        } else {
            return (int) Math.floor(this.getGoodsListMoney() * moneyPointTransNum1);
        }
    }
}
