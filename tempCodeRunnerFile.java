static void leapYear(int y){
            if(y%400==0 ){
                System.out.print("Leap Year");
            }else if(y%100==0){
                System.out.print("Not  Leap Year");
            }else if(y%4==0){
                System.out.print("Leap Year");
            }else{
                System.out.print("Not Leap Year");
            }
        }
