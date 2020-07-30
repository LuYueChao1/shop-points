package practice;

public class Goods {
    private Double payMoney;
    private GoodsName goodsName;

    public Goods(Double payMoney, GoodsName goodsName) {
        this.payMoney = payMoney;
        this.goodsName = goodsName;
    }

    public Double getPayMoney() {
        return this.payMoney;
    }

    public GoodsName getGoodsName() {
        return this.goodsName;
    }
}
