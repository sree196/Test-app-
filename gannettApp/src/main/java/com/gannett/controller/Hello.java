package com.gannett.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class Hello {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    @ApiOperation(value = "Get ", notes = "The operations allows to get hello world ")
    public ResponseEntity<String> getmessage(@RequestParam(value ="uppercase", required = false)  @ApiParam(required = false, value = "uppercase") String uppercase
    ,@RequestParam(value ="reversed", required = false)  @ApiParam(required = false, value = "reversed") String reversed) {

        String res="hello world";

        if(null!=uppercase && uppercase.equals("true")){
            res=res.toUpperCase();
        }
        if(null!=reversed && reversed.equals("true")){
            res=new StringBuffer(res).reverse().toString();
        }
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<String>(res, responseHeaders, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    @ApiOperation(value = "Get ", notes = "The operations allows to get hello world ")
    public ResponseEntity<String> getmessagehello(@RequestParam(value ="uppercase", required = false)  @ApiParam(required = false, value = "uppercase") String uppercase
            ,@RequestParam(value ="reversed", required = false)  @ApiParam(required = false, value = "reversed") String reversed) {
        String res="hello";
        if(null!=uppercase && uppercase.equals("true")){
            res=res.toUpperCase();
        }
        if(null!=reversed && reversed.equals("true")){
            res=new StringBuffer(res).reverse().toString();
        }
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<String>(res, responseHeaders, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/world")
    @ApiOperation(value = "Get ", notes = "The operations allows to get hello world ")
    public ResponseEntity<String> getmessageworld(@RequestParam(value ="uppercase", required = false)  @ApiParam(required = false, value = "uppercase") String uppercase
            ,@RequestParam(value ="reversed", required = false)  @ApiParam(required = false, value = "reversed") String reversed) {
        String res="world";
        if(null!=uppercase && uppercase.equals("true")){
            res=res.toUpperCase();
        }
        if(null!=reversed && reversed.equals("true")){
            res=new StringBuffer(res).reverse().toString();
        }
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<String>(res, responseHeaders, HttpStatus.OK);
    }
}
