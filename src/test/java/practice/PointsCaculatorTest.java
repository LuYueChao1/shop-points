package practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PointsCaculatorTest {
    @Test
    public void should_get_one_hundred_points_when_buy_goods_of_one_hundred(){
        //given
        Goods goodsFifty=new Goods(50.0,GoodsName.WASHLIQUID);
        Goods goodsSeventy=new Goods(70.6,GoodsName.TSHIRT);
        List<Goods> goodsBuy=new ArrayList<>();
        goodsBuy.add(goodsFifty);
        goodsBuy.add(goodsSeventy);
        PointsCalculator pointsCaculator=new PointsCalculator(goodsBuy);
        //when
        int points=pointsCaculator.calculatePoints();
        //then
        assertEquals(120,points);
    }

    @Test
    public void shoul_get_right_points_when_buy_promotion_goods_and_basic_goods(){
        //given
        Goods goodsApple=new Goods(10.00,GoodsName.APPLE);
        Goods goodsWatermelon=new Goods(30.00,GoodsName.WATERMELON);
        Goods goodsBeef=new Goods(20.00,GoodsName.WASHLIQUID);
        List<Goods> goodsBuy= Arrays.asList(goodsApple,goodsWatermelon,goodsBeef);
        PointsCalculator pointsCalculator=new PointsCalculator(goodsBuy);
        //when
        int points=pointsCalculator.calculatePoints();
        //then
        assertEquals(100,points);
    }

}
