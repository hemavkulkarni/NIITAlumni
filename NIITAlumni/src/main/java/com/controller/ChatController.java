package com.controller;
import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.Message;
import com.dto.OutputMessage;


@Controller
public class ChatController {
	@RequestMapping("/Chat")
	/*@RequestMapping(method = RequestMethod.GET)*/
  public ModelAndView viewApplication() {
		ModelAndView model=new ModelAndView("chat");
    return model;
  }
    
  @MessageMapping("/chat")
  @SendTo("/topic/message")
  public OutputMessage sendMessage(Message message) {
    return new OutputMessage(message, new Date());
  }
}