
class AreaFind{
    void add(int a,int b){
        //  int b=5;
        System.out.println(a+b);
    }

   float Circle(int radius){
        float pi=3.14f;
        float area=pi*(radius*radius);
       // System.out.println(area);
       return area;
   }
}



public class Area {
    public static void main(String args[]){

        AreaFind obj =new AreaFind();
        obj.add(78,92);
        obj.add(12,56);
        obj.add(10,30);
        //calling Circle() method here
        obj.Circle(10);//314.0
        obj.Circle(12);

        System.out.println("hello");


    }


}









