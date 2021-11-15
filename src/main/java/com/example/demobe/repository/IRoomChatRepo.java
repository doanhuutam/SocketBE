package com.example.demobe.repository;

import com.example.demobe.RoomChat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
@Service
public interface IRoomChatRepo extends JpaRepository<RoomChat,Long>{
    @Query("SELECT f FROM RoomChat f where (f.person1 =:person1 and f.person2 =:person2) or (f.person1 =:person2 and f.person2 =:person1)")
    public RoomChat findChatRom(@Param("person1") String person1, @Param("person2") String person2);

}
