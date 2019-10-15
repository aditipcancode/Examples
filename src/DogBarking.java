public class DogBarking {
    public static void main(String[] args) {


        System.out.println(shouldWakeUp(true,1));

        System.out.println(shouldWakeUp(false,2));

        System.out.println(shouldWakeUp(true,24));

        System.out.println(shouldWakeUp(true,-1));
    }

    public static boolean shouldWakeUp(boolean barking, int hoursOfDay) {
       boolean IsWakeUpTime=false;
        if(barking && hoursOfDay>0 && hoursOfDay < 23)
       {
           if (hoursOfDay < 8 || hoursOfDay > 22) {
               IsWakeUpTime= true;
           }
           else if (hoursOfDay < 0 || hoursOfDay > 23) {
               IsWakeUpTime= false;
           }
       }
        return IsWakeUpTime;
    }
}
