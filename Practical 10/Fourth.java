class AreaCalculator{

    static int area(int _length, int _breadth){
            int length = _length;
            int breadth = _breadth;
            return length*breadth;
    }
    
    static int area(int _side){
            int side = _side;
            return side*side ;
    }
    
    static float area(float _half, int _base,int _height){
            float half = _half;
            int base = _base;
            int height = _height;
            return half*base*height;
    }
    
    static double area(double _radius){
            double radius = _radius;
            return Math.PI*radius*radius;
    }
    
    public static void main(String[] args){
            System.out.println("Area of Rectangle:"+area(3,6));
            System.out.println("Area of Square:"+area(5));
            System.out.println("Area of Triangle:"+area(0.5F,7,3));
            System.out.println("Area of Circle:"+area(5.5F));
    }

}
