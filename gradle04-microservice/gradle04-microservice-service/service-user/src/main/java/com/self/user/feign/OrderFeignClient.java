package com.self.user.feign;

import com.self.bean.OrderInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient(value = "service-order")
public interface OrderFeignClient {

    @GetMapping("/order/info/{id}")
    public List<OrderInfo> getOrderList(@PathVariable("id") Integer id);
}
