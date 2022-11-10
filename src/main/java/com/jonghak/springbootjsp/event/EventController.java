package com.jonghak.springbootjsp.event;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class EventController  {

    @GetMapping("/events")
    public String getEvents(Model model) {

        Event event1 = new Event();
        event1.setName("event1");
        event1.setStarts(LocalDateTime.of(2022,11,10,15,0,0));

        Event event2 = new Event();
        event2.setName("event2");
        event2.setStarts(LocalDateTime.of(2022,11,15,13,0,0));

        List<Event> events = List.of(event1, event2);

        model.addAttribute("events", events);
        model.addAttribute("message", "welcome spring boot");

        return "events/list";
    }
}
