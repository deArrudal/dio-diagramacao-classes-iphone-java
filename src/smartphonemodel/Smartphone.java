package smartphonemodel;

public class Smartphone implements MusicPlayer, Telephone, WebBrowser {
    // class attributes.
    public boolean isRinging = false;
    public boolean isPlaying = false;
    public boolean haveVoicemail = false;
    public boolean haveTab = false;

    @Override
    public void openPage(String url) {
        newTab();
        System.out.println("Redirecting to " + url);
    }

    @Override
    public void newTab() {
        System.out.println("Opening new tab");
        haveTab = true;
    }

    @Override
    public void closeTab() {
        if (haveTab) {
            System.out.println("Closing tab");
            haveTab = false;
        } else {
            System.out.println("No tabs open");
        }
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing page");
    }

    @Override
    public void makeCall(int number) {
        System.out.println("Calling " + number);
    }

    @Override
    public void receiveCall() {
        if (isRinging) {
            System.out.println("Answering");
            isRinging = false;
        } else {
            System.out.println("You have a new voicemail");
            haveVoicemail = true;
        }
    }

    @Override
    public void checkVoicemail() {
        makeCall(222); // call voicemail provider.
        haveVoicemail = false;
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music");
        isPlaying = true;
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausing music");
        isPlaying = false;
    }

    @Override
    public void selectMusic(String name) {
        System.out.println("Opening " + name);
        playMusic();
    }
}
