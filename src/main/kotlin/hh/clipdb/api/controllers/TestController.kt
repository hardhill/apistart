package hh.clipdb.api.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.vesalainen.gpx.GPX
import java.io.File

@RestController
@RequestMapping("")
class TestController {
    @RequestMapping("/test")
    fun Test():String{

        val parser = GPX(File("run.gpx"))
        val creator = parser.gpx.value.creator
        val trk = parser.gpx.value.trk.size



        return "Test: OK! $trk"
    }
}