class AreaCalculator{
    static void area(int _length, int _breadth){
            int length = _length;
            int breadth = _breadth;
            return "Area of Rectangle:"+length*breadth;
    }
    
    static void area(int _side){
            int side = _side;
            return "Area of Square:"+side*side;
    }
    
    static void area(int _base,int _height){
            int base = _base;
            int height = _height;
            return "Area of Triangle:"+(1/2*(base*height));
    }
    
    static void area(double _radius){
            int radius = _radius;
            return "Area of Circle:"+(PI*radius*radius);
    }

}
