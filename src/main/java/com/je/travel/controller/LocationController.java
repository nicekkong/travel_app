/*****************************************************************************
 * PROJECT NAME   : JEWebApp
 * SUBSYSTEM NAME : 
 * FILE NAME      : .java
 * DESCRIPTION    : 
 *
 * VERSION NO     author           date        content  -> info
 * ----------------------------------------------------------------------------
 *  1.0           Kong,Byungil     2017. 2. 8.     init
 *****************************************************************************/
package com.je.travel.controller;

import com.je.travel.Domain.Location;
import com.je.travel.service.LocationInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LocationController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private LocationInfoService locationInfoService;


    @RequestMapping(value="/travel/main", method= RequestMethod.GET)
    public String travelMain(Model model) {

        logger.debug("call : /travel/main ~~~");
        List<Location> locationList = new ArrayList<>();

        try {
            locationList = locationInfoService.getLocationInfoAll();
        } catch (Exception e) {
            logger.error("error : " + e);
        }
        model.addAttribute("locationList", locationList);

        return "/travel/main";
    }

}
