package bill.longjun.dao;


import java.util.List;
import java.util.Map;

public interface IBillDao {
    List<Map<String, Object>> listYearBill(String year);
}
