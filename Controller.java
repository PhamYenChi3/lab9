package bank.t2108a;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TransferQueue;

public class Controller {
    private static long balanceNumber = 1000000;
    List<TransactionHistory> listHistory = new ArrayList<TransactionHistory>();;
    public long getBalanceNumber(){
        return balanceNumber;
    }
    public static long transfer(long money){
        //kiểm tra nếu số tiền nhỏ hơn 50000 thì thông báo số tiền chuyển tối thiểu phải là 50000
        //nếu số tiền chuyển lớn hơn số dư thì thông báo tài khoản không đủ
        //nếu chuyển thành công thì thoog báo chuyển khoản thành công in ra số dư mới và thêm lịch sử dao dịch mới
        return balanceNumber;
    }
    public void actionTransfer(){
        //thực hiện cscs công việc như nhập số tài khoản thụ hưởng số tiền mô tả tại đây
        }
    public void getHistory(){
        //in danh sách lịch sử dao dịch
    }
    // định dạng số tiền theo mình mong muốn
    public static String formatMoney(long money){
        DecimalFormat formatter = new DecimalFormat("###,###,##0.00");
        //100000->100000.00
        return formatter.format(money);
    }
}
