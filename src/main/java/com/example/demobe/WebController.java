package com.example.demobe;

import com.example.demobe.service.IRoomChatService;
import com.example.demobe.service.RoomChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class WebController {
    //    private String userNameFriend;
//    private Long idRomChat;
//    RoomChat romChat;
    @Autowired
    SimpMessagingTemplate simpMessagingTemplate;
//    @Autowired
//    RoomChatService iRoomChatService;

    @MessageMapping("/hello")
    public void greeting(User user) throws Exception {
        simpMessagingTemplate.convertAndSend("/topic/public", new Helo(user.getName() + " : " + user.getMessage()));
    }
}
//    @MessageMapping("/chatVsUser")
//    public RoomChat chatVsUser(@Payload RoomChat user) {
//        this.userNameFriend = user.getPerson2();
//        romChat = iRoomChatService.findRomChat(user.getPerson1(),user.getPerson2());
//        this.idRomChat = romChat.getId();
//        System.out.println("------------------------------");
//        System.out.println(user);
//        System.out.println("------------------------------");
//        return user;
//    }

//    @GetMapping("/findRomChat/{person1}/{person2}")
//    public ResponseEntity<String> findRomChat(@PathVariable String person1, @PathVariable String person2) {
//        RoomChat romChat = iRoomChatService.findRomChat(person1,person2);
//        return new ResponseEntity(romChat.getId(), HttpStatus.OK);
//    }
//
//    @GetMapping("/addRomchat/{person1}/{person2}")
//    public ResponseEntity addRomchat(@PathVariable String person1,@PathVariable String person2) {
//        RoomChat romChat = iRoomChatService.findRomChat(person1,person2);
//        if (romChat == null){
//            romChat = new RoomChat();
//            romChat.setPerson1(person1);
//            romChat.setPerson2(person2);
//            iRoomChatService.save(romChat);
//        }
//        return new ResponseEntity(HttpStatus.OK);
//    }


