package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PointsCalculator {
    private List<Goods> goodsList;
    private List<GoodsName> promotionGoodsNameList= Arrays.asList(GoodsName.APPLE,GoodsName.WATERMELON,GoodsName.BEEF,GoodsName.TV);
    private double pointsCalculateBorder=1000;
    public PointsCalculator(List<Goods> goodsList){
        this.goodsList=goodsList;
    }

    public List<Goods> getPromotionGoodsList(){
        return  goodsList.stream().filter(goods -> promotionGoodsNameList.contains(goods.getGoodsName()))
                .collect(Collectors.toList());
    }
    public List<Goods> getBasicGoodsList(){
        return goodsList.stream().filter(goods -> !promotionGoodsNameList.contains(goods.getGoodsName()))
                .collect(Collectors.toList());
    }

    public List<Goods> getGoodsList(){
        return goodsList;
    }
    public int calculatePoints(){
        GoodsList promotionGoodsList=new PromotionGoodsList(getPromotionGoodsList(),pointsCalculateBorder);
        double surplusMoney=pointsCalculateBorder-promotionGoodsList.getGoodsListMoney();
        GoodsList basicGoodsList=new BasicGoodsList(getBasicGoodsList(),surplusMoney);
        return promotionGoodsList.calculateGoodsListPoints()+basicGoodsList.calculateGoodsListPoints();
    }
}
