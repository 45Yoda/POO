
public class MusicaComVideo extends Faixa{
    private String video;
    
    public Musica(Faixa f, string video){
        super(f);
        this.video = video;
    }
    
    public void play(){
        super.play();
        System.video.out(this.video);
    }
    
    
}
