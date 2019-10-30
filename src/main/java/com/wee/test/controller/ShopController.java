package com.wee.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wee.test.dto.ReportDto;
import com.wee.test.entity.Shop;
import com.wee.test.service.ShopService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("Shop CRUD controller")
@RestController
public class ShopController {


    @Autowired
    private ShopService service;

    @ApiOperation("Return all shops")
    @RequestMapping(path = "/data", method = RequestMethod.GET)
    public List<Shop> get(@RequestParam(required = false) String id) {
        return service.getAllShop(id);
    }

    @RequestMapping(path = "/data", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Shop updateCreate(@RequestParam(required = false) String id, @RequestBody Shop shop) {
       return service.updateCreate(id, shop);
    }

    @RequestMapping(path = "/data/delete", method = RequestMethod.POST)
    public String delete(@RequestParam String id) {
        return service.delete(id);
    }

    @RequestMapping(path = "/report", method = RequestMethod.POST)
    public ReportDto report(@RequestParam(required = false) String id) {
        return service.report(id);
    }
   
}
