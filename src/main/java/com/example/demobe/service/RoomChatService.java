package com.example.demobe.service;

import com.example.demobe.RoomChat;
import com.example.demobe.repository.IRoomChatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomChatService implements IRoomChatService {
@Autowired
IRoomChatRepo iRoomChatRepo;
    @Override
    public void save(RoomChat romChatEntity) {
        iRoomChatRepo.save(romChatEntity);
    }

    @Override
    public RoomChat findRomChat(String person1, String person2) {
         return iRoomChatRepo.findChatRom(person1,person2);
    }


}
