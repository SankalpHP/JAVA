package Interface;

public class NIceCar {

    private Engine engine;
    private Media player = new CDplayer();

    public NIceCar(Engine engine, Media player) {
        this.engine = engine;
        this.player = player;
    }

    public NIceCar(){
       engine = new PowerEngine();
    }

    public NIceCar(Engine engine){
        engine = new ElectricEngine();
    }

    public void start(){
        engine.start();
    }

    public void end(){
        engine.end();
    }

    public void StartMusic(){
        player.start();
    }

    public void EndsMusic(){
        player.end();
    }

    public void UpGradeEngine(){
        this.engine = new ElectricEngine();
    }
}
