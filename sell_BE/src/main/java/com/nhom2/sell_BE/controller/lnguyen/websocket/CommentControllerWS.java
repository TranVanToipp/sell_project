package com.nhom2.sell_BE.controller.lnguyen.websocket;

import com.nhom2.sell_BE.payload.response.lnguyen.CommentResponse;
import com.nhom2.sell_BE.services.lnguyen.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CommentControllerWS {

    @Autowired
    private CommentService commentService;

    @MessageMapping("/comments")
    @SendTo("/topic/comments")
    public List<CommentResponse> getComment(@Payload String productId){
        return commentService.getAllCommentByProduct(productId);
    }

}
