package com.je.travel.repository.sql

/*****************************************************************************
 * PROJECT NAME   : JEWebApp
 * SUBSYSTEM NAME : 
 * FILE NAME      : LocationInfo.groovy
 * DESCRIPTION    : 
 *
 * VERSION NO     author           date        content  -> info
 * ----------------------------------------------------------------------------
 *  1.0           Kong,Byungil     2017. 2. 7.     init
 *****************************************************************************/
class LocationInfoQuery {

    public static String LOCATION_MAIN_INFO_ALL = """
        SELECT  id, location_name, display_name, title, lat, lng, create_date, update_date
          FROM  location_main
    """;
}
