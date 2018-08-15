package ru.gvg.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gvg.spring.dto.DateDTO;
import ru.gvg.spring.dto.ResultDTO;

import java.util.Date;

/**
 * @author Valeriy Gyrievskikh
 * @since 15.08.2018.
 */
@RestController
@RequestMapping("api/clock")
public class ClockController {
    @RequestMapping(value="/ping", produces = "application/json")
    public ResultDTO ping(){return new ResultDTO();}
    @RequestMapping(value="/date", produces = "application/json")
    public DateDTO date(){return new DateDTO(new Date());}
}
