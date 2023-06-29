package Interface;

public class CDplayer implements Media{
    @Override
    public void start() {
        System.out.println("Music Starts");
    }

    @Override
    public void end() {
        System.out.println("Music Ends");
    }
}
