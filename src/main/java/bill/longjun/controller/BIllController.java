package bill.longjun.controller;

import bill.longjun.service.IBillService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/bill")
public class BIllController {
    @Resource
    private IBillService iBillService;

    @RequestMapping("/getYearBill")
    @ResponseBody
    public Map<String, Object> getYearBill(@RequestBody Map<String, Object> map){
        Map<String, Object> result = new HashMap<String, Object>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String thisYear  = sdf.format(new Date());
        String year = map.containsKey("year")? String.valueOf(map.get("year")) : thisYear;
        result = iBillService.getYearBill(year);
        return  result;
    }

    private  void  steel(){
        System.out.println("≤‚ ‘“ªœ¬");
    }
}
