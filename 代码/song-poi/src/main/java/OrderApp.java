import domain.Vip;
import service.OrderService;
import utils.ExcelOperator;
import view.OrderView;


public class OrderApp {
    public static void main(String[] args) throws Exception{
        new OrderView().mainMenu();
        System.out.println("你已退出点餐系统...");
    }
}
