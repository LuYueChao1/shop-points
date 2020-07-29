package practice;

import org.junit.Test;
import practice.Goods;
import practice.PointsCaculator;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PointsCaculatorTest {

    @Test
    public void should_get_one_hundred_points_when_buy_goods_of_one_hundred(){
        //given
        Goods goodsFifty=new Goods(50.0);
        Goods goodsSeventy=new Goods(70.6);
        List<Goods> goodsBuy=new ArrayList<>();
        goodsBuy.add(goodsFifty);
        goodsBuy.add(goodsSeventy);
        PointsCaculator pointsCaculator=new PointsCaculator(goodsBuy);
        //when
        int points=pointsCaculator.caculatePoints();
        //then
        assertEquals(120,points);

    }

}
