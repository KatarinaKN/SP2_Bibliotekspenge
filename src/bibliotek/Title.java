package bibliotek;

public abstract class Title {

    private String title;
    private String literatureType;
    private static final double RATE = 0.067574;

    public Title(String title, String literatureType){
        this.title = title;
        this.literatureType = literatureType;
    }

    public double calculateRoyalties(){
        return calculatePoints() * RATE;
    }

    protected double convertLiteratureType(){
        if(literatureType.equals("BI")){
            return 3;
        }
        else if(literatureType.equals("TE")){
            return 3;
        }
        else if(literatureType.equals("LYRIK")){
            return 6;
        }
        else if(literatureType.equals("SKØN")){
            return 1.7;
        }
        else if(literatureType.equals("FAG")){
            return 1;
        }
        else{
            return 0;
        }
    }


    protected abstract double calculatePoints();
}
