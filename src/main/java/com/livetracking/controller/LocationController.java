package com.livetracking.controller;

import com.livetracking.dto.LocationCoordinate;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class LocationController {

    @MessageMapping("/location/{topic}")
    @SendTo("/location/{topic}")
    public String locationTracking(@DestinationVariable("topic") String topic, LocationCoordinate coordinate) {
        return "Delivery man reached at: " + coordinate;
    }
}
