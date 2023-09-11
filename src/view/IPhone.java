package view;

import smartphonemodel.Smartphone;

public class IPhone {
    public static void main(String[] args) {
        Smartphone iPhone = new Smartphone();

        iPhone.openPage("www.cnn.com");
        iPhone.newTab();
        iPhone.closeTab();
        iPhone.closeTab(); // no tabs open.
        iPhone.refreshPage();

        iPhone.makeCall(99999999);
        iPhone.isRinging = true;
        iPhone.receiveCall();
        iPhone.receiveCall(); // new voicemail.
        iPhone.checkVoicemail();

        iPhone.playMusic();
        iPhone.pauseMusic();
        iPhone.selectMusic("Yellow submarine");

    }
}
