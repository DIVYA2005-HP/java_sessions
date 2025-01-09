public class test {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Student std1 = new Student();
        System.out.println(std1.name);
        std1.name="divya";
        std1.department="cse";
        System.out.println(std1);
        std1.sleeping();
        std1.walking();
        std1.talking();
        
    }
    
}
