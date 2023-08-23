import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int month, day;
        String zodiac ="";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Month of Birth:");
        month = input.nextInt();
        System.out.print("Day of Birth:");
        day = input.nextInt();

                        if(month==3){
                            if (day >= 1 && day <= 31) zodiac = day > 20 ? "Aries" : "Pisces";
                            else isError = true;
                        }
                        else if (month==4){
                            if(day>=1 && day<=31) zodiac = day < 21 ? "Aries" : "Taurus";
                            else isError = true;
                            }
                        else if (month==5){
                            if(day>=1 && day<=31) zodiac = day < 22 ? "Taurus" : "Gemini";
                            else isError = true;
                        }
                        else if (month==6) {
                            if (day >= 1 && day <= 31) zodiac = day < 23 ? "Gemini" : "Cancer";
                            else isError = true;
                        }
                        else if (month==7){
                            if(day>=1 && day<=31) zodiac = day < 23 ? "Cancer" : "Leo";
                                else isError = true;
                        }
                        else if (month==8){
                            if(day>=1 && day<=31) zodiac = day < 23 ? "Leo" : "Virgo";
                                else isError = true;
                            }
                        else if (month==9){
                            if(day>=1 && day<=31) zodiac = day < 23 ? "Virgo" : "Libra";
                                else isError = true;
                            }
                        else if (month==10){
                            if(day>=1 && day<=31) zodiac = day < 23 ? "Libra" : "Scorpio";
                                else isError = true;
                            }
                        else if (month==11){
                            if(day>=1 && day<=31) zodiac = day < 22 ? "Scorpio" : "Sagittarius";
                                else isError = true;
                            }
                        else if (month==12){
                            if(day>=1 && day<=31) zodiac = day < 22 ? "Sagittarius" : "Capricorn";
                                else isError = true;
                            }
                        else if (month==1){
                            if(day>=1 && day<=31) zodiac = day < 22 ? "Capricorn" : "Aquarius";
                                else isError = true;
                            }
                        else if (month==2) {
                            if (day >= 1 && day <= 29) zodiac = day < 20 ? "Aquarius" : "Pisces";
                            else isError = true;
                        }
                        else isError = true;

                        if(isError) System.out.println("You entered an invalid date");
                        else System.out.println("Your Zodiac:" + zodiac);

    }
}
