package com.test;


import com.gannett.controller.Hello;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)

public class GannettTestApi {

    @Mock
    Hello helloc;

    @Test
    public void checkHelloworld1() {
        HttpHeaders responseHeaders = new HttpHeaders();

        when(helloc.getmessage("false","false")).thenReturn
                (new ResponseEntity<String>("hello world", responseHeaders, HttpStatus.OK));

        assertEquals("hello world",helloc.getmessage("false","false").getBody());
    }


    @Test
    public void checkHelloworld2() {
        HttpHeaders responseHeaders = new HttpHeaders();

        when(helloc.getmessage("true","false")).thenReturn
                (new ResponseEntity<String>("HELLO WORLD", responseHeaders, HttpStatus.OK));

        assertEquals("HELLO WORLD",helloc.getmessage("true","false").getBody());
    }

    @Test
    public void checkHelloworld3() {
        HttpHeaders responseHeaders = new HttpHeaders();

        when(helloc.getmessage("true","true")).thenReturn
                (new ResponseEntity<String>("DLROW OLLEH", responseHeaders, HttpStatus.OK));

        assertEquals("DLROW OLLEH",helloc.getmessage("true","true").getBody());
    }

    @Test
    public void checkHelloworld4() {
        HttpHeaders responseHeaders = new HttpHeaders();

        when(helloc.getmessage("false","true")).thenReturn
                (new ResponseEntity<String>("dlrow olleh", responseHeaders, HttpStatus.OK));

        assertEquals("dlrow olleh",helloc.getmessage("false","true").getBody());
    }



    @Test
    public void checkHello1() {
        HttpHeaders responseHeaders = new HttpHeaders();

        when(helloc.getmessagehello("false","false")).thenReturn
                (new ResponseEntity<String>("hello", responseHeaders, HttpStatus.OK));

        assertEquals("hello",helloc.getmessagehello("false","false").getBody());
    }
    Test
    public void checkHello2() {
        HttpHeaders responseHeaders = new HttpHeaders();

        when(helloc.getmessagehello("true","false")).thenReturn
                (new ResponseEntity<String>("HELLO", responseHeaders, HttpStatus.OK));

        assertEquals("HELLO",helloc.getmessagehello("true","false").getBody());
    }
    @Test
    public void checkHello3() {
        HttpHeaders responseHeaders = new HttpHeaders();

        when(helloc.getmessagehello("true","true")).thenReturn
                (new ResponseEntity<String>("OLLEH", responseHeaders, HttpStatus.OK));

        assertEquals("OLLEH",helloc.getmessagehello("true","true").getBody());
    }
    @Test
    public void checkHello4() {
        HttpHeaders responseHeaders = new HttpHeaders();

        when(helloc.getmessagehello("false","true")).thenReturn
                (new ResponseEntity<String>("olleh", responseHeaders, HttpStatus.OK));

        assertEquals("olleh",helloc.getmessagehello("false","true").getBody());
    }
    @Test
    public void checkworld1() {
        HttpHeaders responseHeaders = new HttpHeaders();

        when(helloc.getmessageworld("false","false")).thenReturn
                (new ResponseEntity<String>("world", responseHeaders, HttpStatus.OK));

        assertEquals("world",helloc.getmessageworld("false","false").getBody());
    }


    @Test
    public void checkworld2() {
        HttpHeaders responseHeaders = new HttpHeaders();

        when(helloc.getmessageworld("true","false")).thenReturn
                (new ResponseEntity<String>("WORLD", responseHeaders, HttpStatus.OK));

        assertEquals("WORLD",helloc.getmessageworld("true","false").getBody());
    }

    @Test
    public void checkworld3() {
        HttpHeaders responseHeaders = new HttpHeaders();

        when(helloc.getmessageworld("true","true")).thenReturn
                (new ResponseEntity<String>("DLROW", responseHeaders, HttpStatus.OK));

        assertEquals("DLROW",helloc.getmessageworld("true","true").getBody());
    }

    @Test
    public void checkworld4() {
        HttpHeaders responseHeaders = new HttpHeaders();

        when(helloc.getmessageworld("false","true")).thenReturn
                (new ResponseEntity<String>("dlrow", responseHeaders, HttpStatus.OK));

        assertEquals("dlrow",helloc.getmessageworld("false","true").getBody());
    }

}
