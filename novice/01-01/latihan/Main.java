public class Main{
    public static void main(String[] args) {
        // percabangan / mengatur alur program
        int a = 5;
        if (a == 5){
            System.out.println("Benar");
        }else if(a==3){
            System.out.println("Salah");
        }else{
            System.out.println("Salah semua");
        }

        // peruangan
        for (int i =0; i < 10; i+=1 ){
            System.out.println("Tampilin 10 kali");
        }
        int[] b = {1,2,3,4,5};
        System.out.println(b[1]);
    }
}
