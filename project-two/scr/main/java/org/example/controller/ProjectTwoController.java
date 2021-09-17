package org.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/project-two")
public class ProjectTwoController {

        @GetMapping(value = "/hello-project-two")
        public ResponseEntity<String> projectTwo(){
            return new ResponseEntity<>("Hello, i'm module two", HttpStatus.OK);
        }

}
