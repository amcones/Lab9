public class People{
    protected double height;
    protected double weight;
    public People(double height,double weight)
    {
        this.weight=weight;
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void speakHello()
    {
        System.out.println("yayayay");
    }
    public void averageHeight()
    {
        height=173;
        System.out.println("average height :"+height+"cm");
    }
    public void averageWeight()
    {
        weight=70;
        System.out.println("average height :"+weight+"kg");
    }
}
class ChinaPeople extends People{
    public ChinaPeople(double height, double weight) {
        super(height, weight);
    }

    public void Gongfu()
    {
        System.out.println("坐如钟，站如松，睡如弓");
    }
    @Override
    public void speakHello()
    {
        System.out.println("你好");
    }
    @Override
    public void averageHeight()
    {
        System.out.println("中国人的平均身高是 :"+height+"厘米");
    }
    @Override
    public void averageWeight()
    {
        System.out.println("中国人的平均体重是 :"+weight+"公斤");
    }
}
class AmericanPeople extends People{

    public AmericanPeople(double height, double weight) {
        super(height, weight);
    }
    public void Boxing(){
        System.out.println("straight punch  Dash Ground Straight");
    }
    @Override
    public void speakHello(){
        System.out.println("How do you do");
    }
    public void averageHeight(){
        System.out.println("American average height :"+height+" cm");
    }
    @Override
    public void averageWeight(){
        System.out.println("American average weight :"+weight+"kg");
    }

}
class BeijingPeople extends ChinaPeople{

    public BeijingPeople(double height, double weight) {
        super(height, weight);
    }
    public void beijingOpera(){
        System.out.println("京剧术语");
    }
    @Override
    public void speakHello(){
        System.out.println("您好，吃了吗？");
    }
    @Override
    public void averageHeight(){
        System.out.println("北京人的平均身高是 :"+height+" 厘米");
    }
    @Override
    public void averageWeight(){
        System.out.println("北京人的平均体重是 :"+weight+" 公斤");
    }
}
class Main {

    public static void main(String[] args) {
	    ChinaPeople chinaPeople=new ChinaPeople(173.0,67.34);
        chinaPeople.speakHello();
        System.out.println(chinaPeople.getHeight());
        System.out.println(chinaPeople.getWeight());
        chinaPeople.Gongfu();
        AmericanPeople americanPeople=new AmericanPeople(188.0,80.23);
        americanPeople.speakHello();
        System.out.println(americanPeople.getHeight());
        System.out.println(americanPeople.getWeight());
        americanPeople.Boxing();
        BeijingPeople beijingPeople=new BeijingPeople(167.0,68.5);
        beijingPeople.speakHello();
        System.out.println(beijingPeople.getHeight());
        System.out.println(beijingPeople.getWeight());
        beijingPeople.beijingOpera();
    }
}
