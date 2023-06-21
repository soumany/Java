

class Rectangle{
    float width;
    float height;

    // Parameterized constructor width & constructor height
    Rectangle(float width, float height){
        this.width = width;
        this.height = height;
    }

    //method to culculate Area of Rectangle
    float getArea(){
        return width * height;
    }

    //method to culculate Perimeter of Rectangle
    float getPerimeter(){
        return 2*width + 2*height;
    }
}

class Exercise1_2 {
    public static void main(String[] args){
        
        Rectangle[] rectangle = new Rectangle[2];
        rectangle[0] = new Rectangle(4, 40);
        rectangle[1] = new Rectangle(3.5f, 35.7f);

        System.out.println();
        
        for(int i=0; i<rectangle.length; i++){
            System.out.println("--------> Rectangle " + (i+1) + " <--------");
            System.out.println("Width of Rectangle " + (i+1) + " = " + rectangle[i].width + "cm");
            System.out.println("Height of Rectangle " + (i+1) + " = "+ rectangle[i].height  + "cm");
            System.out.println("Area of Rectangle " + (i+1) + "= "+ rectangle[i].getArea() + "cm^2");
            System.out.println("Perimeter of Rectangle " + (i+1) + "= "+ rectangle[i].getPerimeter() + "cm");
        }

        System.out.println();
    }
}
