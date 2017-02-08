package com.je.travel.controller;

import com.je.travel.form.ResultForm;
import com.je.travel.form.api.UserApiForm;
import com.je.travel.service.ApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ApiController {

	@Autowired
	private ApiService apiService;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value="/api/add/chance", method=RequestMethod.POST)
	//@ResponseBody // 클래스가 @RestController로 선언 되었으므로 별도로 annotation을 추가하지 않아도 된다
	public ResultForm addChance(HttpServletRequest request, @RequestBody UserApiForm apiForm, Model model) {

		ResultForm result = new ResultForm();
        String name = "";
        try {
            name = apiService.searchUser(apiForm.getId());
        } catch (Exception e) {
            logger.error("Error occured~!!!");
        }

        result.setResult("name", name);
        return result;
	}

	@RequestMapping(value="/api/travel/main", method=RequestMethod.POST)
    public ResultForm travelMainInfo(HttpServletRequest request) {

	    ResultForm result = new ResultForm();



	    return result;
    }
}