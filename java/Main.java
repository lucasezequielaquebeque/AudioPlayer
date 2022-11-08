abstract class Audio
{
    protected boolean isOpen;
    private boolean isPlaying;
    private float volume;

    public abstract void open(String filePath);

    public void play()
    {
        if(isOpen) isPlaying = true;
        System.out.println("The audiofile is playing.");
    }
    public void stop()
    {
        if(isPlaying) this.isPlaying = false;
        System.out.println("The audiofile is stopped.");
    }
    public void setVolume(float value)
    {
        this.volume = value;
    }
    public float getVolume()
    {
        return this.volume;

    }
}
class VLCPlayer extends Audio
{
    public VLCPlayer()
    {
        System.out.println("The VLC constructor was invoked.");
    }
    public void open(String filePath)
    {
        isOpen = true;
        System.out.println("The audiofile: " + filePath + " is open.");
    }
    public void setPitch(float value)
    {
        this.pitch = value;
        System.out.println("The pitch value is: " + this.pitch);
    }

    private float pitch;
}
class Winamp extends Audio
{
    public Winamp()
    {
        System.out.println("The Winamp constrcutor was invoked.");
    }
    public void open(String filePath)
    {
        isOpen = true;
        System.out.println("The audiofile: " + filePath + " is open.");
    }
}
/**
 * Main
 */
public class Main {

    public static void main(String args[])
    {
        VLCPlayer vlc = new VLCPlayer();
        vlc.open("./resources/orchestral.ogg");
        vlc.play();
        vlc.setVolume(13);

        System.out.println("");
        System.out.println("");

        Winamp winamp = new Winamp();
        winamp.open("./resources/orchestral.ogg");
        winamp.play();
        winamp.setVolume(13);
    }
}
