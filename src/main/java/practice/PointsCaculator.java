package practice;

import java.util.List;

public class PointsCaculator {
    private List<Goods> goodsList;
    public PointsCaculator(List<Goods> goodsList){
        this.goodsList=goodsList;
    }

    public List<Goods> getGoodsList(){
        return goodsList;
    }
    public int caculatePoints(){
        return (int)Math.floor(goodsList.stream().mapToDouble(Goods::getPayMoney).sum());
    }
}
