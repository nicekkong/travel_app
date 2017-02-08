/*****************************************************************************
 * PROJECT NAME   : JEWebApp
 * SUBSYSTEM NAME : 
 * FILE NAME      : .java
 * DESCRIPTION    : 
 *
 * VERSION NO     author           date        content  -> info
 * ----------------------------------------------------------------------------
 *  1.0           Kong,Byungil     2017. 2. 7.     init
 *****************************************************************************/
package com.je.travel.repository.jt;

import com.je.travel.Domain.Location;
import com.je.travel.repository.sql.LocationInfoQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class LocationInfoJtRepository {

    private Logger logger = LoggerFactory.getLogger(LocationInfoJtRepository.class);

    @Autowired
    private NamedParameterJdbcTemplate jt;



    public List<Location> serchLocationInfoAll() {

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("", "");

        return jt.query(LocationInfoQuery.LOCATION_MAIN_INFO_ALL, param, this::infoAllmapRow);
    }
    private Location infoAllmapRow(ResultSet rs, int rownum) throws SQLException {

        Location location = new Location();

        location.setId(rs.getLong("id"));
        location.setLocationName(rs.getString("location_name"));
        location.setDisplayName(rs.getString("display_name"));
        location.setTitle(rs.getString("title"));
        location.setLat(rs.getLong("lat"));
        location.setLng(rs.getLong("lng"));
        location.setCreateDate(rs.getTimestamp("create_date"));
        location.setUpdateDate(rs.getTimestamp("update_date"));

        return location;
    }
}
