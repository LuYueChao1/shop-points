package practice;

import java.util.List;

public class PromotionGoodsList extends GoodsList {

    public PromotionGoodsList(List<Goods> goodsList, double pointsCalculateBorde) {
        super(goodsList, pointsCalculateBorde);
    }

    @Override
    public int calculateGoodsListPoints(){
        if(this.getGoodsListMoney()>this.pointsCalculateBorder){
            return (int) pointsCalculateBorder*2+(int) Math.floor(this.getGoodsListMoney()-pointsCalculateBorder);
        }else {
            return (int) Math.floor(this.getGoodsListMoney())*2 ;
        }
    }
}
