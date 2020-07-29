package practice;

import java.util.ArrayList;
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
    public double getPromotionGoodsMoney(){
        return getPromotionGoodsList().stream().mapToDouble(Goods::getPayMoney).sum();
    }
    public double getBasicGoodsMoney(){
        return getBasicGoods().stream().mapToDouble(Goods::getPayMoney).sum();
    }
    public List<Goods> getPromotionGoodsList(){
        return  goodsList.stream().filter(goods -> promotionGoodsNameList.contains(goods.getGoodsName()))
                .collect(Collectors.toList());
    }
    public List<Goods> getBasicGoods(){
        return goodsList.stream().filter(goods -> !promotionGoodsNameList.contains(goods.getGoodsName()))
                .collect(Collectors.toList());
    }
    public int calculatePromotionGoodsPoints(){
        if(getPromotionGoodsMoney()>pointsCalculateBorder){
            return 1000*2+(int) Math.floor(getPromotionGoodsMoney()-1000);
        }else {
            return (int) Math.floor(getPromotionGoodsMoney())*2 ;
        }
    }
    public int calculateBasicGoodsPoints(double surplusMoneyBorder){
        if(surplusMoneyBorder<0){
            return (int)Math.floor(getBasicGoodsMoney()/20);
        }else {
            if(surplusMoneyBorder>getBasicGoodsMoney()){
                return (int)Math.floor(getBasicGoodsMoney());
            }else{
                return (int)Math.floor(surplusMoneyBorder+(getBasicGoodsMoney()-surplusMoneyBorder)/20);
            }
        }
    }
    public List<Goods> getGoodsList(){
        return goodsList;
    }
    public int calculatePoints(){
        int promotionPoints=calculatePromotionGoodsPoints();
        double surplusMoney=pointsCalculateBorder-getPromotionGoodsMoney();
        int basicPoints=calculateBasicGoodsPoints(surplusMoney);
        return promotionPoints+basicPoints;
    }
}
