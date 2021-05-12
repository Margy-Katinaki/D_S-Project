import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;

public class VideoFile implements  Serializable {
    private String videoName;
    private String channelName;
    private String dateCreated;
    private String length;
    private String framerate;
    private String frameWidth;
    private String frameHeight;
    private ArrayList<String> associatedHashtags;
    private byte[] videoFileChunk;


    public VideoFile(String videoName, String channelName, String dateCreated, String length, String framerate, String frameWidth, String frameHeight,
                    ArrayList<String> associatedHashtags, byte[] videoFileChunk){
        this.videoName = videoName;
        this.channelName = channelName;
        this.dateCreated = dateCreated;
        this.length = length;
        this.framerate = framerate;
        this.frameWidth = frameWidth;
        this.frameHeight = frameWidth;
        this.associatedHashtags = associatedHashtags;
        this.videoFileChunk = videoFileChunk;
    }
    //ACCESSORS
    public String getVideoName() {
        return videoName;
    }

    public String getChannelNameName() {
        return channelName;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public String getLength() {
        return length;
    }

    public String getframerate() {
        return framerate;
    }

    public String getFrameWidth() {
        return frameWidth;
    }

    public String getFrameHeight() {
        return frameHeight;
    }

    public ArrayList<String> getAssociatedHashtags(){
        return associatedHashtags;
    }

    public byte[] getvideoFileChunk() {
        return videoFileChunk;
    }



    //MUTATORS
    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public void setFramerate(String framerate) {
        this.framerate = framerate;
    }

    public void setFrameWidth(String frameWidth){
        this.frameWidth = frameWidth;
    }

    public void setFrameHeight(String frameHeight){
        this.frameHeight = frameHeight;
    }

    public void setAssociatedHashtags(ArrayList<String> associatedHashtags){
        this.associatedHashtags = associatedHashtags;
    }

    public void setVideoFileChunk(byte[] videoFileChunk){
        this.videoFileChunk = videoFileChunk;
    }

}
