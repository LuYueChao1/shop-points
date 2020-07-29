package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PointsCalculator {
    private List<Goods> goodsList;
    private List<GoodsName> promotionGoodsNameList= Arrays.asList(GoodsName.APPLE,GoodsName.WATERMELON,GoodsName.BEEF);
    public PointsCalculator(List<Goods> goodsList){
        this.goodsList=goodsList;
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
        return (int)Math.floor(getPromotionGoodsList().stream().mapToDouble(Goods::getPayMoney).sum())*2;
    }
    public int calculateBasicGoodsPoints(){
        return (int)Math.floor(getBasicGoods().stream().mapToDouble(Goods::getPayMoney).sum());
    }
    public List<Goods> getGoodsList(){
        return goodsList;
    }
    public int calculatePoints(){
        return calculateBasicGoodsPoints()+calculatePromotionGoodsPoints();
    }
}
