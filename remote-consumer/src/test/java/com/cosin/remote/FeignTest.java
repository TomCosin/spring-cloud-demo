package com.cosin.remote;

import com.cosin.remote.interfaces.RemoteConsumer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = ConsumerApplication.class)
@RunWith(SpringRunner.class)
public class FeignTest {

    @Autowired
    private RemoteConsumer remoteConsumer;

    @Test
    public void feignTest(){
        String s = remoteConsumer.demo();
        System.out.println(s);
    }
}
