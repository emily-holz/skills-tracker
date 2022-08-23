package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping
public class SkillsControllers {

    @GetMapping("")
    public String homePageText() {
        return "<html>" +
                "<body> " +
                "<h1> Skills Tracker </h1>" +
                "<h2> We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("")
    public String homePageWithQueryParam(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice){
        return "<html>" +
                "<body> " +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>"+ firstChoice +"</li>" +
                "<li>"+secondChoice+"</li>" +
                "<li>"+thirdChoice+"</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String form(){
        return "<html>" +
                "<body>" +
                "<form action = '/' method = 'post'>" +
                "<div>Name:</div>" + //submit a post request to "localhost:8080/"
                "<input type = 'text' name = 'name' value = 'Enter your name'>" +
                "<div>My favorite language:</div>" +
                "<select name = 'firstChoice'>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "</select>" +
                "<div>My second favorite language:</div>" +
                "<select name = 'secondChoice'>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "</select>" +
                "<div>My third favorite language:</div>" +
                "<select name = 'thirdChoice'>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "</select>" +
                "<div>" +
                "<input type = 'submit' value = 'Submit'>" +
                "</div>" +
                "</form>" +
                "</body>" +
                "</html>";

    }


}
