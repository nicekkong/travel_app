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
package com.je.travel.service;

import com.je.travel.Domain.Location;
import com.je.travel.repository.jt.LocationInfoJtRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationInfoService {

    @Autowired
    private LocationInfoJtRepository locationInfoJtRepository;

    private final static Logger logger = LoggerFactory.getLogger(LocationInfoService.class);

    public List<Location> getLocationInfoAll() throws Exception {

        List<Location> locations = new ArrayList<>();
        locations = locationInfoJtRepository.serchLocationInfoAll();
        return locations;
    }



}
