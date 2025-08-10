import java.util.*;
class Main {
    public static void main(String[] args) {
        int side= 14;
        int area_sq= side*side;
        System.out.println("1. Thea area of square is: "+ area_sq);

        int length= 15;
        int breadth= 16;
        int area_rect= length*breadth;
        System.out.println("2. Thea area of rectangle is: "+ area_rect);

        int height= 12;
        int area_tri= height*height;
        System.out.println("3. Thea area of triangle is: "+ area_tri);

        int a= 14;
        int area_cube= 6*a*a;
        System.out.println("4. Thea surface area of cube is: "+ area_cube);

        int l= 14, b=3, h=5;
        int area_cu= 2*(l*b + b*h + h*l);
        System.out.println("5. Thea surface area of cuboid is: "+ area_cu);

        int radius= 4;
        int he= 6;
        double area_cyli= 2*(3.14)*radius*he ;
        System.out.println("6. Thea curved surface area of square is: "+ area_cyli);

        int r = 14;
        int area_sp= r*r ;
        System.out.println("7. Thea area of sphere is: "+ area_sp);

        int height_= 14;
        int p1=4, p2=5;
        double area_trap= 0.5*(p1+p2)*height_;
        System.out.println("8. Thea area of trapezium is: "+ area_trap);

        int basearea= 4;
        int baseperi= 6;
        int hei_ght= 7;
        int area_prism= (2*basearea)+(baseperi+hei_ght);
        System.out.println("9. Thea area of prism is: "+ area_prism);

        int base= 14;
        int heig_ht= 30;
        int area_para= base*heig_ht;
        System.out.println("10. Thea area of parallelogram is: "+ area_para);

        int radi= 14;
        int leng_th= 30;
        double area_cone= 3.14*radi*(radi+leng_th);
        System.out.println("11. Thea total surface area of cone is: "+ area_cone);

        int radii= 14;
        double vol_sp= (4/3)*(3.14)*radii*radii*radii;
        System.out.println("12. Thea volume of sphere is: "+ area_para);

        int a_ = 14;
        int vol_cube= a*a*a;
        System.out.println("13.Thea volume of cube is: "+ vol_cube);

        int l_= 14, b_=3, h_=5;
        int vol_cu= l_*b_*h_;
        System.out.println("14. Thea volume of cuboid is: "+ vol_cu);

    }
}