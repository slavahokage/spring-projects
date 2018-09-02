package by.itstep;

import by.itstep.Messenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    Messenger messenger;

    @Autowired
    MapsService mapsService;

    @Autowired
    CallService callService;

    public void makeFun(){
        messenger.sendMessage("Wassuup");
    }

    public void go(String a, String b){
        mapsService.findRoute(a,b);
    }

    public void call(String friendName){
        callService.call(friendName);
    }

}
