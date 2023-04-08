package com.neusoft.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.ServiceInstance;

import com.neusoft.feign.FoodFeignClient;
import com.neusoft.po.Business;
import com.neusoft.po.CommonResult;
import com.neusoft.po.Food;
import com.neusoft.service.BusinessService;

@RestController
@RequestMapping("/BusinessController")
@RefreshScope
public class BusinessController {

	@Autowired
	private BusinessService businessService;

	@Autowired
	private FoodFeignClient foodFeignClient;
	@Value("${eureka.instance.lease-renewal-interval-in-seconds}")
	private int renewal;
	@Value("${eureka.instance.lease-expiration-duration-in-seconds}")
	private int expiration;
	

	@GetMapping("/listBusinessByOrderTypeId/{orderTypeId}")
	public CommonResult<List> listBusinessByOrderTypeId(@PathVariable("orderTypeId") Integer orderTypeId)
			throws Exception {
		System.out.println(renewal);
		System.out.println(expiration);
		List<Business> list = businessService.listBusinessByOrderTypeId(orderTypeId);
		return new CommonResult(200, "success(10301)", list);
	}

	@RequestMapping("/getBusinessById/{businessId}")
	public CommonResult<Business> getBusinessById(@PathVariable("businessId") Integer businessId) throws Exception {
		

		Business business = businessService.getBusinessById(businessId);

		// 使用DiscoveryClient获取元数据，主机地址与端口就可以不硬编码了
		CommonResult<List> result = foodFeignClient.listFoodByBusinessId(businessId);
		//如果食品微服务返回降级响应，那么就返回空集合
		 if (result.getCode() == 200) {
		 business.setFoodList(result.getResult());
		 }
		 else {
		 business.setFoodList(new ArrayList());
		 }
		return new CommonResult(200, "success", business);
	}
}