package bill.longjun.service;

import bill.longjun.dao.IBillDao;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("IBillService")
public class BillServiceImpl implements  IBillService{
    @Resource
    IBillDao iBillDao;

    public Map<String, Object> getYearBill(String year){
        Map<String, Object> result = new HashMap<String, Object>();
        List<Integer> listTime = new ArrayList<Integer>();
        List<Double> listMoney = new ArrayList<Double>();
        for(int i= 0; i < 12; i++){
            listTime.add(i);
            listMoney.add(0d);
        }
        List<Map<String, Object>> list =  iBillDao.listYearBill(year);
        for(Map<String,Object> monthMoney : list){
            int month = Integer.valueOf(monthMoney.get("collect_time").toString().substring(4));
            Double money = Double.valueOf(monthMoney.get("money_month").toString());
            listMoney.set(month - 1, money);
        }
        result.put("monthList",listTime);
        result.put("listMoney",listMoney);
        return result;
    }

}
