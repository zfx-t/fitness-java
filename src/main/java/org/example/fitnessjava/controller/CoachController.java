package org.example.fitnessjava.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.example.fitnessjava.pojo.Coach;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/coach")
public class CoachController {

    @GetMapping("/recommended")
    @Operation(summary = "获取推荐教练")
    public ArrayList<Coach> recommendedCoaches() {
        return null;
    }

    @GetMapping()
    @Operation(summary = "获取指定类型教练,all|today|mine")
    public ArrayList<Coach> coaches(
            @RequestParam(required = true,defaultValue = "all") String tabType,
            @RequestParam(required = false) String userId
    ) {

        return null;
    }

}
