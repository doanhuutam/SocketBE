package com.example.demobe.service;

import com.example.demobe.RoomChat;

public interface IRoomChatService {
    void save(RoomChat romChatEntity);
    RoomChat findRomChat(String person1, String person2);
}
