package practice;

import java.util.List;

public class BasicGoodsList extends GoodsList {
    public BasicGoodsList(List<Goods> goodsList, double pointsCalculateBorde) {
        super(goodsList, pointsCalculateBorde);
    }
    @Override
    public int calculateGoodsListPoints() {
        if(this.pointsCalculateBorder<0){
            return (int)Math.floor(getGoodsListMoney()/20);
        }
        if(pointsCalculateBorder>getGoodsListMoney()){
            return (int)Math.floor(getGoodsListMoney());
        }
        return (int)Math.floor(pointsCalculateBorder+(getGoodsListMoney()-pointsCalculateBorder)/20);
    }
}
