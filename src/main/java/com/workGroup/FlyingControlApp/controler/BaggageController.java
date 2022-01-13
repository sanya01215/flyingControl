package com.workGroup.FlyingControlApp.controler;

import com.workGroup.FlyingControlApp.service.BaggageService;
import com.workGroup.FlyingControlApp.service.impl.BaggageServiceImpl;
import com.workGroup.FlyingControlApp.service.impl.TicketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flycontrolapp/api/v1/baggage")
public class BaggageController {
    private BaggageServiceImpl baggageService;

    public BaggageController(@Autowired BaggageServiceImpl baggageService) {
        this.baggageService = baggageService;
    }

    @GetMapping("/checkin/{baggageId}/{destinationId}")
    public boolean baggageCheckIn(@PathVariable Long baggageId, @PathVariable Long destinationId) {
        return baggageService.baggageCheckIn(baggageId, destinationId);
    }
}
