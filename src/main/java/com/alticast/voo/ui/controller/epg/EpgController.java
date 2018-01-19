package com.alticast.voo.ui.controller.epg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/epg")
@Controller
public class EpgController {
    private static final Logger log = LoggerFactory.getLogger(EpgController.class);

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String getList() {
        return "/epg/schedule";
    }

    @RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
    public String detailView(@PathVariable Integer id) {
        log.info(id+"");
        return "/epg/detail";
    }
}
