package org.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/project-one")
public class ProjectOneController {

        @GetMapping(value = "/hello-project-one")
        public ResponseEntity<String> projectOne(){
            return new ResponseEntity<>("Hello, i'm project one", HttpStatus.OK);
        }
}
