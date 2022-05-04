package hh.apistart.api.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("")
class TestController {
    @RequestMapping("/test")
    fun Test():String{
        return "Test: OK!"
    }
}