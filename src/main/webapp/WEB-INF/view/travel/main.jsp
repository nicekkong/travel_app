<%--================================================================================
 * PROJECT NAME   : 
 * SUBSYSTEM NAME : 
 * FILE NAME      : 
 * DESCRIPTION    : 
 *
 * VERSION NO     author           date        content  -> info
 * ---------------------------------------------------------------------------------
      1.0        1001857           2017. 2. 8.     init
=================================================================================--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>여행을 떠나요~</title>
    <link rel="stylesheet" href="https://developers.google.com/maps/documentation/javascript/demos/demos.css">
</head>
<body>
    <c:forEach var="location" items="${locationList}">
        <ul>
            <li>id : ${location.id} </li>
            <li>locationName : ${location.locationName} </li>
            <li>displayName : ${location.displayName} </li>
            <li>title : ${location.title} </li>
            <li>lat : ${location.lat} </li>
            <li>lng : ${location.lng} </li>
        </ul>
    </c:forEach>
    <div id="map"></div>
    <script>
        function initMap() {
            var myLatLng = {lat: -25.363, lng: 131.044};

            // Create a map object and specify the DOM element for display.
            var map = new google.maps.Map(document.getElementById('map'), {
                center: myLatLng,
                scrollwheel: false,
                zoom: 4
            });

            // Create a marker and set its position.
            var marker = new google.maps.Marker({
                map: map,
                position: myLatLng,
                title: "nicekkong's World!"
            });
        }

    </script>
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyC4Eqxwa__PIAEpcMJrvL0tefDJdzWRFmc&callback=initMap"
            async defer></script>




</body>
</html>
